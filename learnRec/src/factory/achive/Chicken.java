package factory.achive;

import factory.Dinner;
/**
 * �����������ͽӿ�   ����ʵ�ֳԼ�
 * @author ecar84
 *
 */
public class Chicken implements Dinner{

	@Override
	public void eat() {
		System.out.println("winner winner ,chicken dinner!");
	}

}
