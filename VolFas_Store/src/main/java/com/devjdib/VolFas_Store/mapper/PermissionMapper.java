package com.devjdib.VolFas_Store.mapper;

import com.devjdib.VolFas_Store.dto.request.PermissionRequest;
import com.devjdib.VolFas_Store.dto.response.PermissionResponse;
import com.devjdib.VolFas_Store.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
