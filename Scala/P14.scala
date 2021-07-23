import scala.collection.mutable.ListBuffer

def duplicate(arr:List[Symbol]):Unit={
    var x:Int=0
    var dup_list=new ListBuffer[Symbol]()
    while(x<arr.length){
        dup_list+=arr(x)
        dup_list+=arr(x)
        x+=1
    }

    val fin_list=dup_list.toList
    println(fin_list)
}

var list=List('a, 'b, 'c, 'c, 'd)
duplicate(List('a, 'b, 'c, 'c, 'd))