package com.test.api.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jiapeng 将返回的data转换成map
 */
public class DataToMap {
	public static Map stringtoMap(String data) {  
    
        Map map = new HashMap();  
  
        if (null != data) {
        	//去除的空格【replaceAll（替换前，替换后）】
        	data= data.replaceAll("\\s*", "");
        	//以分号来分隔元素
            String[] param = data.split(";");  
            for (int i = 0; i < param.length; i++) {  
                int index = param[i].indexOf(':');  
				System.out.println(index);
				map.put(param[i].substring(0, index), param[i].substring((index + 1)));
            }  

        }  
		System.out.println(map);
        return map;

    }  
	

}
