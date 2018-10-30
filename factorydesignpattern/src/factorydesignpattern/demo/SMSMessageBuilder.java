package factorydesignpattern.demo;

import factorydesignpattern.interf.MessageBuilder;

public class SMSMessageBuilder implements MessageBuilder {

	@Override
	public void message() {
		System.out.println("SMS message");
	}

}
