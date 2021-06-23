package main
import "fmt"

func add(x int , y int) int {
	return x+y
}

//Can also be written like this--------
// func add(x , y int) int {
// 	return x+y
// }

func main(){
	fmt.Println("The sum of 5 and 6 is", add(5,6))
}