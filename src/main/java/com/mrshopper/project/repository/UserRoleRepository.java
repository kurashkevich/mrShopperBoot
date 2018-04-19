package com.mrshopper.project.repository;


import com.mrshopper.project.entity.User;
import com.mrshopper.project.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
