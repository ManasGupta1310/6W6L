import scala.collection.mutable.ListBuffer


def slice(lo:Int, hi:Int,arr:List[Symbol]):Unit={
    var x:Int=0
    var slice_list=new ListBuffer[Symbol]()
    while(x<arr.length){
        if(x>=lo && x<hi){
            slice_list+=arr(x)
        }
        x+=1
    }

    var fin_list=slice_list.toList
    println(fin_list)
    
}

var list=List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
slice(3, 7, list)