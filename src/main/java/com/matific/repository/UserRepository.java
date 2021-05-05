package com.matific.repository;

import com.matific.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public static final String deactivateUser = "update User u set u.is_active=false where u.user_name=:userName and u.is_active=true";
    public static final String activateUser = "update User u set u.is_active=true where u.user_name=:userName and u.is_active=false";
    public static final String activeUserCount = "select count(u.user_name) as numberOfLiveUsers from user u where u.is_active=true";
    public static final String loggedinUserCount = "select count(u.user_name) as numberOfLoggedinUsers from user u where u.is_active=false";


    @Modifying
    @Query(value = deactivateUser, nativeQuery = true)
    public int deactivateUserByName(@Param("userName") String userName);

    UserEntity findUserByUserName(String username);

    @Modifying
    @Query(value = activateUser, nativeQuery = true)
    public int activateUserByName(@Param("userName") String userName);

    @Query(value = activeUserCount, nativeQuery = true)
    public int getActiveUserCount();

    @Query(value = loggedinUserCount, nativeQuery = true)
    public int getLoggedinUserCount();
}
