package com.matific.service.impl;

import com.matific.dto.MembersResponse;
import com.matific.dto.PlayerResponse;
import com.matific.dto.PlayersResponse;
import com.matific.entity.PlayerEntity;
import com.matific.entity.TeamAvgEntity;
import com.matific.exception.MemberDetailsException;
import com.matific.model.PlayerAvg;
import com.matific.model.PlayerInfo;
import com.matific.model.PlayersAvg;
import com.matific.repository.MemberAnalyticsRepository;
import com.matific.repository.MemberRepository;
import com.matific.repository.TeamAnalyticsRepository;
import com.matific.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Member service.
 */
@Service
public class MemberServiceImpl implements MemberService {

    /**
     * The Member repository.
     */
    @Autowired
    MemberRepository memberRepository;

    /**
     * The Member analytics repository.
     */
    @Autowired
    MemberAnalyticsRepository memberAnalyticsRepository;

    /**
     * The Team analytics repository.
     */
    @Autowired
    TeamAnalyticsRepository teamAnalyticsRepository;

    public PlayerResponse getPlayerById(String min) throws MemberDetailsException {
        PlayerEntity playerEntity = memberRepository.findPlayerByIdentificationNumber(min);
        PlayerAvg playerAvg = memberAnalyticsRepository.findPlayerAvg(min);
        return new PlayerResponse(new com.matific.model.Player(playerEntity.getMemberId(),
                playerEntity.getIdentificationNumber(),
                playerEntity.getMemberFirstName(),
                playerEntity.getMemberLastName(),
                playerEntity.isActive(),
                playerEntity.getMemberAge(),
                playerEntity.getWeight(),
                playerEntity.getHeight(), playerAvg.getTotal(), playerAvg.getCount(), playerAvg.getAvg()));
    }

    @Override
    public MembersResponse getAllPlayers() throws MemberDetailsException {
        List<PlayerEntity> playerEntities = memberRepository.findAll();
        List<PlayerInfo> playersInfo = new ArrayList<>();
        for (PlayerEntity playerEntity : playerEntities) {
            com.matific.model.PlayerInfo playerInfo = new com.matific.model.PlayerInfo(playerEntity.getMemberId(),
                    playerEntity.getIdentificationNumber(),
                    playerEntity.getMemberFirstName(),
                    playerEntity.getMemberLastName(),
                    playerEntity.isActive(),
                    playerEntity.getMemberAge());
            playersInfo.add(playerInfo);
        }
        return new MembersResponse(playersInfo);
    }

    @Override
    public PlayersResponse filter(double threshHold, String tin) throws MemberDetailsException {

        TeamAvgEntity teamAvgEntity = teamAnalyticsRepository.findTeamsAvg(tin);
        List<PlayersAvg> playersAvg = memberAnalyticsRepository.findPlayersAvg();
        Double calculatedAvg = teamAvgEntity.getAvg() * (threshHold / 100);
        List<PlayersAvg> playersAvgs = new ArrayList<>();

        for (PlayersAvg player : playersAvg) {
            if (player.getAvg() >= calculatedAvg) {
                playersAvgs.add(player);
            }
        }
        return new PlayersResponse(teamAvgEntity.getTeamTotal(), teamAvgEntity.getAvg(), calculatedAvg, playersAvgs);
    }
}
