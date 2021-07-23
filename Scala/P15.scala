import scala.collection.mutable.ListBuffer

def duplicate(n:Int,arr:List[Symbol]):Unit={
    var x:Int=0
    var dup_list=new ListBuffer[Symbol]()
    var i:Int=0
    while(x<arr.length){
        for(i<-1 to n){
            dup_list+=arr(x)
        }
        x+=1
    }

    val fin_list=dup_list.toList
    println(fin_list)
}

var list=List('a, 'b, 'c, 'c, 'd)
duplicate(3,List('a, 'b, 'c, 'c, 'd))