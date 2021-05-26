package dev.cmolina.agenda.appointment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;

    public List<Appointment> getAppointments(){
        List<Appointment> appointments = new ArrayList<>();
        appointmentRepository.findAll().forEach(appointment -> appointments.add(appointment));
        return appointments;
    }

    public Appointment getAppointmentById(long id){return appointmentRepository.findById(id).get();}

    public void saveOrUpdateAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }

    public void delete(long id){
        appointmentRepository.deleteById(id);
    }
}
