package main
import "fmt"

func swap(x,y int)(int,int){
	return y,x
}

func main(){
	fmt.Println("Before swap: 5 3")
	a,b:=swap(5,3)  //:= initiates and assigns value to Variable
	fmt.Println("After swap:", a, b)
	
}