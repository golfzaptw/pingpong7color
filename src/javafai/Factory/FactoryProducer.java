package javafai.Factory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
	
	if (choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}
		return null;
	
	}

}
