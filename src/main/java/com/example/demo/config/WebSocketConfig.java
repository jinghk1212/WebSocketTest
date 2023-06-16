package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
// 설정파일임을 나타낸다.

@EnableWebSocketMessageBroker
// WebSocket 메시지 브로커를 활성화

public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");
		config.setApplicationDestinationPrefixes("/app");
	}
	/* 
	 메서드를 오버라이드 하여 브로커 구성 설정.
	 /topic 프리픽스로 시작하는 대상을 구독하는 클라이언트에게 메시지 전송할 수 있음.
	 /app 프리픽스로 시작하는 메시지는 메시지 매핑 핸들러로 라우팅
	*/
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/chat").withSockJS();
	}
	/*
	 클라이언트가 WebSocket에 연결할 수 있는 엔드포인트를 등록.
	 /chat 경로를 사용하고 SockJS를 사용하여 WebSocket 연결을 지원. 
	 
	 SockJS : WebSocket을 지원하지 않는 일부 브라우저에서도 사용하게 할 수 있는 JavaScript 라이브러리
	 */
	
}
