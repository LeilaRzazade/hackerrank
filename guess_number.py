#This is random number generator program.
#You should guess the random generated number.
import random
random_num = random.randint(1,100)
user_input = int(input("Guess the number: "))
if (user_input == random_num):
    print("Congratulations! Guessed number is: ", user_input)
while(user_input != random_num):
    if(user_input == random_num):
        print("Congratulations! Guessed number is right.")
        break
    else:
        if(user_input > random_num):
            print("Your number is not right. It's too high.")
            user_input = int(input(("Enter a new number: ")))
        else:
            print("Your number is not right. It's too low.")
            user_input = int(input(("Enter a new number: ")))
print("Congratulations! Guessed number is: ", user_input)
