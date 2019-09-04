package com.progrexion.demo.model.repositories;

import org.springframework.stereotype.Repository;
import com.progrexion.demo.model.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

}

