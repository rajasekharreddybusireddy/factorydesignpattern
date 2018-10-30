package factorydesignpattern.demo;

import factorydesignpattern.interf.MessageBuilder;

public class Sendmessage {

	public static void main(String[] args) {

		String messageType = "EMAIL";
		MessageBuilder messageBuilder = MessageBuilderFactory.getBuilder(messageType);
		messageBuilder.message();
	}

}
