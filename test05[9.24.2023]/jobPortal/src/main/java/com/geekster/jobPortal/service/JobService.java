package com.geekster.jobPortal.service;

import com.geekster.jobPortal.model.Job;
import com.geekster.jobPortal.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJobRepo jobRepo;

    public String createJob(Job newJob) {

        jobRepo.save(newJob);
        return "job created";
    }

    public List<Job> getJobs() {
       return (List<Job>) jobRepo.findAll();
    }

    public String addJobs(List<Job> newJobs) {
        jobRepo.saveAll(newJobs);
        return newJobs.size() + "jobs were added";
    }


    public String removeJobs(List<Long> ids) {
         jobRepo.deleteAllById(ids);
        return "removed jobs";
    }

    public Job getJobsById(Long id) {
       return jobRepo.findById(id).get();
    }
}
