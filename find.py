import argparse
import os
import sys

parser=argparse.ArgumentParser(description="Find a directory or file in given directory")
parser.add_argument("find", metavar="find", help="Finding a file or directory")
parser.add_argument('Path', metavar='path', type=str, help="Path of the file")
parser.add_argument("-name", type=str, help="Name of the file", action="store")
args=parser.parse_args()

input_path=args.Path

if args.find:
    if args.name:
        for line in os.listdir(input_path):
            if line==args.name:
                print(line)
                break
            else:
                print("No such file exists")
                break
    else:
        print('\n'.join(os.listdir(input_path)))
