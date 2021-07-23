import scala.collection.mutable.ListBuffer

def insertAt(s:Symbol,n:Int,arr:List[Symbol]):Unit={
    var x:Int=0
    var ins_list=new ListBuffer[Symbol]()
    while(x<arr.length){
        if(x!=n){
           ins_list+=arr(x)
           x+=1
        }
        else{
            ins_list+=s
            ins_list+=arr(x)
            x+=1
        }
        
    }

    val fin_list=ins_list.toList
    println(fin_list)
}

var list=List('a, 'b, 'c, 'd)
insertAt('new, 1, List('a, 'b, 'c, 'd))