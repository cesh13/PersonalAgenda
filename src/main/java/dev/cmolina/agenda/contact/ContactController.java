package dev.cmolina.agenda.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/contacts")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getContacts(){
        return contactService.getContacts();
    }

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable("id") UUID id){ return contactService.getContactById(id);}

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") UUID id){
        contactService.delete(id);
    }

    @PostMapping
    public UUID saveContact(@RequestBody Contact contact){
        contactService.saveOrUpdate(contact);
        return contact.getId();
    }
}
