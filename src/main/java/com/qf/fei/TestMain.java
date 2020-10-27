package com.qf.fei;

import com.qf.fei.entity.User;
import com.qf.fei.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
    public static void main(String[] args) {
        //创建SqlSessionFactory对象   这不是一个会话，相当于一次连接
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                //通过本类类对象加载资源流
            TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        //默认为false 需要提交要改为true
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //获取mapper(dao)反射对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        int insert = mapper.insert(user);
        System.out.println(insert);
    }
}
