package main
import "fmt"
import "os"
import "bufio"
//import "strconv"
func calcOperations(s string) int {
    acc := 0
    n := 0
    
    rune := make([]rune, len(s))
    for _, r := range s { 
            rune[n] = r
            n++
    } 
    rune = rune[0:n]
    for i := 0; i < n/2; i++ { 
        //val1 := strconv.QuoteRuneToASCII(rune[i])
       // val2 := strconv.QuoteRuneToASCII(rune[n-i-1])
        val1 := int(rune[i] - '0')
        val2 := int(rune[n-i-1] - '0')
        //fmt.Println(val2)
        if (val2 - val1 < 0) {
            acc -= val2 - val1
        } else {
            acc += val2 - val1
        }
    } 
    return acc
}
func main() {
 //Enter your code here. Read input from STDIN. Print output to STDOUT
        // Get number of lines
    var lines int
    _, err := fmt.Scanf("%d", &lines)
             if err != nil {
                 fmt.Println(err)
                 os.Exit(1)
         }
        scanner := bufio.NewScanner(os.Stdin)
    for scanner.Scan() {
        line := scanner.Text()
        if line == "." {
            break
        }
        
        acc := calcOperations(line)
        
        // do ASCII subtraction between current letter to letter reversed
        // accumulate the value 
        
        // If at middle or past median : stop and output answer
        fmt.Println(acc) // or do something else with line
    }
}