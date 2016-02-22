# GIGASECOND ANNIVERSARY
# LANGUAGE: PYTHON

# Write a function that will calculate the date that someone will 
#celebrate their 1 gigasecond anniversary.

# Note: A gigasecond is one billion (10**9) seconds.

# The input is three parameters representing someone's birthday.

# As a convenience for celebration planning, the function should also 
#calculate the day of the week and the number of days from today.

# The output should be an array formatted as such: ["YYYY-MM-DD", 'day_of_the_week', days_until]

# Examples:

# gigasecond(1988, 5, 15) # ["2020-01-22", "Wednesday", "1764 days left"] 32y 4m 7d
# gigasecond(2015, 2, 17) # ["2046-10-26", "Friday", "11538 days left"]  31y 8m 9d

from datetime import timedelta, date

def gigasecond():
	#birthday of individual
	print("With a birthday of Feb 2,1920")
	bdyear = date(1920, 2, 2)
	
	#duration of anniversary
	year = timedelta(seconds=(10**9))
	
	print(bdyear) #prints out birthday of user
	print(year) #prints out duration
	annYear = bdyear + year;
	print("The anniversary date after 1 billion seconds: ")
	print(annYear)
	
	


gigasecond()




