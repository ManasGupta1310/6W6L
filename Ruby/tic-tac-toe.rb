def display(cells)
    print("\t")
    for i in 0..8
        print cells[0][i]
    end
    print("\n\t----------\n")
    print("\t")
    for i in 0..8
        print cells[1][i]
    end
    print("\n\t----------\n")
    print("\t")
    for i in 0..8
        print cells[2][i]
    end
    print("\n\n")
end

def condition(cells)
    if cells[0][0]==cells[0][4] and cells[0][4]==cells[0][8] and cells[0][0]!=' '
        return 1
    elsif cells[1][0]==cells[1][4] and cells[1][4]==cells[1][8] and cells[1][4]!=' '
        return 1
    elsif cells[2][0]==cells[2][4] and cells[2][4]==cells[2][8] and cells[2][0]!=' '
        return 1
    elsif cells[0][0]==cells[1][4] and cells[1][4]==cells[2][8] and cells[0][0]!=' '
        return 1
    elsif cells[2][0]==cells[1][4] and cells[1][4]==cells[0][8] and cells[2][0]!=' '
        return 1
    elsif cells[0][0]==cells[1][0] and cells[1][0]==cells[2][0] and cells[0][0]!=' '
        return 1
    elsif cells[0][4]==cells[1][4] and cells[1][4]==cells[2][4] and cells[0][4]!=' '
        return 1
    elsif cells[0][8]==cells[1][8] and cells[1][8]==cells[2][8] and cells[0][8]!=' '
        return 1
    else
        return 0
    end
end

def tie(cells)
    flag=0
    for i in  0..2 do
        for j in  0..2 do
            if cells[i][4*j]=='X' or cells[i][4*j]=='O'
                flag=flag+1
            end
        end
    end

    if flag==9 
        return 1
    else 
        return 0
    end
end

cells=Array[[" "," ","|"," "," "," ","|"," "," "],[" "," ","|"," "," "," ","|"," "," "],[" "," ","|"," "," "," ","|"," "," "]]
display(cells)
k=0
while true do
    if k%2==0
        puts("User 1 : X")
        print("Enter the row and columm no. : ")
        i,j=gets.chomp().split(" ")
        if j.to_i>3 or i.to_i>3 or j.to_i<=0 or i.to_i<=0
            puts("No such row or column exists")
            redo
        elsif cells[i.to_i-1][4*(j.to_i-1)]!=' '
            puts("Cell already filled")
            redo
        else
            cells[i.to_i-1][4*(j.to_i-1)]='X'
        end
    else
        puts("User 2 : O")
        print("Enter the row and columm no. : ")
        i,j=gets.chomp().split(" ")
        if j.to_i>3 or i.to_i>3 or j.to_i<=0 or i.to_i<=0
            puts("No such row or column exists")
            redo
        elsif cells[i.to_i-1][4*(j.to_i-1)]!=' '
            puts("Cell already filled")
            redo
        else
            cells[i.to_i-1][4*(j.to_i-1)]='O'
        end
    end

    print("\n")
    display(cells)
    if condition(cells)==1
        break
    end

    if tie(cells)==1
        puts("Match tied!!")
        exit()
    end

    k=k+1
end
print("\n")
if k%2==0
    k=1
else
    k=2
end
puts("User "+k.to_s+" wins the match!!")

