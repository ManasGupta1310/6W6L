import scala.collection.mutable.ListBuffer

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

println("Enter the lower limit: ")
var x= scala.io.StdIn.readInt()
println("Enter the lower limit: ")
var y:Int=scala.io.StdIn.readInt()
var arr= new ListBuffer[Int]()  

var i:Int=x
while(i<=y){
    println(i)
    if(isPrime(i)==1){
        arr+=i
    }
    i=i+1
}
val fin_list=arr.toList
println(fin_list)