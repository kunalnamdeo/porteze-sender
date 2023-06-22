package com.kanwiz.porteze.sender.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kanwiz.porteze.sender.entity.Sender;
import com.kanwiz.porteze.sender.repository.SenderRepository;

@Service
public class SenderService {

	@Autowired
	private SenderRepository senderRepository;

	public List<Sender> getAllSender() {

		List<Sender> senderList = new ArrayList<Sender>();

		senderRepository.findAll().forEach(senderList::add);

		return senderList;
	}

	public Sender findBySenderId(String id) {
		Optional<Sender> sender = senderRepository.findById(Integer.getInteger(id));

		if (sender.isPresent()) {
			return sender.get();
		} else {
			return null;
		}

	}
	
	public Sender saveSender(Sender sender) {
		Sender newSender = senderRepository.save(sender);
		return newSender;

	}

}
