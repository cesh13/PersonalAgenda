package dev.cmolina.agenda.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService
{
    @Autowired
    ContactRepository contactRepository;

    public List<Contact> getContacts(){
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contact -> contacts.add(contact));
        return contacts;
    }
}
