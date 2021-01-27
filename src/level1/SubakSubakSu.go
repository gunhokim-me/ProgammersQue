func solution(n int) string {
    a := "수"
    b := "박"
    c := ""
    for i := 1; i <=n; i++{
        if i % 2 == 0 {
           c += b 
        }else{
            c += a
        }
    }
    return c
}
