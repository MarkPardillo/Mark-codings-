try_again = True
while try_again:
    cough = input("Do you have a cough? (Yes/No): ")           
    fever = input("Do you have a fever? (Yes/No): ")         
    breathing = input("Do you have difficulty in breathing? (Yes/No): ")

    if (cough.casefold() == "yes" or fever.casefold() == "yes" or breathing.casefold() == "yes"):
        print("You may have COVID-19 symptoms. ")
    else:
        print("You do not exhibit significant COVID-19 symptoms. Stay safe!")

    try_again = input('Do you want to try again? (Yes/No): ')
    if try_again.casefold() == 'no':
        break

print('Thank you for your cooperation')