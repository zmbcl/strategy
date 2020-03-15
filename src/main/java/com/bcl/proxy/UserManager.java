package com.bcl.proxy;

/**
 * @Description: 具体用户管理实现类
 */
public interface UserManager {
    public void addUser(String userID, String userName);

    public void delUser(String userID);

    public String findUser(String userID);

    public void modifyUser(String userID, String userName);
}
