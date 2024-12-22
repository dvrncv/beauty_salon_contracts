package controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/booking")
public interface AppointmentServiceController {


    @GetMapping("/service/{serviceId}")
    String showServiceAppointment(@PathVariable Long serviceId,
                                  @RequestParam(name = "date", required = false) String dateStr,
                                  Principal principal, Model model);

    @PostMapping("/service/{serviceId}/appoinment")
    String appointmentService(@PathVariable Long serviceId,
                              @RequestParam Long employeeId,
                              @RequestParam String date,
                              HttpServletRequest request,
                              Model model, Principal principal);

    @GetMapping("/client-appointments")
    String getClientAppointments(Principal principal, Model model);

    @PostMapping("/add-points")
    String addPoints(@RequestParam Long clientId, @RequestParam Long appointmentId, Principal principal, Model model);

}

