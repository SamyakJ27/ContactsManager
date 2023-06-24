package com.example.contactsspringbackend.controller;

import com.example.contactsspringbackend.model.Contact;
import com.example.contactsspringbackend.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    //get all Contacts
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

}
