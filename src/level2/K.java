import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
        int[] answer = new int [commands.length];
        	for(int i = 0; i < commands.length; i++){
			for(int k = commands[i][0]-1; k <commands[i][1]; k++){
				list.add(array[k]);

			}
			Collections.sort(list);
			list1.add(list.get(commands[i][2]-1));
			list.clear();
		}
        for(int i = 0; i < list1.size(); i++){
			answer[i] = list1.get(i);
		}
        return answer;
    }
}
