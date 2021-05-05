package com.matific.repository;

import com.matific.entity.BattleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleRepository extends JpaRepository<BattleEntity, Integer> {
}
