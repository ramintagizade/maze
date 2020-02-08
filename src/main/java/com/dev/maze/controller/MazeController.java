package com.dev.maze.controller;

import com.dev.maze.entity.Maze;
import com.dev.maze.service.MazeGenerator;
import com.dev.maze.util.Pair;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class MazeController {

    private static int n = 11;
    Maze [][] maze = new Maze[n][n];
    MazeGenerator mazeGenerator = new MazeGenerator(maze);

    private List<String> getDirections() {
        Pair<Integer,Integer> pos = mazeGenerator.getCurrentPosition();
        return maze[pos.getFirst()][pos.getSecond()].getDirections();
    }

    @PostMapping(value = "/move")
    public void move(@RequestBody  String direction) {
        mazeGenerator.move(direction,getDirections());
    }

    @PostMapping(value = "/reset")
    public void reset(){
        mazeGenerator = new MazeGenerator(maze);
    }

    @GetMapping(value = "/directions")
    public Map<String,Boolean> directions(){
        HashMap<String,Boolean> map = new HashMap<>();
        List<String> directions = getDirections();
        map.put("North", false);
        map.put("South", false);
        map.put("East", false);
        map.put("West",false);
        for(String direction: directions) {
            map.put(direction, true);
        }
        return map;
    }

    @GetMapping(value = "/position")
    public Map<String,Map<String,Integer>> position(){
        Pair<Integer,Integer> position = mazeGenerator.getCurrentPosition();
        HashMap<String,Map<String,Integer>> posMap = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("X",position.getFirst());
        map.put("Y",position.getSecond());
        posMap.put("Position",map);
        return posMap;
    }

    @GetMapping(value = "/state")
    public Map<String,String> state(){
        Pair<Integer,Integer> position = mazeGenerator.getCurrentPosition();
        HashMap<String,String> map = new HashMap<>();
        if (position.getFirst()==5 && position.getSecond()==5) {
            map.put("State","TargetReached");
        }
        else {
            map.put("State","OnTheWay");
        }
        return map;
    }

}
