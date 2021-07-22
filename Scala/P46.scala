import java.lang.Boolean

def and(x:Boolean, y:Boolean):Boolean={
    if (x==true && y==true) return true
    else return false
}

def or(x:Boolean, y:Boolean):Boolean={
    if (x==false && y==false) return false
    else return true
}

def nand(x:Boolean, y:Boolean):Boolean={
    if (and(x,y)==true) return false
    else return true
}

def nor(x:Boolean, y:Boolean):Boolean={
    if (or(x,y)==true) return false
    else return true
}

def xor(x:Boolean, y:Boolean):Boolean={
    if ((x==true && y==false)||(x==false && y==true)) return true
    else return false
}

println("Enter true or false!")
var a:String=scala.io.StdIn.readLine()
var x:Boolean=Boolean.parseBoolean(a)
println("Enter true or false!")
var b:String=scala.io.StdIn.readLine()
var y:Boolean=Boolean.parseBoolean(b)
println("Enter the logical operator")
var op:String=scala.io.StdIn.readLine()

if(op=="and") {
    println(and(x,y))
}
else if(op=="or") {
    println(or(x,y))
}
else if(op=="nand") {
    println(nand(x,y))
}
else if(op=="nor") {
    println(nor(x,y))
}
else if(op=="xor") {
    println(xor(x,y))
}
else{
    println("Not a valid operator")
}