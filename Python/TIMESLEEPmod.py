import time

def count():
    print("Hello")
    time.sleep(1)
    print("World")


def main():
    for _ in range(3):
        count()


s=time.perf_counter()
main()
s=time.perf_counter()-s
print(f"{__file__} Elapsed time: {s:0.2f} seconds")