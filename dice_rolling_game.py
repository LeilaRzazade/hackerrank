import random
print("Hello! This is 'Dice Rolling' simulator game. It has 8 sides.")
user_button = input("Press the 'p' button : ")

while(user_button != 'q' and user_button=='p'):
        print(random.randint(1,8))
        user_button = input("If you want to roll again, press 'p' button.\nIf you want to quit, press 'q' button: ")
        if(user_button == 'q'):
            break;
        elif(user_button != 'p'):
            while(user_button!='p' and user_button!='q'):
                user_button = input("You can press only 'p' and 'q' buttons!")

