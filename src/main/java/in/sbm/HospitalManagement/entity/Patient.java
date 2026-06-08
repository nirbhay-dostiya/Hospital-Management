package in.sbm.HospitalManagement.entity;

import in.sbm.HospitalManagement.type.BloodGroupType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@ToString
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDate birthDate;
    private String email;
    private  String gender;
    private BloodGroupType bloodGroup;

}
