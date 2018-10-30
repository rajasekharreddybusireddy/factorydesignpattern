package factorydesignpattern.demo;

import factorydesignpattern.interf.MessageBuilder;

public class NOTIFICATIONMessageBuilder implements MessageBuilder {

	@Override
	public void message() {
		System.out.println("Notification message");
	}

}
