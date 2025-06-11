package chatapplication.controller;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

import chatapplication.entity.Message;
import chatapplication.service.Sender;

@Controller
public class MessageController {

	private final Sender sender;
	
	private final SimpMessageSendingOperations messageTemplate;

	public MessageController(Sender sender, SimpMessageSendingOperations messageTemplate) {
		super();
		this.sender = sender;
		this.messageTemplate = messageTemplate;
	}
	
	public void sendMessage(@Payload Message chatMessage, SimpMessageHeaderAccessor headerAccessor) {
		chatMessage.setSessionId(headerAccessor.getSessionId());
	}
}
