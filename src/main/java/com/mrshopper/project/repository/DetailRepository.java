package com.mrshopper.project.repository;


import com.mrshopper.project.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DetailRepository extends JpaRepository<Detail, Long> {
}
