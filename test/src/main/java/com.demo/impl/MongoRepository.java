package com.demo.impl;

import com.demo.IRepository;

/**
 *  * <p><b>Desc:</b></p>
 *  * <p></p>
 *  * <p><b>Date:</b></p>
 *  * <p>2020/9/5 6:14 PM</p>
 *  * 
 *  * @author zhanghaiyan5
 *  
 */
public class MongoRepository implements IRepository {

    public void save(String data) { System.out.println("Save " + data + " to Mongo"); }
}
