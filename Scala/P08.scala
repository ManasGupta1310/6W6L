import scala.collection.mutable.ListBuffer

def compress(arr:List[Symbol]):Unit={
    var x:Int=0
    var comp_list=new ListBuffer[Symbol]()

    while(x<arr.length){
        if (x==0){
            comp_list+=arr(x)
            x+=1
        }
        else{
            if(arr(x)==arr(x-1)){
                x+=1
            }
            else{
                comp_list+=arr(x)
                x+=1
            }
        }
    }

    val fin_list=comp_list.toList
    println(fin_list)
}

var list=List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
compress(list)