package com.progrexion.demo.services.v1;

import java.util.List;

import com.progrexion.demo.model.entities.Message;

public interface DemoService {
public String getMessage(int id);
public  Message createMessage(Message message);
public List<Message> getAllMessages();
}
