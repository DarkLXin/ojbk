package decorator;
/**
 * װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬��
 * @Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿ�
 * @װ�ζ�����б�װ�ζ����ʵ��
 * @author ecar84
 *
 */
public class main {
	 public static void main(String[] args) {  
	        Sourceable source = new Source();  
	        //װ�ζ�����б�װ�ζ����ʵ��
	        Sourceable obj = new Decorator(source);  
	        obj.method();  
	    }  
}
