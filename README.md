# Miscellaneous
This repository showcases my coding journey, featuring a collection of projects that span my free-time exploration, interview preparations, and code developed during my college years. Dive into a diverse range of coding challenges, exercises, and solutions that reflect my evolving skills and passion for programming. Whether it's a snippet crafted during moments of curiosity, solutions honed for interviews, or nostalgic code from my academic days, this repository encapsulates the essence of my coding odyssey.

DA Folder: In the 'DA' folder, you'll find a text file and a Java program that I crafted for a coding test in Data Annotation. The task involved processing a text file, where each line contained a number and an associated word (e.g., '296 land'). The goal was to sort this data into a binary tree and extract the value of the furthest right node at each level, converting it back into the corresponding word.
  My approach to this challenge took a unique path. I designed three distinct functions for efficiency: a 'counter' function to tally the lines in the file, a 'mapper' function to correlate numbers with their respective words, and a 'translate' function that decoded the file. Instead of constructing a binary tree in the conventional ascending order, I observed a pattern. Starting with 1, the next node to be read was determined by adding the height of the tree to the current node. For instance, if the tree was in ascending order, the sequence began with 1, followed by 3, then 6, and so on.
  In my 'translate' function, I utilized a for loop to implement this logic, efficiently printing out the encoded words. While others might have opted for binary tree construction and employed a greedy algorithm to navigate down every right node, my approach aimed at simplifying the process and unveiling a different perspective on tackling such problems.
