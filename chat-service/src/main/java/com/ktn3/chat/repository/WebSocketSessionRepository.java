package com.ktn3.chat.repository;

import com.devteria.chat.entity.WebSocketSession;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WebSocketSessionRepository extends MongoRepository<WebSocketSession, String> {
    void deleteBySocketSessionId(String sessionId);

    List<WebSocketSession> findAllByUserIdIn(List<String> userIds);
}
