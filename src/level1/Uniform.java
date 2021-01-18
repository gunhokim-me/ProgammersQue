import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
		Arrays.sort(reserve);
        ArrayList<Integer> lost1 = new ArrayList<>();
		ArrayList<Integer> lost2 = new ArrayList<>();
		int answer = 0;
        int a = lost.length;
		int b = reserve.length;
        
        if(a == n && b == 0){
          answer = 0;
        }
		
		for(int i = 0; i < a; i++){
			lost1.add(lost[i]);
		}
		for(int i = 0; i < b; i++){
			lost2.add(reserve[i]);
		}
        
        	for(int i = 0; i < lost1.size(); i++){
			if(lost2.contains(lost1.get(i)) == true){
				lost2.remove(lost1.get(i));
				lost1.remove(i);
				i = -1;
			}
		}
        
        
		if(lost2.size() == 0){
			answer = n - lost1.size();
		}else if (lost2.size() != 0){
			lost = new int [lost1.size()];
			reserve = new int [lost2.size()];
		}
		
        		for(int i = 0; i < lost1.size(); i++){
			int temp = lost1.get(i);
			if(lost2.contains(temp) == true){
				lost2.remove(lost1.get(i));
				lost1.remove(i);
				i = -1;
			}else if (lost2.contains(temp-1) == true){
				int index = lost2.indexOf(temp-1);
				lost2.remove(index);
				lost1.remove(i);
				i = -1;
			}else if ( lost2.contains(temp+1) == true){
				int index = lost2.indexOf(temp+1);
				lost2.remove(index);
				lost1.remove(i);
				i = -1;
			}

		}
        		answer = n - lost1.size();

			if(answer > n){
				answer = n;
			}
		
		

        return answer;
    }
}
