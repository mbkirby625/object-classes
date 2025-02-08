# object-classes
Classes and objects are fundamental in object oriented programming, but they have different roles. A class is a template that defines fields/attributes and methods that objects created from it will have (Horstmann, 2016, p. 376). It doesn't hold any actual data itself but specifies what an object of that type should have. It serves as a design template that multiple objects can be created from, making sure that there is consistency throughout the structure.&nbsp;

An object is an instance of a class. It represents an implementation of the template, with its own values given to its fields (Horstmann, 2016, p. 376). Each object created from a class has its own copies of attributes, so multiple objects from the same class can exist with different values. When an object is created, memory is allocated for it and is given specific characteristics based on class definition.`

As an example of the difference, we can think of a class as a template for a house. The template's not something physical we can use, it just defines the structure of the house, including number of rooms, layout, and design. We can't physically live in it, it only serves as a set of instructions (Horstmann, 2016, p. 377). When we use the template to build a house, we create an object, which is a physical representation of said design. Multiple houses can be built from this same template, but each one has its own structure with unique characteristics, like color and furniture.

To reiterate, in Java, a class defines how an object should be created, while an object is an instance of the class with its own unique values.

References

Horstmann, C. S. (2016). Big Java: Late Objects (2nd ed.). Wiley. 

## Code Example
```java
// class definition: this is a template for creating chatbot objects
class Chatbot {
    String name;
    String purpose;

    Chatbot(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    void respond() {
        System.out.println(name + " (" + purpose + " Chatbot): Hello, how may I assist you?");
    }
}
