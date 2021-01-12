import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
       	Arrays.sort(stages);
		int[] answer = new int[N];

		double[] avg = new double[N];
		int same = 0;
		int dif = 0;

		for (int i = 1; i <= N; i++) {
			same = 0;
			dif = 0;
			answer[i-1] = i;
			for (int j = 0; j < stages.length; j++) {
				if (i == stages[j]) {
					same++;
				} else if (i < stages[j] || N+1 == stages[j]) {
					dif++;
				}
			}
            
            			if (same == 0) {
				avg[i-1] = 0.0;
			}else if(same != 0){
				avg[i-1] = (double)same/(dif+same);
			}
		}
for(int i = 0; i < avg.length; i++){
			for(int j = 0; j < avg.length -i -1; j++){
				if(avg[j+1] > avg[j]){
					int temp = answer[j];
					answer[j] = answer[j+1];
					answer[j+1] = temp;
					
					double temp1 = avg[j];
					avg[j] = avg[j+1];
					avg[j+1] = temp1;
					
				}
			}
		}
        return answer;
    }
}
