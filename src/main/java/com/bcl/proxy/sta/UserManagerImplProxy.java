package com.bcl.proxy.sta;

import com.bcl.proxy.UserManager;

/** @Description: 代理类--代理用户管理实现类 */
public class UserManagerImplProxy implements UserManager {
    // 目标对象
    private UserManager userManager;
    // 通过构造方法传入目标对象
    public UserManagerImplProxy(UserManager userManager) {
        this.userManager = userManager;
    }
    @Override
    public void addUser(String userID, String userName) {
        try{
            // 添加打印日志的功能
            System.out.println("开始添加用户");
            userManager.addUser(userID,userName);
            System.out.println("添加成功");
        }catch (Exception e){
            System.out.println("添加失败");
        }
    }
    @Override
    public void delUser(String userID) {
        userManager.delUser(userID);
    }
    @Override
    public String findUser(String userID) {
        userManager.findUser(userID);
        return "张三";
    }
    @Override
    public void modifyUser(String userID, String userName) {
        userManager.modifyUser(userID,userName);
    }
}
