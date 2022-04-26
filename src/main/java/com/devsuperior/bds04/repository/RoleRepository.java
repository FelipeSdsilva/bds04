package com.devsuperior.bds04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bds04.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
