def reverse_each_word(sentence):
	# TODO:
	# 1. Interate through each char
	# 2. Find the word and reverse
	# 3. Repeat 1 & 2
	my_word = ""
	reversed_sentence = ""
	for char in sentence:
		if char.isalpha() or char.isnumeric():
			my_word = my_word + char
		else:
			reversed_sentence += my_word[::-1] + char
			my_word = ""
	print(reversed_sentence)
	return reversed_sentence


def main():
	test_str = "String;   2be reversed..."
	assert reverse_each_word(test_str) == "gnirtS;   eb2 desrever..."
	return 0


if __name__ == '__main__':
	main()




#******************************************************************************
# Shared by rajatm@applicantz.ai
#Coding problem: 45 minute time limit.

# PROBLEM DEFINITION
# ------------------
# Reverse each word in the input string.
# The order of the words will be unchanged.
# A word is made up of letters and/or numbers.
# Other characters (spaces, punctuation) will not be reversed.

# NOTES
# ------
# Write production quality code
# We prefer clarity over performance (though if you can achieve both - great!)
# Solutions should be in Python
# A working solution is preferred (assert in main() should succeed)
# Bonus points for good tests

# def reverse_each_word(sentence):
#     # TODO: Implement this function
#     return
#
# def main():
#     test_str = "String;   2be reversed..."
#     assert reverse_each_word(test_str) == "gnirtS;   eb2 desrever..."
#     return 0
#******************************************************************************
