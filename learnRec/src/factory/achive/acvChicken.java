package factory.achive;

import factory.Dinner;
import factory.Prepare;
/**
 * ʵ��׼�����    return  ����ʵ��������
 * @author ecar84
 *
 */
public class acvChicken implements Prepare{

	@Override
	public Dinner prepareDinner() {
		return new Chicken();
	}

}
