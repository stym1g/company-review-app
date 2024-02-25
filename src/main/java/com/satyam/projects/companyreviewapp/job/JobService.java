package com.satyam.projects.companyreviewapp.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    Job findOne(Long id);
    void createJob(Job job);
    Boolean deleteJob(Long id);

    Boolean updateJob(Long id, Job job);
}
