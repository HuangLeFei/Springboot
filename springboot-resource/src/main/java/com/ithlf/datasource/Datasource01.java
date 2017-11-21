package com.ithlf.datasource;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * 
 * @describe：配置文件中新增两个数据源(数据源01，相当于在xml中配置的数据源信息) 
 * @author：HLF
 * @createTime：2017下午8:38:32 @version：v1.0 @Accesspath：
 */

@Configuration // 注册到springboot容器中
@MapperScan(basePackages = "com.ithlf.test01", sqlSessionFactoryRef = "test1SqlSessionFactory") // 扫数据源01包,引用SessionFactory工厂
public class Datasource01 {
	/**
	 * 
	 * @methodDesc: 功能描述:(配置test1数据库)
	 * @author: 余胜军
	 * @param: @return
	 * @createTime:2017年9月17日 下午3:16:44
	 * @returnType:@return DataSource
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@Bean(name = "test1DataSource")
	@Primary//配置多个数据源时，默认一个数据源加上主键注解，表示单例的
	@ConfigurationProperties(prefix = "spring.datasource.test1")
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * 
	 * @methodDesc: 功能描述:(test1 sql会话工厂)
	 * @author: 余胜军
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @createTime:2017年9月17日 下午3:17:08
	 * @returnType:@param dataSource
	 * @returnType:@return
	 * @returnType:@throws Exception SqlSessionFactory
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@Bean(name = "test1SqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		// bean.setMapperLocations(
		// new
		// PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
		return bean.getObject();
	}

	/**
	 * 
	 * @methodDesc: 功能描述:(test1 事物管理)
	 * @author: 余胜军
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @createTime:2017年9月17日 下午3:17:08
	 * @returnType:@param dataSource
	 * @returnType:@return
	 * @returnType:@throws Exception SqlSessionFactory
	 * @copyright:上海每特教育科技有限公司
	 * @QQ:644064779
	 */
	@Bean(name = "test1TransactionManager")
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "test1SqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
