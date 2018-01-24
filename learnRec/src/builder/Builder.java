package builder;

import java.util.ArrayList;
import java.util.List;

import factory.Dinner;
import factory.achive.Chicken;
import factory.achive.Duck;


public class Builder {
	 private List<Dinner> list = new ArrayList<Dinner>();  
		public void tenDaysDinnerChicken() {
			for(int i=0 ;i<10;i++){
				Chicken chicken=new Chicken();
				list.add(new Chicken());
				chicken.eat();
				
			}
		}
		public void tenDaysDinnerDuck() {
			for(int i=0 ;i<10;i++){
				list.add(new Duck());
			}
		}
}
