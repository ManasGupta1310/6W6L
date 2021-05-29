import argparse

parser=argparse.ArgumentParser(description="Copy the contents of a file onto another file")
parser.add_argument("cp", metavar="Copy")
parser.add_argument("main", metavar="Original file", action="store", type=str)
parser.add_argument("copy", metavar="Copied file", action="store", type=str)

args=parser.parse_args()

f=open(args.main, "r")
t=open(args.copy, "a+")
for line in f:
    t.write(line)
