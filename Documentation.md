#Project_Documentation

<p>In the first week, we have gone through the Python scripts for the <b>Command Line Interface</b> and <b>Asynchronous IO</b> module. These have added a wide knwoledge to our <b>Python</b> arsenal.
</p>
<p>
Python is a very user friendly language which provides a wide range of libraries and modules which can be imported to make our code efficient and short. These libraries provide users with access to several features and helps users dive deep into the language.
</p>
<p>
We started our project by learning about Command Line Interface using Python scripts. We use Python code to implement command line scripts and run them the same way as we do in the command prompt. Python makes it easier to form a command line interface using in-built library <b>"argparse"</b>
</p>
We can import argparse library in our code as:
<p>
import argparse
</p>
<p>
Ahead of immporting the library we have to initiate our parser, addd arguments and then pass the parser and its arguments.
</p>
<br>
<ul type="dashed">
    <li>parser=argparse.ArgumentParser()</li>
    <li>parser.add_arguments()</li>
    <li>args=parser.parse_args()</li>
</ul>
<br>
<p>
We can create command lines like pwd, find, copy, echo, etc. as  I have added in this repository. Do check them out. They also use <b>sys</b> and <b>os</b> libraries.
</p>