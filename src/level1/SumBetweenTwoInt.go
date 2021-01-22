func solution(a int, b int) int64 {
    sum := 0
    if a > b {
        for i := b; i <=a; i++{
            sum += i
        }
    }else if a < b{
        for i := a; i <=b; i++{
            sum += i
        }
    }else{
        sum = a
    }
    var i64 int64
    i64 = int64(sum)
    return i64
}
