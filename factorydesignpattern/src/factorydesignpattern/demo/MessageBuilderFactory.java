package factorydesignpattern.demo;

import factorydesignpattern.interf.MessageBuilder;

public class MessageBuilderFactory {

	public static MessageBuilder getBuilder(String messageType) {
		if (messageType.equals("SMS")) {
			return new SMSMessageBuilder();
		} else if (messageType.equals("EMAIL")) {
			return new EMAILMessageBuilder();
		} else if (messageType.equals("NOTIFICATION")) {
			return new NOTIFICATIONMessageBuilder();
		}
		return new SMSMessageBuilder();
	}
}
