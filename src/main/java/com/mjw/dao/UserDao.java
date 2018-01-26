package com.mjw.dao;

import com.mjw.bean.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<UserEntity> searchAll();

    void add(UserEntity userEntity);
}
