import scala.collection.mutable.ListBuffer

def contains(m:Int, list:ListBuffer[Int]):Int={
    var y:Int=0
    while(y<list.length){
        if(m==list(y)){
            return 0
        }
        y+=1
    }

    return 1
}

def randomSelect(n:Int, arr:List[Symbol]):Unit={
    var x:Int=0
    var rand_list=new ListBuffer[Int]()
    while(x<n){
        var r =scala.util.Random
        var temp=r.nextInt(arr.length)

        if (contains(temp,rand_list)==1){
            rand_list+=temp
            x+=1
        }
    }

    val fin_list=rand_list.toList

    var k:Int=0
    var randomSelect_list=new ListBuffer[Symbol]()
    while(k<fin_list.length){
        randomSelect_list+=arr(fin_list(k))
        k+=1
    }

    val final_list=randomSelect_list.toList
    println(final_list)
}



randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))