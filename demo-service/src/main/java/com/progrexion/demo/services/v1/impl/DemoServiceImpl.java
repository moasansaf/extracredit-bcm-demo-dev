package com.progrexion.demo.services.v1.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progrexion.demo.common.exceptions.DemoException;
import com.progrexion.demo.model.entities.Message;
import com.progrexion.demo.model.repositories.MessageRepository;
import com.progrexion.demo.services.v1.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private MessageRepository messageRepository;
	@Override
	public String getMessage(int id) {
		Message msg = messageRepository.getOne(id);
		if(msg!=null)
		{
			return msg.getValue();
		}
		else
		{
			throw new DemoException("Message Not Available");
		}
		
	}
	@Override
	public Message createMessage(Message message) {
		Message msg=messageRepository.save(message);
		if(msg!=null)
		{
			return msg;
		}
		else
		{
			throw new DemoException("Message Not Available");
		}
	}
	@Override
	public List<Message> getAllMessages() {
		List<Message> msgList=messageRepository.findAll();
		return msgList;
	}
}
