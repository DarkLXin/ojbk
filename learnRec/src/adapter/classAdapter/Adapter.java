package adapter.classAdapter;
/**
 * �˷�����target��ʵ����ӵ���˶���sourse��Ĺ���
 * @author ecar84
 * ��һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTarget��ͨ��Adapter�࣬��Source�Ĺ�����չ��Target��
 *
 */
public class Adapter extends Sourse implements Target{

	@Override
	public void anotherMethod() {
		System.out.println("Ŀ��ӿڵ���һ������");
		
	}

}
