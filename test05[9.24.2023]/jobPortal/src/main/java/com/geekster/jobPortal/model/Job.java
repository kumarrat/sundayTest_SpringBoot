package com.geekster.jobPortal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Job {

    @Id
    private Long id;
    @NotBlank(message = "Title is required")
    private String title;
    @NotBlank(message = "description is required")
    private String description;
    @NotBlank(message = "Location is required")
    private String location;
    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;
    @Email(message = "Invalid company email")
    private String companyEmail;
    @NotBlank(message = "Company name is required")
    private String companyName;
    @NotBlank(message = "employer name is required")
    private String employerName;
    @NotNull(message = "Job type is required")
    private JobType jobType;
    @NotNull(message = "Applied date is required")
    private LocalDate appliedDate;


}
