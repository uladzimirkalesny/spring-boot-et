package by.learning.roomwebapp.repository;

import by.learning.roomwebapp.model.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
