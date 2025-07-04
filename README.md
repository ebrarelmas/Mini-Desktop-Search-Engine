In this project, you are expected to develop a program in Java programming language that implements a “mini 
desktop search engine”. The task performed by a search engine is to search through a collection of documents for 
specified keywords and return a list of the documents where the keywords are found.  
The content of a web page is obviously correlated with the words it contains. Your task is to design and 
implement an algorithm that processes the documents given as input and stores the words they contain in a 
corresponding binary search tree and calculate the frequency of each word in each file. You are given a set of 10 html 
documents. Also, you are given a list of words that should be ignored during this analysis, such as common short 
words (a, the, …), SGML/HTML tags (lines starting with <), and punctuations (“.”, “,”, ...). The punctuation is already 
separated from the words, so you do not have to worry about that. Also, you have to read one word at a time and 
add it to your binary search tree. The node structure for BST is as follows: 

![Ekran görüntüsü 2025-07-04 093347](https://github.com/user-attachments/assets/fa1611ea-8537-4305-ab06-db099a26c69e)

Example: 
Content of the input file: the first case is that of the wide flanged beam with convective heat transfer into 
the outer faces of the flanges. The second case considered is that of convective heat transfer into one side of 
a flat plate. 
Pre-order traversal:  
first,1  
case,2  
beam,1  
convective,2 
faces,1  
wide,1  
flanged,1  
heat,2  
flanges,1  
flat,1  
transfer,2  
into,2  
outer,1  
one,1  
second,1  
plate,1  
side,1 
