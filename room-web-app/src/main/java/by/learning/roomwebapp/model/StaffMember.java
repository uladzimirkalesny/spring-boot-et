package by.learning.roomwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name = "EMPLOYEE_ID")
    private String uuid;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "POSITION")
    private Position position;

    public StaffMember(String uuid) {
        this.uuid = UUID.randomUUID().toString();
    }
}
