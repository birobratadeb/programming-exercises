# Python program to print all possible substrings of a given string
  
# Function to print all sub strings
def subString(s, n):
    # Pick starting point in outer loop and lengths of different strings for a given starting point
    for i in range(n):
        for len in range(i+1,n+1):
            print(s[i: len]);
 
# Python3 program to count number of substrings of a string 

def countNonEmptySubstr(str):
    n = len(str);
    return int(n * (n + 1) / 2);

# Driver program to test above function
s = "abcd";
subString(s,len(s));
print(countNonEmptySubstr(s));