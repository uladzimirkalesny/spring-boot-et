package by.learning.roomwebapp.controller;

import by.learning.roomwebapp.model.StaffMember;
import by.learning.roomwebapp.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    @GetMapping
    public List<StaffMember> getAllRooms() {
        return Optional.ofNullable(staffService.getAllStaff()).orElse(Collections.emptyList());
    }

}
