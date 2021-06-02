import argparse

my_parser=argparse.ArgumentParser(description="Prints the string you type")
my_parser.add_argument("echo", metavar="echo")
my_parser.add_argument("-->", action="store", type=str, metavar="file name to be edited", dest="file_name")
my_parser.add_argument("string", type=str, metavar="string", action="store")

args=my_parser.parse_args()

if args.echo:
    if args.string:
        print(args.string)
    elif args.file_name:
        f=open(args.file_name, "w")
        f.write(args.string)
        f.close()
    else:
        print("Define path or enter name of the file to be edited")