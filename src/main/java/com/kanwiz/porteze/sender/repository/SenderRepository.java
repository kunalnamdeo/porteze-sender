package com.kanwiz.porteze.sender.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanwiz.porteze.sender.entity.Sender;

@Repository
public interface SenderRepository extends JpaRepository<Sender, Integer> {

}
