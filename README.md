# Dedendency Inversion Principle

The D in SOLID Principles. 
  - Single responsibility principle
  - Open/closed principle
  - Liskov substitution principle
  - Interface segregation principle
  - __Dependency inversion principle__

## Textbook definition
High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend upon details. Details should depend upon abstractions.

## More readable definition
policy (high level) should not depend on detail (implementation), but detail should depend on policy. 
The higher-level policy should define an abstraction that it will call out to, where some detail implementation executes the requested action.

_(source: https://lostechies.com/derickbailey/2011/09/22/dependency-injection-is-not-the-same-as-the-dependency-inversion-principle/)_

## Sudo code excercise to get us thinking:
Given I have a lightbulb LB2300 and Switch SW9000 with the following public methods, write the code necessary for the switch to turn the light on and off. (10 mins)

```
LB2300
  - turnOn
  - turnOff
```
```
SW9000
  - isOn
  - press
```
With this code, what happens if the manufacturer of the LB2300 comes out with a new model? 
How can we write our switch to prevent this?

By creating an interface for the switchable objects, I've added a layer of abstraction. Is this really DIP?

Remember, high-level modules should not depend on low-level modules. Identify the high level and low level modules.
Who owns the abstraction?

Let's move the abstraction to the high-level module. Now, is this an example of DIP?
