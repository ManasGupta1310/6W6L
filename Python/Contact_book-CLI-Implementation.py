"""
This is a contact-book CLI whihc stores contact info.
For storing use -save followed by name phone and address with spaces
For viewing use -list
For finding a contact by name use -find followed by the name

"""

import argparse
import csv


parser=argparse.ArgumentParser(description="Save contact info in a CSV file, read its content and find the contact")

parser.add_argument("-save", action="store", nargs=3, dest="save", metavar="Save", help="Enter your name, phone number and address")
parser.add_argument("-list", action="store_true", dest="list", help="Displays the contacts")
parser.add_argument("-find", action="store", dest="find", help="Finds the contact by name", nargs=1)

args=parser.parse_args()


if args.save:

    name=args.save[0]
    phone=args.save[1]
    address=args.save[2]

    csv_file=open("Contact.csv", "a", encoding="utf-8")
    csv_writer=csv.writer(csv_file)
    csv_writer.writerow([name, phone, address])
    csv_file.close()

if args.list:
    try:
        f=open("Contact.csv", "r")
        for line in f:
                print(line, end="")
        f.close()
    except:
        print("No such file exists! No contacts saved yet!")

if args.find:
    f=open("Contact.csv", "r")
    found=0
    for line in f:
        arr=line.split(",")
        if arr[0].lower()==args.find[0].lower():
            print(line, end="")
            found=found+1
    
    if found==0:
        print("No such contact found!")
    f.close()