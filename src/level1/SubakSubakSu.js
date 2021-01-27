function solution(n) {
    var answer = '';
    var su ='수';
    var bak = '박';
    for(var i = 1; i <= n; i++){
        if(i % 2 == 0){
            answer += bak;
        }else{
            answer += su;
        }
    }
    return answer;
}
