import argparse
import os

my_parser=argparse.ArgumentParser(description="Prints the string of current directory")
my_parser.add_argument("pwd", metavar="pwd")
args=my_parser.parse_args()

if args.pwd:
    print(os.getcwd())