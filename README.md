![Image description](https://i1.faceprep.in/ProGrad/face-logo-resized.png)

# ProGrad Lab | GOTTA CATCH EM ALL

## A Quick Introduction

A simple lab to explain about java inheritance 



## What should you do
```
Fork this repo
Clone this repo
Practice Java basics - operators, conditions, loops, class and object
```

## How To Submit
```
Upon completion, run the following commands:

git add .
git commit -m "ProGrad ID"
git push origin master

And finally, create a pull request so your ProGrad Mentor (PM) can review your work.
```

## Instructions
Go to Java Resources -> src folder. You will have two packages src/controller and src/model.
Do not modify the entire code. Instructions are given in comments. Edit the code as per the instructions given in the class files.

## Run the Project
Right-click on the project -> go to Run as -> Run on server. You can check the output in eclipse browser or in your browser.

## Testing
Right-click on the project -> go to Run as -> Junit Test. All the test cases must be evaluated.





## PROGRESSION - 1 
```
Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
String pokemonName
Int pokemonNumber

Generate appropriate getters and setters.
Generate a two-argument constructor in the Pokemon class
```

## PROGRESSION - 2 
```
Go to JAVA Resouces - src/model and create a child class called Bulbasaur inside the model package with the following arguments
String characteristics 
String type
String evolution
String baseExp

Bulbasaur must extend the Pokemon class
Generate appropriate getters and setters
Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
Use the predefined values given below as constructor arguments 
pokemonName = Bulbasaur
pokemonNumber = 001
characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
type = "POISON"
evolution = "IVYSAUR"
baseExp = "64" 
```


## PROGRESSION - 3
```
Go to JAVA Resouces - src/model and create a child class called Charizard inside the model package with the following arguments
String characteristics 
String type
String evolution
String baseExp

Charizard must extend the Pokemon class
Generate appropriate getters and setters
Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 

Use the predefined values given below as constructor arguments 
pokemonName = Charizard
pokemonNumber = 006
characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers."
type = "FIRE"
evolution = "CHARMELEON"
baseExp = "240" 
```


## PROGRESSION - 4
```
Go to JAVA Resouces - src/model and create a child class called Dragonite inside the model package with the following arguments
String characteristics 
String type
String evolution
String baseExp

Dragonite must extend the Pokemon class
Generate appropriate getters and setters
Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 

Use the predefined values given below as constructor arguments 
pokemonName = Dragonite
pokemonNumber = 149
characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism."
type = "DRAGON"
evolution = "DRATINI"
baseExp = "270" 
```

## PROGRESSION - 5
```
Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
String characteristics 
String type
String evolution
String baseExp

Mew must extend the Pokemon class
Generate appropriate getters and setters
Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.

Use the predefined values given below as constructor arguments 
pokemonName = Mew
pokemonNumber = 151
characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
type = "PSYCHIC"
evolution = "NONE"
baseExp = "64" 
```

## PROGRESSION - 6
```
Go to JAVA Resouces - src/model and create a child class called Pikachu inside the model package with the following arguments
String characteristics 
String type
String evolution
String baseExp

Pikachu must extend the Pokemon class
Generate appropriate getters and setters
Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.


Use the predefined values given below as constructor arguments 
pokemonName = Pikachu
pokemonNumber = 25
characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot."
type = "ELECTRIC"
evolution = "RAICHU"
baseExp = "112" 
```

## PROGRESSION - 7
```
Create the following objects in the PokemonController class located inside JAVA Resources - src/controller
Bulbasaur
Charizard
Dragonite
Mew
Pikachu

You getters to retrieve the value and pass to the request.setAttribute method.
```
