Username = "Mark"
Password = "1234"


while True:
    
    typeUsername = input("Enter username: ")
    typePassword = input("Enter password: ")

 
    if typeUsername == Username and typePassword == Password:
        print("Log in successful")
        break
  
    else:
        print("Wrong username or password")
        try_again = input("Do you want to try again? (yes/no): ").strip().lower()
        
    
        if try_again != "yes":
            print("Okay")
            