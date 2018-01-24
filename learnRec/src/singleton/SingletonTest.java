package singleton;

import java.util.Vector;
/**
 * 单例模式
 * @author ecar84
 *
 */
public class SingletonTest {  
	  
    private static SingletonTest instance = null;  
    private Vector properties = null;  
  
    public Vector getProperties() {  
        return properties;  
    }  
    /* 私有构造方法，防止被实例化 */ 
    private SingletonTest() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new SingletonTest();  
        }  
    }  
    /* 获取实例是判断实例是否存在 */ 
    public static SingletonTest getInstance() {  
        if (instance == null) {  
        	/*不存在时同步实例化对象*/
            syncInit();  
        }  
        return instance;  
    }  
    
    public void updateProperties() {  
        SingletonTest shadow = new SingletonTest();  
        properties = shadow.getProperties();  
    }  
}  