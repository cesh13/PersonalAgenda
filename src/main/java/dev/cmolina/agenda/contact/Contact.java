package dev.cmolina.agenda.contact;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table
public class Contact {
    @Id
    @Column
    private int id;
    @Column
    private String first_name;
    @Column
    private String last_name;

    public Contact() {
    }

    public Contact(int id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Contact(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
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
