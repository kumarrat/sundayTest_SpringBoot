package com.geekster.jobPortal.repo;

import com.geekster.jobPortal.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job, Long> {

}
