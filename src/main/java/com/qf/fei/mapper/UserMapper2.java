package com.qf.fei.mapper;

import com.qf.fei.entity.User2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper2 {
   List<User2> selectById(@Param("Id") int Id);
}
