import argparse

parser=argparse.ArgumentParser(description="Read the content of a file")
parser.add_argument("cat", metavar="concat")
parser.add_argument("Filename", type=str, metavar="Name", action="store")
args=parser.parse_args()

f=open(args.Filename)

if args.cat:
    if args.Filename:
        for line in f:
            print(line, end="")
        # print()