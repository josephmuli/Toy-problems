# Write a function that accepts a number and return a boolean based on 
#whether it's a prime number.


def prime(input):
	if input > 1:
		for i in range(2,input):
			if(input % i == 0):
				print("False")
			else:
				print("True")
				
	else:
		print("I can't even start man! number should be +1")

		

prime(0.5);