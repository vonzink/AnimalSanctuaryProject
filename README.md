# AnimalSanctuaryProject


## Description

using a UML diagram to make software that tracks Animals in a Sanctuary. 
Using the fundementals of OOP to call upon the subclass in the package. 


## technologies used
 - Java
 - Eclipse
 - Git/GitHub
 - Sublime Text Editor
 - zsh

 ## Concepts Applied

  - Conditional Statements
  - Mod, casting
  - for loops
  - constructors and getters and setters
  - Switch
  - global fields
  - 

 ## Lessons Learned

    - work from the bottom up.
    - follow the instructions!! 
    - the importances of interpreting the UML diagram correctly.
    -   underline = static
    -   minus i private, + is Public
    -   Fields in the center box Methods at the bottom. 
    -   shows the parameters and attributeds of the parameters
    -   aarows show the inheratance



 ## Notes

    Sticking to the assignment. 

    Working from the bottom up.

    ### Animal Subclass. 
    I added the Private static String noise and initalized it. 
    Had eclipes make the constructor and the getter and the setter . 
    added the two methods and @Override tag. 

    Copied it to all the animals in the subclass. 

    ### Animal Class.  
    added private String name, Eclipes auto genetered construction and get/set
    added the make Noise and Eat Methods..  

    ### Attendant
    this is where things get tricky, I didnt have a animal Array, I ended up creating one in Animial and then moving it to Sanctuary, and then to Main. used a simple for loop and then an if statement to match the assignments required output. The Array gave me the most trouble on this part. 

    ### Sanctuary
    I started with creating the two private fields. Had Eclipse make getters and setters. Added the listAnimal method.. thought about using a ternary for loop but i needed really need the variable so just did a simple if else. 

    ### AnimalSanctuaryApp
    added the constructor and the scanner. The Sanctuary opject is private so i added the getters and setters and moved main to the bottom. having issues using switches for the meunues. Moved everything i was building in main to launchApp. 

    did a git commit at 1:47 before breacking appart my menu case into individual Methods. 

    splitting into methods helped a lot. Had to adjust the loops in the Sanctuary class to add returns so they would break out of the loop. had to change the app.getSan to this.getSan to modify the name in the Sanctuary field when i moved it out of Main. 

    Working Code: commiting before going in to inprove it. 








