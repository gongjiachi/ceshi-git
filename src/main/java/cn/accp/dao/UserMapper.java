package cn.accp.dao;

import cn.accp.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();
    User getUserById( String id,String userName);
}
