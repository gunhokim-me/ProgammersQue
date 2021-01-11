import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
		Arrays.sort(citations);
		if(citations.length == citations[0]){
			answer = citations.length;
            return answer;
		}else if(citations.length < citations[0]){
			answer = citations.length;
            return answer;
			
		}else{
			for(int i = citations[0]; i <= citations[citations.length-1]; i++){
				int count = 0;
				for(int j = 0; j < citations.length; j++){
					if(i <= citations[j]){
						count++;
					}
				}

				if(i == count){
					answer = i;
                    break;
				}else if (i < count){
                    answer = i;
                }
			}
		}
       if(answer == 0){
			answer = citations[0];
			if(answer == 0){
				answer = citations[citations.length-1];
			}
		}
        return answer;
    }
}
