package adapter.classAdapter;

public class Main {
	  public static void main(String[] args) {  
		  /**
		   * ʵ����Adapter����
		   */
		  Target target =new Adapter();
		  /**
		   * ������Ҫ����ķ���
		   */
		  target.needAdaptMethod();
		  /**
		   * �ӿڵ���һ������
		   */
		  target.anotherMethod();
	    }  
}
