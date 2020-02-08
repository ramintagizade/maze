package com.dev.maze.service;

import com.dev.maze.entity.Maze;
import com.dev.maze.util.Pair;

import java.util.Arrays;
import java.util.List;



public class MazeGenerator {

    private Pair<Integer,Integer> currentPosition;

    public MazeGenerator(Maze [][] maze) {

        currentPosition = new Pair<>(0,0);
        maze[0][0] = new Maze(Arrays.asList("South","East"));
        maze[1][0] = new Maze(Arrays.asList("North", "South"));
        maze[2][0] = new Maze(Arrays.asList("North", "South"));
        maze[3][0] = new Maze(Arrays.asList("North", "South"));
        maze[4][0] = new Maze(Arrays.asList("North", "South"));
        maze[5][0] = new Maze(Arrays.asList("North", "South"));
        maze[6][0] = new Maze(Arrays.asList("North", "South"));
        maze[7][0] = new Maze(Arrays.asList("North", "South"));
        maze[8][0] = new Maze(Arrays.asList("North", "South"));
        maze[9][0] = new Maze(Arrays.asList("North", "South"));
        maze[10][0] = new Maze(Arrays.asList("North","East"));

        maze[0][1] = new Maze(Arrays.asList("South","East","West"));
        maze[1][1] = new Maze(Arrays.asList("North"));
        maze[2][1] = new Maze(Arrays.asList("South","East"));
        maze[3][1] = new Maze(Arrays.asList("North", "South"));
        maze[4][1] = new Maze(Arrays.asList("North", "South"));
        maze[5][1] = new Maze(Arrays.asList("North", "South","East"));
        maze[6][1] = new Maze(Arrays.asList("North", "South"));
        maze[7][1] = new Maze(Arrays.asList("North", "South"));
        maze[8][1] = new Maze(Arrays.asList("North", "South"));
        maze[9][1] = new Maze(Arrays.asList("North", "South"));
        maze[10][1] = new Maze(Arrays.asList("North","East","West"));

        maze[0][2] = new Maze(Arrays.asList("East","West"));
        maze[1][2] = new Maze(Arrays.asList("South"));
        maze[2][2] = new Maze(Arrays.asList("South","West","North"));
        maze[3][2] = new Maze(Arrays.asList("North", "South"));
        maze[4][2] = new Maze(Arrays.asList("North", "South","East"));
        maze[5][2] = new Maze(Arrays.asList("North", "East","West"));
        maze[6][2] = new Maze(Arrays.asList("East", "South"));
        maze[7][2] = new Maze(Arrays.asList("North", "South"));
        maze[8][2] = new Maze(Arrays.asList("North", "South"));
        maze[9][2] = new Maze(Arrays.asList("North", "East"));
        maze[10][2] = new Maze(Arrays.asList("East","West"));

        maze[0][3] = new Maze(Arrays.asList("West","South"));
        maze[1][3] = new Maze(Arrays.asList("South","North"));
        maze[2][3] = new Maze(Arrays.asList("South","North","East"));
        maze[3][3] = new Maze(Arrays.asList("North", "East"));
        maze[4][3] = new Maze(Arrays.asList("East", "South","West"));
        maze[5][3] = new Maze(Arrays.asList("North", "East","West"));
        maze[6][3] = new Maze(Arrays.asList("East", "West"));
        maze[7][3] = new Maze(Arrays.asList("East", "South"));
        maze[8][3] = new Maze(Arrays.asList("North", "East"));
        maze[9][3] = new Maze(Arrays.asList("East", "West"));
        maze[10][3] = new Maze(Arrays.asList("East","West"));

        maze[0][4] = new Maze(Arrays.asList("East","South"));
        maze[1][4] = new Maze(Arrays.asList("South","North","East"));
        maze[2][4] = new Maze(Arrays.asList("North","East","West"));
        maze[3][4] = new Maze(Arrays.asList("East", "West"));
        maze[4][4] = new Maze(Arrays.asList("East","West","South"));
        maze[5][4] = new Maze(Arrays.asList("North", "West"));
        maze[6][4] = new Maze(Arrays.asList("East", "West"));
        maze[7][4] = new Maze(Arrays.asList("East", "West"));
        maze[8][4] = new Maze(Arrays.asList("West", "East"));
        maze[9][4] = new Maze(Arrays.asList("East", "West"));
        maze[10][4] = new Maze(Arrays.asList("East","West"));

        maze[0][5] = new Maze(Arrays.asList("West","East"));
        maze[1][5] = new Maze(Arrays.asList("East","West"));
        maze[2][5] = new Maze(Arrays.asList("East","West"));
        maze[3][5] = new Maze(Arrays.asList("East", "West"));
        maze[4][5] = new Maze(Arrays.asList("East","West"));
        maze[5][5] = new Maze(Arrays.asList("South"));
        maze[6][5] = new Maze(Arrays.asList("North", "West"));
        maze[7][5] = new Maze(Arrays.asList("East", "West"));
        maze[8][5] = new Maze(Arrays.asList("West", "East"));
        maze[9][5] = new Maze(Arrays.asList("East", "West"));
        maze[10][5] = new Maze(Arrays.asList("East","West"));

        maze[0][6] = new Maze(Arrays.asList("West","East"));
        maze[1][6] = new Maze(Arrays.asList("East","West"));
        maze[2][6] = new Maze(Arrays.asList("East","West"));
        maze[3][6] = new Maze(Arrays.asList("East", "West"));
        maze[4][6] = new Maze(Arrays.asList("West","South"));
        maze[5][6] = new Maze(Arrays.asList("South","North"));
        maze[6][6] = new Maze(Arrays.asList("North", "South"));
        maze[7][6] = new Maze(Arrays.asList("West", "North","South"));
        maze[8][6] = new Maze(Arrays.asList("West", "North"));
        maze[9][6] = new Maze(Arrays.asList("East", "West"));
        maze[10][6] = new Maze(Arrays.asList("East","West"));

        maze[0][7] = new Maze(Arrays.asList("West","East"));
        maze[1][7] = new Maze(Arrays.asList("East","West"));
        maze[2][7] = new Maze(Arrays.asList("East","West"));
        maze[3][7] = new Maze(Arrays.asList("West", "South"));
        maze[4][7] = new Maze(Arrays.asList("North","South"));
        maze[5][7] = new Maze(Arrays.asList("South","North"));
        maze[6][7] = new Maze(Arrays.asList("North", "South"));
        maze[7][7] = new Maze(Arrays.asList( "North","South"));
        maze[8][7] = new Maze(Arrays.asList("South", "North"));
        maze[9][7] = new Maze(Arrays.asList("West", "North"));
        maze[10][7] = new Maze(Arrays.asList("East","West"));

        maze[0][8] = new Maze(Arrays.asList("West","East"));
        maze[1][8] = new Maze(Arrays.asList("East","West"));
        maze[2][8] = new Maze(Arrays.asList("West","South"));
        maze[3][8] = new Maze(Arrays.asList("North", "South"));
        maze[4][8] = new Maze(Arrays.asList("North","South"));
        maze[5][8] = new Maze(Arrays.asList("South","North"));
        maze[6][8] = new Maze(Arrays.asList("North", "South"));
        maze[7][8] = new Maze(Arrays.asList( "North","South"));
        maze[8][8] = new Maze(Arrays.asList("South", "North"));
        maze[9][8] = new Maze(Arrays.asList("South", "North"));
        maze[10][8] = new Maze(Arrays.asList("East","West","North"));

        maze[0][9] = new Maze(Arrays.asList("West","East"));
        maze[1][9] = new Maze(Arrays.asList("West","South"));
        maze[2][9] = new Maze(Arrays.asList("North","South"));
        maze[3][9] = new Maze(Arrays.asList("North", "South"));
        maze[4][9] = new Maze(Arrays.asList("North","South"));
        maze[5][9] = new Maze(Arrays.asList("South","North"));
        maze[6][9] = new Maze(Arrays.asList("North", "South"));
        maze[7][9] = new Maze(Arrays.asList( "North","South"));
        maze[8][9] = new Maze(Arrays.asList("South", "North"));
        maze[9][9] = new Maze(Arrays.asList("North"));
        maze[10][9] = new Maze(Arrays.asList("East","West"));

        maze[0][10] = new Maze(Arrays.asList("South","West"));
        maze[1][10] = new Maze(Arrays.asList("North","South"));
        maze[2][10] = new Maze(Arrays.asList("North","South"));
        maze[3][10] = new Maze(Arrays.asList("North", "South"));
        maze[4][10] = new Maze(Arrays.asList("North","South"));
        maze[5][10] = new Maze(Arrays.asList("South","North"));
        maze[6][10] = new Maze(Arrays.asList("North", "South"));
        maze[7][10] = new Maze(Arrays.asList( "North","South"));
        maze[8][10] = new Maze(Arrays.asList("South", "North"));
        maze[9][10] = new Maze(Arrays.asList("North","South"));
        maze[10][10] = new Maze(Arrays.asList("West","North"));
    }

    public void setCurrentPosition(Pair<Integer,Integer> position) {
        this.currentPosition = position;
    }

    public Pair<Integer,Integer> getCurrentPosition(){
        return currentPosition;
    }

    public void move(String direction, List<String> directions ) {

        direction = direction.replace("\"", "");
        Pair<Integer,Integer> curPos = getCurrentPosition();
        Integer x = curPos.getFirst();
        Integer y = curPos.getSecond();


        boolean check = false;
        for(String dir : directions) {
            if (direction.trim().equals(dir)){
                check = true;
                break;
            }
        }

        if(!check) {
            return;
        }

        switch (direction) {
            case "North" :
                x = x - 1;
                break;
            case "South":
                x = x + 1;
                break;
            case "East":
                y = y + 1;
                break;
            case "West":
                y = y - 1;
                break;

                default:break;
        }

        setCurrentPosition(new Pair<>(x,y));
    }
}
