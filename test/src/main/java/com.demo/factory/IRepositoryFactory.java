package com.demo.factory;

import com.demo.IRepository;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 *  * <p><b>Desc:</b></p>
 *  * <p></p>
 *  * <p><b>Date:</b></p>
 *  * <p>2020/9/5 6:24 PM</p>
 *  * 
 *  * @author zhanghaiyan5
 *  
 */
public class IRepositoryFactory {


    public IRepositoryFactory() {
    }

    public static IRepository newHelloService() {
//        IRepository helloService = null;
//        ServiceLoader<HelloService> serviceLoader = ServiceLoader.load(HelloService.class);
//        Iterator<HelloService> services = serviceLoader.iterator();
//        if(services.hasNext()){
//            helloService = services.next();
//        }
//        return helloService;
//    }
        ServiceLoader serviceLoader = ServiceLoader.load(IRepository.class);
        Iterator it = serviceLoader.iterator();
        while (it != null && it.hasNext()) {
            IRepository demoService = (IRepository) it.next();
            System.out.println("class:" + demoService.getClass().getName());
            demoService.save("tom");
            return demoService;
        }
        return null;
    }
}
