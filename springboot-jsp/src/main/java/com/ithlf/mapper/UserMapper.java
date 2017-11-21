package com.ithlf.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.ithlf.entity.UserEntity;

@CacheConfig(cacheNames = "baseCache") // 读取ehcache.xml中的baseCache值
public interface UserMapper {

	@Select("select * from users where name =#{name}")
	UserEntity findName(@Param("name") String name);

	@Insert("insert into users values(4,#{name},#{age})")
	int insertUser(@Param("name") String name, @Param("age") Integer age);

	@Select("select * from users where id = #{id}")
	@Cacheable // 缓存到内存中去
	public UserEntity selectUser(@Param("id") Integer id);
}
