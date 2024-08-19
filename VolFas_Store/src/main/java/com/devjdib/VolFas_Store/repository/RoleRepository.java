package com.devjdib.VolFas_Store.repository;

import com.devjdib.VolFas_Store.entity.Role;
import com.devjdib.VolFas_Store.exception.AppException;
import com.devjdib.VolFas_Store.exception.ErrorCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}
