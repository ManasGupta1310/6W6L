import scala.util.control.Breaks._

def isPrime(x:Int):Int={
    
    var counter:Int=0
    if (x==0 || x==1){
        return 0
    }
    else{
        var i:Int=2
        while(i<=x/2){
            if(x%i==0){
                counter=1
            }
            i=i+1
        }

        if (counter==1){
            return 0
        }
        else{
            return 1
        }
    }
}

println("Enter the number")
var num:Int=scala.io.StdIn.readInt()
var i:Int=1

while(i<=num/2){
    if ((isPrime(i)==1)&&(isPrime(num-i)==1)){
        var rem:Int=num-i
        println(num + "=" + i + "+" + rem)
        break
    }
    i=i+1
}