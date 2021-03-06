package cn.com.itcast.mybatis.demo01.dao;

import cn.com.itcast.mybatis.demo01.pojo.User;

import java.util.List;

/**
 * 传统dao实现
 */
public interface UserDao {
    //根据id查询用户
    public User findUserById(int id) throws Exception;

    //姓名模糊查询
    public List<User> findUserByName(String userName) throws Exception;

    //添加用户 返回自增主键ID到传入对象user的id属性，将传入user对象返回
    public User insertUser(User user) throws Exception;

    //删除用户
    public void delUserById(int id) throws Exception;

    //通过id更新user
    public void updateUserById(User user) throws Exception;
}
