package main
import "fmt"

var a,b,c int // declared the variables
func main(){
	var fool bool
	fmt.Println(a,b,c,fool) // default values
	a, b, c, fool=1,3,4,true //initialised the variable with values
	fmt.Println(a,b,c,fool)

	k:=2 //short variable declaration and initialisation
	fmt.Println(k)
}