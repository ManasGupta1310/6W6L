package main

import (
	"golang.org/x/tour/wc"
	"strings"
)

func WordCount(s string) map[string]int {
	m:= make(map[string] int)

	for _, j:=range strings.Fields(s) {
		m[j]++
	}
	return m
}

func main() {
	wc.Test(WordCount)
}
