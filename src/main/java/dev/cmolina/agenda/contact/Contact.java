package dev.cmolina.agenda.contact;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class Contact {
    @Id
    @Type(type="uuid-char")
    @Column
    private UUID id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String mobile_phone;
    @Column
    private String work_phone;
    @Column
    private String email;
    @Column
    private String address;

    public Contact() {
    }

    public Contact(UUID id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Contact(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
