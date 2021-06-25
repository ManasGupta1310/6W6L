package main

import "fmt"

func main(){
	const a=5
	fmt.Println(a)
	//a=3 //error: cannot assign to a (declared const)
	// fmt.Println(a)
}