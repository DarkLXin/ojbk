package factory.achive;

import factory.Dinner;
/**
 * 吃晚餐是先晚餐接口   这里实现吃鸡
 * @author ecar84
 *
 */
public class Chicken implements Dinner{

	@Override
	public void eat() {
		System.out.println("winner winner ,chicken dinner!");
	}

}
