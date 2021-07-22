def gcd( a:Int, b:Int):Int={
    var x:Int=a
    var y:Int=b
    
    if (x<y){
        var temp:Int=x
        x=y
        y=temp
    }
    

    while(y!=0){
        var res:Int=x%y
        x=y
        y=res
    }

    return x
}

def totient(m:Int):Int={
    var count:Int=0
    var i:Int=1
    while(i<m){
        if (gcd(m,i)==1){
            count=count+1
        }
        i=i+1
    }

    return count
}

println("Enter m:")
var m=scala.io.StdIn.readInt()
println(totient(m))




