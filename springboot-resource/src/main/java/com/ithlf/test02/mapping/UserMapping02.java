package com.ithlf.test02.mapping;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapping02 {

	@Insert("insert into users values (null,#{name},#{age})")
	public int addUser02(@Param("name") String name, @Param("age") Integer age);
}
