import scala.collection.mutable.ListBuffer

def split(n:Int,arr:List[Symbol]):Unit={
    var x:Int=0
    var first_list=new ListBuffer[Symbol]()
    var second_list=new ListBuffer[Symbol]()

    while(x<n){
        first_list+=arr(x) 
        x+=1   
    }

    while(x<arr.length){
        second_list+=arr(x)    
        x+=1
    }

    val fin_list=first_list.toList
    val fin2_list=second_list.toList
    var t1=(fin_list,fin2_list)
    println(t1)
}

var list=List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
split(3,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))