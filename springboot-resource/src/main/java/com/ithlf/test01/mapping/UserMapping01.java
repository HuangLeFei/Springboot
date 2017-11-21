package com.ithlf.test01.mapping;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapping01 {

	@Insert("insert into users values (null,#{name},#{age})")
	public int addUser01(@Param("name") String name, @Param("age") Integer age);
}
