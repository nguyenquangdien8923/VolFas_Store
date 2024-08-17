package com.devjdib.VolFas_Store.repository;

import com.devjdib.VolFas_Store.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {
}
