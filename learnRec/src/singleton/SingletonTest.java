package singleton;

import java.util.Vector;
/**
 * ����ģʽ
 * @author ecar84
 *
 */
public class SingletonTest {  
	  
    private static SingletonTest instance = null;  
    private Vector properties = null;  
  
    public Vector getProperties() {  
        return properties;  
    }  
    /* ˽�й��췽������ֹ��ʵ���� */ 
    private SingletonTest() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new SingletonTest();  
        }  
    }  
    /* ��ȡʵ�����ж�ʵ���Ƿ���� */ 
    public static SingletonTest getInstance() {  
        if (instance == null) {  
        	/*������ʱͬ��ʵ��������*/
            syncInit();  
        }  
        return instance;  
    }  
    
    public void updateProperties() {  
        SingletonTest shadow = new SingletonTest();  
        properties = shadow.getProperties();  
    }  
}  