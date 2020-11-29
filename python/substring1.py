def subString(str, len):
    for i in range(len): # range(len) --> 0,1,2,3
        count = 0;
        for len in range(i+1, len+1):  # --> i: 0->1,  1-> 2, 2->3, 3->4   < len+1=5, means upto 4
            print(s[i:len]);
            count=count+1;
s = "abcd";
subString(s, len(s)); # len(s) = 4