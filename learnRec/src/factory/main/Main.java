package factory.main;

import factory.Dinner;
import factory.Prepare;
import factory.achive.acvChicken;
/**
 * 工厂模式学习
 * @author ecar84
 *
 */
public class Main {
	 public static void main(String[] args) { 
		 //实例化准备鸡 
		 Prepare prepare =new acvChicken();
		 //实现吃的动作
		 Dinner dinner=prepare.prepareDinner();
		 dinner.eat();
	 }  
}
