package com.kanwiz.porteze.sender.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kanwiz.porteze.sender.entity.Sender;
import com.kanwiz.porteze.sender.service.SenderService;

@RestController
@RequestMapping("/sender")
public class SenderController {

	@Autowired
	private SenderService senderService;

	
	/**
	 * @return List Of Sender
	 * http://localhost:8080/porteze-sender/sender/getSenderList
	 */
	@GetMapping("/getSenderList")
	public List<Sender> getSenderList() {
		List<Sender> senderList = senderService.getAllSender();
		return senderList;		
	}

	
	/**
	 * @param id
	 * @return
	 * http://localhost:8080/porteze-sender/sender/findBySenderId?id=2
	 */
	@GetMapping("/findBySenderId")
	@ResponseBody
	public Sender findBySenderId(@RequestParam String id) {
		Sender sender = senderService.findBySenderId(id);
		return sender;
	}
	
	/**
	 * @param sender
	 * @return
	 * http://localhost:8080/porteze-sender/sender/saveSender
	 */
	@PostMapping("/saveSender")
	@ResponseBody
	public Sender saveSender(@RequestBody Sender sender) {
		Sender newSender = senderService.saveSender(sender);
		return newSender;
	}

}
