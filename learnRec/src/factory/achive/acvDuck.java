package factory.achive;

import factory.Dinner;
import factory.Prepare;

public class acvDuck implements Prepare{

	@Override
	public Dinner prepareDinner() {
		// TODO Auto-generated method stub
		return new Duck();
	}

}
