package cn.accp.dao;

import cn.accp.pojo.User;
import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {
        @Test
        public void  getusers() throws Exception{
            SqlSessionFactoryBuilder ssf = new SqlSessionFactoryBuilder();
            InputStream is = Resources.getResourceAsStream("mybatis_config.xml");
            SqlSessionFactory build = ssf.build(is);
            SqlSession sqlSession = build.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
           /* List<User> userList = sqlSession.selectList("cn.accp.dao.UserMapper.getUserBuId");
            for(User u : userList){
                System.out.println(u);
            }*/
            User user = mapper.getUserById("1","");
            System.out.println(user);

        }
}
