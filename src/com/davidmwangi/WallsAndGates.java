
## You are given a m x n 2D grid initialized with these three possible values.
-1 - A wall or an obstacle.
0 - A gate.
INF - Infinity means an empty room. We use the value 2^31 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF. ##

###
Example :

INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
After running your function, it will become:
3  -1   0   1
2   2   1  -1
1  -1   2  -1
0  -1   3   4

###



public class Solution {

   public static void  wallsAndGates(int [][] rooms){


        if(rooms.length == 0 ||  rooms[0].length == 0){
            return;
        }

        int rows = rooms.length;
        int cols = rooms[0].length;

        Deque<Integer[]> deque  =  new ArrayDeque<>();

        boolean[][]visited =  new boolean[rows][cols];

        //Add gates to the deque
        for(int r = 0;  r < rows; r++){
            for(int c = 0; c <  cols;  c++){
                if(rooms[r][c] ==  0){
                    deque.add(new Integer[]{r, c});
                    visited[r][c] = true;
                }
            }

        }
        int dist = 0;
        //Perform BFS
        while(!deque.isEmpty()){

            for(int  i = 0; i < deque.size(); i++){
                Integer[] room = deque.pollFirst();

                int row =  room[0];
                int col =  room[1];

                //Update  visit distance
                rooms[row][col] = dist;

                //Check bounds and update visited as well as addd to deque
                addRoom(deque, rooms, row + 1, col, visited);
                addRoom(deque,rooms, row - 1, col, visited);
                addRoom(deque,rooms, row, col + 1, visited);
                addRoom(deque,rooms, row, col - 1, visited);
            }
            // Increment distance
            dist += 1;
        }

    }

    public static void  addRoom(Deque<Integer[]>deque, int [][] rooms, int row, int col, boolean[][] visited){
        if(row < 0 || col < 0 || row >=  rooms.length || col >= rooms[0].length  || visited[row][col] || rooms[row][col] == -1){
            return;
        }
        visited[row][col] = true;
        deque.add(new Integer[]{row, col});
    }
}
