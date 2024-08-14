package com.devjdib.VolFas_Store.mapper;

import com.devjdib.VolFas_Store.dto.request.UserCreateRequest;
import com.devjdib.VolFas_Store.dto.request.UserUpdateRequest;
import com.devjdib.VolFas_Store.dto.response.UserResponse;
import com.devjdib.VolFas_Store.entity.User;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-14T08:10:34+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.firstName( request.getFirstName() );
        user.lastName( request.getLastName() );
        user.phoneNumber( request.getPhoneNumber() );
        user.address( request.getAddress() );
        user.email( request.getEmail() );
        user.password( request.getPassword() );
        user.joinDate( request.getJoinDate() );
        user.status( request.getStatus() );

        return user.build();
    }

    @Override
    public List<UserResponse> toUsersResponse(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( users.size() );
        for ( User user : users ) {
            list.add( toUserResponse( user ) );
        }

        return list;
    }

    @Override
    public UserResponse toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( user.getId() );
        userResponse.firstName( user.getFirstName() );
        userResponse.lastName( user.getLastName() );
        userResponse.phoneNumber( user.getPhoneNumber() );
        userResponse.address( user.getAddress() );
        userResponse.email( user.getEmail() );
        userResponse.joinDate( user.getJoinDate() );
        userResponse.status( user.getStatus() );
        Set<String> set = user.getRoles();
        if ( set != null ) {
            userResponse.roles( new LinkedHashSet<String>( set ) );
        }

        return userResponse.build();
    }

    @Override
    public void updateUser(User user, UserUpdateRequest userUpdateRequest) {
        if ( userUpdateRequest == null ) {
            return;
        }

        user.setFirstName( userUpdateRequest.getFirstName() );
        user.setLastName( userUpdateRequest.getLastName() );
        user.setPhoneNumber( userUpdateRequest.getPhoneNumber() );
        user.setAddress( userUpdateRequest.getAddress() );
        user.setPassword( userUpdateRequest.getPassword() );
        user.setStatus( userUpdateRequest.getStatus() );
    }
}
