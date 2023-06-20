package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.ChatMessage;

@Controller
// 컨트롤러임을 선언.
public class WebSocketController {
	/*
	@MessageMapping("/chat.sendMessage")
	// /app/chat/sendMessage 결로로 들어오는 메시지를 처리하는 핸들러.
	@SendTo("/topic/public")
	// 클라이언트로부터 메시지를 받아오고 모든 구독자에게 메시지를 전달.
	public ChatMessage sendMessage(ChatMessage chatMessage) {
		return chatMessage;
	}
	
	@MessageMapping("/chat.addUser")
	// 클라이언트가 새로운 사용자를 추가했을 때의 동작을 구현.
	@SendTo("/topic/public")
	public ChatMessage addUser(ChatMessage chatMessage) {
		return chatMessage;
	}
	*/
	
	@GetMapping("/")
	public String chat() {
		return "chat";
	}
}

