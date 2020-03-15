package com.bcl.proxy.dynamic;

import com.bcl.proxy.UserManager;
import com.bcl.proxy.UserManagerImpl;

/**
 * 动态代理示例
 */
public class ProxyDynamic {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("001", "张三");
    }
}
