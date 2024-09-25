package edu.icet.crn.dto;

import com.mysql.cj.protocol.ColumnDefinition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stdId;
    private String stdName;
    @Lob
    @Column(columnDefinition="LongText")
    private String stdImg;
    private String stdAge;
    private String stdPhone;
    private String stdEmail;
    private String guardianName;
    private String guardianAddress;
    private String guardianPhone;
}
