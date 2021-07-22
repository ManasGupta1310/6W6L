def gcd( a:Int, b:Int):Unit={
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

    println("The GCD is "+ x)
}

println("Enter x:")
var x=scala.io.StdIn.readInt()
println("Enter y:")
var y=scala.io.StdIn.readInt()
gcd(x,y)

