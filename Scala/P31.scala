def isPrime(x:Int):Unit={
    var counter:Int=0
    if (x==0 || x==1){
        println("Not a prime")
    }
    else{
        var i:Int=2
        while(i<=x/2){
            if(x%i==0){
                counter=1
                
            }
            i=i+1
        }

        if (counter==1){
            println("Not a prime")
        }
        else{
            println("It is a prime!")
        }
    }
}

println("Enter the number: ")
var x= scala.io.StdIn.readInt()
isPrime(x)