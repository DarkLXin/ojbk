package adapter.classAdapter;

public class Main {
	  public static void main(String[] args) {  
		  /**
		   * 实例化Adapter对象
		   */
		  Target target =new Adapter();
		  /**
		   * 调用需要适配的方法
		   */
		  target.needAdaptMethod();
		  /**
		   * 接口的另一个方法
		   */
		  target.anotherMethod();
	    }  
}
