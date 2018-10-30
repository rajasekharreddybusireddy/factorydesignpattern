package factorydesignpattern.demo;

import factorydesignpattern.interf.MessageBuilder;

public class EMAILMessageBuilder implements MessageBuilder {

	@Override
	public void message() {
		System.out.println("EMAIL message");
	}

}
