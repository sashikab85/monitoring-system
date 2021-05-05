package com.matific.repository;

import com.matific.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<PlayerEntity, String> {
    PlayerEntity findPlayerByIdentificationNumber(String min);
}
