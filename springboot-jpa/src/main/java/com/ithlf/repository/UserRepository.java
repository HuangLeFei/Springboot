package com.ithlf.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ithlf.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable>{

}
