import scala.collection.mutable.ListBuffer

def drop(n:Int,arr:List[Symbol]):Unit={
    var x:Int=0
    var drop_list=new ListBuffer[Symbol]()
    var i:Int=1
    while(x<arr.length){
        if(i!=n){
            drop_list+=arr(x)
        }
        else{
            i=0
        }
        i+=1
        x+=1
    }

    val fin_list=drop_list.toList
    println(fin_list)
}

var list=List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
drop(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))