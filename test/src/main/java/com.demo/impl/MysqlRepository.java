package com.demo.impl;

import com.demo.IRepository;

/**
 *  * <p><b>Desc:</b></p>
 *  * <p></p>
 *  * <p><b>Date:</b></p>
 *  * <p>2020/9/5 6:13 PM</p>
 *  * 
 *  * @author zhanghaiyan5
 *  
 */
public class MysqlRepository  implements IRepository {

    public void save(String data) { System.out.println("Save " + data + " to Mysql"); }
}
