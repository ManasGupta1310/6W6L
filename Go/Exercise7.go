package main
import "golang.org/x/tour/reader"

type MyReader struct{}

func (r MyReader) Read(b []byte) (int, error) {
  a := 'A'
  for i:=0; i < len(b); i++ {
    b[i] = a 
  }
  return len(b), nil
}

func main() {
  reader.Validate(MyReader{})
}
