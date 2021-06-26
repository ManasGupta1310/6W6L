package main

import (
	"fmt"
	"math"
)

func in_range(d float64) bool {
	if d < 0.0 {
		d = -d
	}
	if d < 0.0001 {
		return true
	}
	return false
}

func Sqrt(x float64) float64 {
	z := 1.0
	tmp := 0.0
	for {
		tmp = z - (z*z-x)/(2*z)
		d := tmp - z
		if in_range(d) {
			return tmp
		}
		z = tmp
	}

}

func main() {
	approach := Sqrt(2)
	actual := math.Sqrt(2)

	fmt.Println(Sqrt(2))
	fmt.Println(math.Sqrt(2))

	diff := actual - approach
	fmt.Println(diff)
}
