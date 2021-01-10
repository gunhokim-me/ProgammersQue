import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int temp = 0;
		ArrayList<Integer> bor = new ArrayList<>();
		
		for(int i = 0; i < moves.length; i++){
			for(int j = 0; j < board.length; j++){
				if(board[j][moves[i]-1] != 0){
					temp = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					bor.add(temp);
					break;
				}
			}
		}
		for(int i = 0; i < bor.size(); i++){
			if(i+1 < bor.size()){
				if(bor.get(i) == bor.get(i+1)){
					bor.remove(i+1);
					bor.remove(i);
					i = -1;
					answer++;
				}
			}
		}
        answer = (answer * 2);
        return answer;
    }
}
