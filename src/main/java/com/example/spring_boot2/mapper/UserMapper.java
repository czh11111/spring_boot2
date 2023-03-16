package com.example.spring_boot2.mapper;

import com.example.spring_boot2.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个实体类既需要具有增删改查的功能又需要注册到spring中托管所有需要Repository和mapper
@Mapper
@Repository //Dao层
//这个注解代表了这是一个mybatis的mapper接口
public interface UserMapper {
    List<User> queryUserList();

    User queryUserById(int id);

    int updateUser(User user);

    int addUser(User user);

    int deleteUser(int id);

}


