# Multiples of 3 and 5
# If we list all the natural numbers below 10 that are multiples of 3 or 5, 
# we get 3, 5, 6 and 9. The sum of these multiples is 23.


# what to do:
# Find the sum of all the multiples of 3 or 5 below 1000.


def multiples():
	#total = [None]*1000
	total = range(1000)
	count3 = 0
	count5 = 0
	sumT = 0 
	for x in total:
		if  x%3 == 0:
			count3 += x
		elif  x%5 == 0:
			count5 += x
		sumT = count3 + count5
	print(sumT)		
			
multiples()