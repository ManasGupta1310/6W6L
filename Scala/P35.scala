import scala.util.control.Breaks._
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

println("Enter the number!")
var num:Int=scala.io.StdIn.readInt()
var arr= new ListBuffer[Int]()  
while(num!=1){
    breakable{
        for(i<-2 to num){
            if ((num%i==0)&&(isPrime(i)==1)){
                num=num%i
                arr+=i
                break
            }
        }
    }
}

val fin_list=arr.toList
println(fin_list)