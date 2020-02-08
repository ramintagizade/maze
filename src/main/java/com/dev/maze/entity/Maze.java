package com.dev.maze.entity;

import java.util.List;



public class Maze {

    private List<String> directions;


    public Maze(List<String> directions){
        this.directions = directions;
    }

    public List<String> getDirections() {
        return directions;
    }

    @Override
    public String toString() {
        return "Directions : " + this.directions + "\n";
    }

}
