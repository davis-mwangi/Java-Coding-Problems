

public class Solution {

    public static int[][] wallsAndGates(int [][] rooms){
        int dist = 0;
        
       if(rooms.length == 0 ||  rooms[0].length == 0){
           return  dist;
        }
        
       int rows = rooms.length;
       int cols = rooms[0].length;
      
       Deque<Integer[]>deque  =  new ArrayDeque<>();
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
      
      return rooms;
     
    }
  
    public static void  addRoom(Deque<Integer[]>deque, int [][] rooms, int row, int col, boolean[][] visited){
        if(row < 0 || col < 0 || row >=  rooms.length || col >= rooms[0].length  || !visited[row][col] || rooms[row][col] == -1){
           return;
        }
        visited[row][col] = true;
        deque.add(new Integer[]{row, col}); 
    }
}
