package com.ironhack.lab3_6.repository;

import com.ironhack.lab3_6.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {
}
