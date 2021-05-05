package com.matific.controller;

import com.matific.dto.MembersResponse;
import com.matific.dto.PlayerResponse;
import com.matific.dto.PlayersResponse;
import com.matific.exception.MemberDetailsException;
import com.matific.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class MemberDetailsController {

    Logger logger = LoggerFactory.getLogger(MemberDetailsController.class);

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    @Secured({"ROLE_ADMIN","ROLE_COACH"})
    public ResponseEntity<MembersResponse> getMembers() {
        logger.info(" >>>>>>>> inside getMembers");
        MembersResponse membersResponse = null;
        try {
            membersResponse = memberService.getAllPlayers();
        } catch (MemberDetailsException e) {
            logger.info(" >>>>>>>> error inside getMembers");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new MembersResponse());
        }
        logger.info(" >>>>>>>> getMembers successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(membersResponse);
    }

    @RequestMapping(value = "/player/{min}", method = RequestMethod.GET)
    @Secured({"ROLE_ADMIN","ROLE_COACH"})
    public ResponseEntity<PlayerResponse> getMemberDetailsById(@PathVariable("min") String min) {
        logger.info(" >>>>>>>> inside getMemberDetailsById");
        PlayerResponse playerResponse = null;
        try {
            playerResponse = memberService.getPlayerById(min);
        } catch (MemberDetailsException e) {
            logger.info(" >>>>>>>> error inside getMemberDetailsById");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new PlayerResponse());
        }
        logger.info(" >>>>>>>> getMemberDetailsById successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(playerResponse);
    }

    @RequestMapping(value = "/team/{tin}/players/{percentage}", method = RequestMethod.GET)
    @Secured({"ROLE_COACH", "ROLE_ADMIN"})
    public ResponseEntity<PlayersResponse> filterPlayers(@PathVariable("tin") String tin, @PathVariable("percentage") double percentage) {

        logger.info(" >>>>>>>> inside filterPlayers");
        PlayersResponse playersResponse = null;
        try {
            playersResponse = memberService.filter(percentage, tin);
        } catch (MemberDetailsException e) {
            logger.info(" >>>>>>>> error inside filterPlayers");
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(new PlayersResponse());
        }
        logger.info(" >>>>>>>> filterPlayers successfully returning");
        return ResponseEntity.status(HttpStatus.OK).body(playersResponse);
    }
}
