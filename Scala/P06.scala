def isPalindrome(arr:List[Int]):Unit={
    var x:Int=0
    var count:Int=0
    while(x<arr.length/2){
        
        if(arr(x)!=arr(arr.length-1-x)){
            count+=1
        }
        x=x+1
    }

    if(count==0){
        println("List is a palindrome")
    }
    else{
        println("List is not a palindrome")
    }
}

var list=List(1, 2, 3, 2, 1)
isPalindrome(List(1, 2, 3, 2, 1))
