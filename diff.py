def bossFight():
    charachter = input("choose class(warrior,healer or wizard): ")
    if charachter == "warrior":
        userInput = input("fight or shield")
        if userInput == "fight":
            print("you defeated the boss")
        elif userInput == "shield":
            print("you defeated the boss")
        else:
            print("you lost")
    if charachter == "healer":
        userInput = input("heal K. or E. (type K or E): ")
        if userInput == "K":
            print("you defeated the boss")
        elif userInput == "E":
            print("you defeated the boss")
        else:
            print("you lost")
    if charachter == "wizard":
        userInput = input("shield or beam: ")
        if userInput == "shield":
            print("you defeated the boss")
        elif userInput == "beam":
            print("you defeated the boss")
        else:
            print("you lost")








            