package com.geekster.jobPortal.controller;

import com.geekster.jobPortal.model.Job;
import com.geekster.jobPortal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class JobController {
    @Autowired
    JobService jobService;

    //Post Jobs

    @PostMapping("job")
    public String createJob(@RequestBody @Valid Job newJob)
    {
        return jobService.createJob(newJob);
    }

    //Get All Jobs

    @GetMapping("jobs")
    public List<Job> getJobs()
    {
        return jobService.getJobs();
    }

    @PostMapping("jobs")
    public String addJobs(@RequestBody @Valid List<Job> newJobs)
    {
        return jobService.addJobs(newJobs);
    }

    // Delete Jobs By Id

    @DeleteMapping("jobs/ids")
    public String removeJobsById(@RequestBody @Valid List<Long> ids)
    {
        return jobService.removeJobs(ids);
    }

    @GetMapping("jobs/id/{id}")
    public Job getJobById(@PathVariable @Valid Long id)
    {
        return jobService.getJobsById(id);
    }
}
