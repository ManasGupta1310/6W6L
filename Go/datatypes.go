//go has several datatypes which we can declare while declaring variable

package main
import (
	"fmt"
	// "math/cmplx"
)

func main(){
	var(
	a int=2
	b uint32=434
	c string="hello"
	d complex64=-5+2i
	e bool= true
	)

	fmt.Printf("Type: %T Value: %v\n", a, a)
	fmt.Printf("Type: %T Value: %v\n", b, b)
	fmt.Printf("Type: %T Value: %v\n", c, c)
	fmt.Printf("Type: %T Value: %v\n", d, d)
	fmt.Printf("Type: %T Value: %v\n", e, e)
}