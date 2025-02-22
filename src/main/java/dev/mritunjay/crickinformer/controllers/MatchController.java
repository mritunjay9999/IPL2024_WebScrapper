package dev.mritunjay.crickinformer.controllers;

import dev.mritunjay.crickinformer.models.Match;
import dev.mritunjay.crickinformer.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cricket")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    //    get all matches matches
    @GetMapping("/matches")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches() , HttpStatus.OK);
    }

//      get live matches
    @GetMapping("/live")
    public ResponseEntity<?> getLiveMatches(){
        System.out.println("Displaying all live matches...");
        return new ResponseEntity<>(this.matchService.getLiveMatches() , HttpStatus.OK);
    }

//      get point-table
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        System.out.println("Displaying point table...");
        return new ResponseEntity<>(this.matchService.getPointTable() , HttpStatus.OK);
    }

}
