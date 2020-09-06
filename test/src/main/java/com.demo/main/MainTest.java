package com.demo.main;

import com.demo.IRepository;
import com.demo.factory.IRepositoryFactory;
import com.demo.impl.MongoRepository;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 *  * <p><b>Desc:</b></p>
 *  * <p></p>
 *  * <p><b>Date:</b></p>
 *  * <p>2020/9/5 6:16 PM</p>
 *  * 
 *  * @author zhanghaiyan5
 *  
 */
public class MainTest {

    public static void main(String[] args) {
        IRepository helloService = IRepositoryFactory.newHelloService();
        helloService.save("name");
    }
}
