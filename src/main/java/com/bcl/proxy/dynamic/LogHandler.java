package com.bcl.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 动态创建代理对象的类
 * invocation | ɪnvə(ʊ)ˈkeɪʃ(ə)n ˌɪnvəˈkeɪʃ(ə)n | 祈祷,祷文
 */
public class LogHandler implements InvocationHandler {
    // 目标对象
    private Object targetObject;

    /**
     * 绑定关系,关联到哪个接口(与具体的实现类绑定)的那些方法将被调用时,执行invoke方法
     * 获得一个动态代理对象
     */
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        /** 该方法用于为指定类装载器,一组接口,调用处理器生成动态代理类实例
         参1:指定产生代理对象的类加载器,需要将其指定为和目标对象同一个类加载器
         参2:要实现和目标对象一样的接口,所以只需要拿到目标对象的实现接口
         参3:表名这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法 */
        // 根据传入的目标返回一个代理对象
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);
    }

    /**
     * 关联的这个实现类的方法被调用时将被执行
     * 参1:proxy表示代理
     * 参2:表示原对象被调用的方法
     * 参3:表示方法的参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        Object ret = null;
        try {
            System.out.println("原对象方法调用之前处理日志信息");
            // 调用目标方法
            ret = method.invoke(targetObject, args);
            System.out.println("原对象方法调用之后处理日志信息");
        } catch (Exception e) {
            System.out.println("出错了");
        }
        return ret;
    }
}
