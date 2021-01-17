import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
ArrayList<Integer> ar = new ArrayList<>();
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i-1]){
				ar.add(arr[i-1]);
			}
			if(i == arr.length-1){
				ar.add(arr[arr.length-1]);
			}
		}
        int [] answer = new int [ar.size()];
		for(int i = 0; i < ar.size(); i++){
			answer[i] = ar.get(i);
		}
        
        return answer;
    }
}
