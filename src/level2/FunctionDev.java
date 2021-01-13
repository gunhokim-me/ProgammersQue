import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> temp = new ArrayList<>();
		LinkedList<Integer> stack = new LinkedList<>();
        
        int count = 0;
		for(int i = progresses.length-1; i >= 0; i--){
			count=0;
			while(progresses[i] < 100){
				count++;
				progresses[i] += speeds[i];
			}
			stack.push(count);
		}
        while(!stack.isEmpty()){
			count = 0;
			int test = stack.peek();
			while(test >= stack.peek()){
				count++;
				stack.pop();
				if(stack.isEmpty()){
					break;
				}
			}
			temp.add(count);
		}
		int[] answer = new int [temp.size()];
		for(int i = 0; i < temp.size(); i++){
			answer[i] = temp.get(i);
		}
     
        return answer;
    }
}
