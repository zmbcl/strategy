package com.bcl.proxy;

/**
 * @Description: 具体用户管理实现类
 */
public class UserManagerImpl implements UserManager {
    @Override
    public void addUser(String userID, String userName) {
        System.out.println("UserManagerImpl.addUser");
    }

    @Override
    public void delUser(String userID) {
        System.out.println("UserManagerImpl.delUser");
    }

    @Override
    public String findUser(String userID) {
        System.out.println("UserManagerImpl.findUser");
        return "张三";
    }

    @Override
    public void modifyUser(String userID, String userName) {
        System.out.println("UserManagerImpl.modifyUser");
    }
}
