import scala.collection.mutable.ListBuffer

def range(lo:Int, hi:Int):Unit={
    var arr= new ListBuffer[Int]()

    var i:Int=lo

    while(i<=hi){
        arr+=i
        i+=1
    }

    val fin_list=arr.toList
    println(fin_list)
}

println("Enter the lower limit")
var lo:Int=scala.io.StdIn.readInt()
println("Enter the upper limit")
var hi:Int=scala.io.StdIn.readInt()
range(lo,hi)