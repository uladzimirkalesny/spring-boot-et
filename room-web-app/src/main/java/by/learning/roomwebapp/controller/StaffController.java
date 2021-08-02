package by.learning.roomwebapp.controller;

import by.learning.roomwebapp.model.StaffMember;
import by.learning.roomwebapp.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Controller
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    @GetMapping
    public String getAllRooms(Model model) {
        List<StaffMember> staffMembers = Optional.ofNullable(staffService.getAllStaff()).orElse(Collections.emptyList());
        model.addAttribute("staff", staffMembers);

        return "staff";
    }

}
