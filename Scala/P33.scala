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

println("Enter x:")
var x=scala.io.StdIn.readInt()
println("Enter y:")
var y=scala.io.StdIn.readInt()
if (gcd(x,y)==1){
    println("The numbers are Co-Primes")
}
else{
    println("The numbers are not Co-Primes")
}


