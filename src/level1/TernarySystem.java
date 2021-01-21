import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        	ArrayList<Integer> temp = new ArrayList<>();
		boolean power = true;
        if(n == 1){
			power = false;
			answer = 1;
		}else if(n == 2){
			power = false;
			answer = 2;
		}
		while (power == true) {
			temp.add(n % 3);
			n = n / 3;
			if ((n / 3) <= 0) {
				temp.add(n % 3);
				power = !power;
			}
		}
		int test = 1;
		for (int i = temp.size() - 1; i >= 0; i--) {
			if (i != temp.size() - 1) {
				for (int j = i; j <= i; j++) {
					test *= 3;
					answer += (temp.get(i) * test);
				}
			} else if (i == temp.size() - 1) {
				answer += (temp.get(i) * 1);
			}
			
		}
        
        
        return answer;
    }
}
