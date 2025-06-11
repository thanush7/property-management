package chatapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {
  
	private MessageType messageType;
	
	private String content;
	
	private String sender;
	
	private String sessionId;
	
}
