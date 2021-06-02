print("Enter number one:")
num1=gets.chomp()
print("Enter number two:")
num2=gets.chomp()
print("Enter the operator:")
op=gets.chomp()

if op=="+"
    puts("The sum is "+(num1.to_f+num2.to_f).to_s)
elsif op=="-"
    puts("The difference is "+(num1.to_f-num2.to_f).to_s)
elsif op=="*"
    puts("The product is "+(num1.to_f*num2.to_f).to_s)
elsif op=="/"
    puts("The quotient is "+(num1.to_f/num2.to_f).to_s)
elsif op=="**"
    puts(num1+" raised to the power "+num2+" is "+(num1.to_f**num2.to_f).to_s)
elsif op=="%"
    puts("The modulo is "+(num1.to_f%num2.to_f).to_s)
else
    puts("Invalid operator!!")
end