package factory.main;

import factory.Dinner;
import factory.Prepare;
import factory.achive.acvChicken;
/**
 * ����ģʽѧϰ
 * @author ecar84
 *
 */
public class Main {
	 public static void main(String[] args) { 
		 //ʵ����׼���� 
		 Prepare prepare =new acvChicken();
		 //ʵ�ֳԵĶ���
		 Dinner dinner=prepare.prepareDinner();
		 dinner.eat();
	 }  
}
