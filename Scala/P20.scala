import scala.collection.mutable.ListBuffer

def removeAt(n:Int,arr:List[Symbol]):Unit={
    var x:Int=0
    var rem_list=new ListBuffer[Symbol]()
    var i:Int=0
    while(x<arr.length){
        if(x!=n){
           rem_list+=arr(x)
        }
        else{
            i=x
        }
        
        x+=1
    }

    val fin_list=rem_list.toList
    var t1=(fin_list, arr(i))
    println(t1)
}

var list=List('a, 'b, 'c, 'd)
removeAt(1, List('a, 'b, 'c, 'd))