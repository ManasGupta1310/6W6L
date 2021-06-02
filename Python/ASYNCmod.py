import asyncio


async def count():
    print("Hello")
    await asyncio.sleep(1)
    print("World")
async def main():
    await asyncio.gather(count(), count(), count())

import time
s=time.perf_counter()
asyncio.run(main())
elapsed=time.perf_counter()-s
print(f"{__file__} Elapsed time: {elapsed:0.2f} seconds")