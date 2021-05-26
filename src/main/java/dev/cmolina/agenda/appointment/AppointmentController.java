package dev.cmolina.agenda.appointment;

import dev.cmolina.agenda.contact.Contact;
import dev.cmolina.agenda.contact.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/appointments")
public class AppointmentController {
    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public List<Appointment> getAppointments(){
        return appointmentService.getAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable("id") long id){ return appointmentService.getAppointmentById(id);}

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable("id") long id){
        appointmentService.delete(id);
    }

    @PostMapping
    public long saveAppointment(@RequestBody Appointment appointment){
        appointmentService.saveOrUpdateAppointment(appointment);
        return appointment.getId();
    }
}
