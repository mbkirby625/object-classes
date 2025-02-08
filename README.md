# object-classes
Java project that demonstrates the difference between objects and classes using a simple example. Includes code, explanation, and comments 

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
