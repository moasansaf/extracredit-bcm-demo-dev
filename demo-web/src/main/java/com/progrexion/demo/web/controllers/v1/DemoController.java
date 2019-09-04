package com.progrexion.demo.web.controllers.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.progrexion.demo.model.entities.Message;
import com.progrexion.demo.services.v1.DemoService;



@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/{messageId}", method = RequestMethod.GET)
	public String getGreetingMessage(@PathVariable int messageId) {
		String message = demoService.getMessage(messageId);
		return message;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String createGreetingMessage(@RequestBody Message msg) {
		
		String messageValue=null;
		try
		{
			msg = demoService.createMessage(msg);
		}
		catch(Exception e)
		{
			messageValue = e.getMessage();
		}
		return messageValue;
	}	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> getAllGreetingMessages() {
		
		List<Message> messageList= demoService.getAllMessages();
		
		ResponseEntity reponseEntity = new ResponseEntity<List<Message>>(messageList,HttpStatus.OK);
		return reponseEntity;
	}
}
