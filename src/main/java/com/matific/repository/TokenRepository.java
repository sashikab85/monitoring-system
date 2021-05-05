package com.matific.repository;

import com.matific.entity.TokenEntity;
import com.matific.model.SystemUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Integer> {
    public static final String disableToken = "update access_token t set t.enable=false where t.user_name=:userName and t.enable=true and t.session_id=:sessionId";
    public static final String systemUsage = "select sum(time_spent) as timeSpent, user_name as userName from token_store group by session_id";


    @Modifying
    @Query(value = disableToken, nativeQuery = true)
    public int disableTokenByName(@Param("userName") String userName, @Param("sessionId") String sessionId);

    @Query(value = systemUsage, nativeQuery = true)
    public List<SystemUsage> getSystemUsage();

    TokenEntity findTokenBySessionId(String sessionId);
}
