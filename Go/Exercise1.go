package main

import (
	"fmt"
	"math"
)

func Sqrt(x float64) float64 {
}

func main() {
	approach := Sqrt(2)
	actual := math.Sqrt(2)

	fmt.Println(Sqrt(2))
	fmt.Println(math.Sqrt(2))

	diff = actual - approach
	fmt.Println(diff)
}
