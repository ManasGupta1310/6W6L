package main

import (
	"fmt"
	"math"
)

type ErrNeg float64

func (e ErrNeg) Error() string{
	return fmt.Sprintf("cannot Sqrt negative number: %v", e)
}

func in_range(d float64) bool {
	if d < 0.0 {
		d = -d
	}
	if d < 0.0001 {
		return true
	}
	return false
}

func Sqrt(x float64) (float64, error) {
	if  x<0 {
		return 0, ErrNeg(x)
	}	
	z := 1.0
	tmp := 0.0
	for {
		tmp = z - (z*z-x)/(2*z)
		d := tmp - z
		if in_range(d) {
			return tmp, nil
		}
		z = tmp
	}

}

func main() {
	approach, error := Sqrt(2)
	actual := math.Sqrt(2)
	
	fmt.Println(error)
	fmt.Println(Sqrt(2))
	fmt.Println(math.Sqrt(2))

	diff := actual - approach
	fmt.Println(diff)

	a, err:=Sqrt(-2)
	fmt.Println(a,err)
}
