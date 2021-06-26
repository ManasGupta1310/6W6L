package main

import (
	"fmt"
	"golang.org/x/tour/pic"
)

//struct:=
//type a struct {
//	int a
//	int b
//}
//
//a{1,2} //declaration of a struct


//array:=
//var a [2]int
// a[0]=1
// a[1]=2
//vae b=int

func Pic(dx, dy int) [][]uint8 {
	pic := make([][]uint8, dy)
    for i := range pic {
        pic[i] = make([]uint8, dx)
        for j := range pic {
            pic[i][j] = uint8((j ^ i) * (10 ^ (i * j)))
        }
    }
    return pic
}

func main() {
	pic.Show(Pic)
}