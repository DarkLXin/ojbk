package decorator;
/**
 * ��װ���� 
 * @author ecar84
 *
 */
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("the original method!");  
	}

}


/*װ����ģʽ��Ӧ�ó�����

	1����Ҫ��չһ����Ĺ��ܡ�

	2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����

		ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
 * 
 * 
 * 
 * */
 