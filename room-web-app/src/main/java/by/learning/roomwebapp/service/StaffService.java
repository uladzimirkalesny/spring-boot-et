package by.learning.roomwebapp.service;

import by.learning.roomwebapp.model.StaffMember;
import by.learning.roomwebapp.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public List<StaffMember> getAllStaff() {
        return staffRepository.findAll();
    }

}
