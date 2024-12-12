attempts = 5
word_to_guess = 'Mark'

while attempts > 0:
    guess = input('Guess the word. ')
    
    if guess < word_to_guess:
        print('Too low')
    elif guess > word_to_guess:
        print('Too long')  
    elif guess != word_to_guess:
        print('Wrong')
    else:
        print('Congrats you guess it')    
        break
        
    attempts -= 1
    print('attempt left' , attempts)   
    
    if attempts == 0:
        print('Out of attempts the answer is' , word_to_guess)
             