# Project_Documentation

<p>In the first week, we have gone through the Python scripts for the <b>Command Line Interface</b> and <b>Asynchronous IO</b> module. These have added a wide knwoledge to our <b>Python</b> arsenal.
</p>
<p>
Python is a very user friendly language which provides a wide range of libraries and modules which can be imported to make our code efficient and short. These libraries provide users with access to several features and helps users dive deep into the language.
</p>
<br><br>

## CLI
We started our project by learning about Command Line Interface using Python scripts. We use Python code to implement command line scripts and run them the same way as we do in the command prompt. Python makes it easier to form a command line interface using in-built library <b>"argparse"</b>

We can import argparse library in our code as:

```python
import argparse
```

<p>
Ahead of immporting the library we have to initiate our parser, addd arguments and then pass the parser and its arguments.
</p>
<br>

```python
parser=argparse.ArgumentParser()
parser.add_arguments()
args=parser.parse_args()
```
<br>
<p>
We can create command lines like pwd, find, copy, echo, etc. as  I have added in this repository. Do check them out. They also use <b>sys</b> and <b>os</b> libraries.
</p>
<br><br>

## AsyncIO
Then we move on to the <b>Asynchronous IO</b> module. We came to know about asyncio and await keywords and their usage in python scripts. We also came across terms like <b>Threading</b>, <b>Multiprocessing</b>, <b>Concurrency</b> and <b>Parallelism</b>. 

<br>
<ol>
    <li><b>Multiprocessing</b>: Multiprocessing is a means to effect parallelism, and it entails spreading tasks over a computer’s central processing units (CPUs, or cores). Multiprocessing is well-suited for CPU-bound tasks: tightly bound for loops and mathematical computations usually fall into this category.</li>
    <li><b>Threading</b>: Threading is a concurrent execution model whereby multiple threads take turns executing tasks. One process can contain multiple threads. Python has a complicated relationship with threading thanks to its GIL, but that’s beyond the scope of this article.</li>
    <li><b>Concurrency</b>: Concurrency is a slightly broader term than parallelism. It suggests that multiple tasks have the ability to run in an overlapping manner. (There’s a saying that concurrency does not imply parallelism.)</li>
    <li><b>Parallelism</b>: Parallelism consists of performing multiple operations at the same time.</li>
</ol>
<br>
<p>
AsyncIO is a single-process single-threaded design which makes use of co-operative multi-tasking. Asyncio makes use of coroutines which is a specialized version of a Python generator function.
</p>
<p>
AsyncIO uses await function which cedes control to some other function more readily available to do something while it awaits its results. We also come across the difference between time.sleep() and await.sleep(). You can run the codes and see the difference for yourself.
</p>
<p>
There are several rules regarding the syntax of asyncio module.
</p>
<p>
Asyncio module provides API to manage and run coroutines.
</p>
