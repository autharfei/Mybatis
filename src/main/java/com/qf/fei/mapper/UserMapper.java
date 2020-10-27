package com.qf.fei.mapper;

import com.qf.fei.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);
//    User selectById(@Param("userId") int userId);
}
