package com.devjdib.VolFas_Store.mapper;

import com.devjdib.VolFas_Store.dto.request.RoleRequest;
import com.devjdib.VolFas_Store.dto.response.RoleResponse;
import com.devjdib.VolFas_Store.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
