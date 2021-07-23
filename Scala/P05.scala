import scala.collection.mutable.ListBuffer

def reverse(arr:List[Int]):Unit={
    var x:Int=arr.length-1

    var rev_list=new ListBuffer[Int]()
    while(x>=0){
        rev_list+=arr(x)
        x=x-1
    }

    val fin_list=rev_list.toList
    println(fin_list)
}

var list=List(1, 1, 2, 3, 5, 8)
reverse(List(1, 1, 2, 3, 5, 8))

// println(list(3))