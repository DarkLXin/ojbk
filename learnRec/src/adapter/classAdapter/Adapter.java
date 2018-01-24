package adapter.classAdapter;
/**
 * 此方法让target的实现类拥有了对象sourse类的功能
 * @author ecar84
 * 有一个Source类，拥有一个方法，待适配，目标接口时Target，通过Adapter类，将Source的功能扩展到Target里
 *
 */
public class Adapter extends Sourse implements Target{

	@Override
	public void anotherMethod() {
		System.out.println("目标接口的另一个方法");
		
	}

}
