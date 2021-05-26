package dev.cmolina.agenda.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public Contact getContactById(UUID id){
        return contactRepository.findById(id).get();
    }

    public void saveOrUpdate(Contact contact){
        if (contact.getId() == null)
            contact.setId(UUID.randomUUID());
        contactRepository.save(contact);
    }

    public void delete(UUID id){
        contactRepository.deleteById(id);
    }
}
