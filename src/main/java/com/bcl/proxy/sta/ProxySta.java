package com.bcl.proxy.sta;

import com.bcl.proxy.UserManager;
import com.bcl.proxy.UserManagerImpl;

/**
 * @Description: 静态代理
 */
public class ProxySta {

    public static void main(String[] args) {
        UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("001", "张三");
    }

}
