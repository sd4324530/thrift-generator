package com.github.sd4324530.thriftDemo;

/**
 * @author peiyu
 */
public interface IHelloService {

    void say(String what);

    HelloBean getBean(String name, int age, boolean sex);
}
