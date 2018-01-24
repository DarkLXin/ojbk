package factory.achive;

import factory.Dinner;
import factory.Prepare;
/**
 * 实现准备晚餐    return  鸡的实例化对象
 * @author ecar84
 *
 */
public class acvChicken implements Prepare{

	@Override
	public Dinner prepareDinner() {
		return new Chicken();
	}

}
