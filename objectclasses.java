// class definition: this is a template for creating chatbot object
class Chatbot {
    // attributes
    String name;
    String purpose;

    // constructor: initializes chatbot objects
    Chatbot(String name, String purpose) {
        this.name = name;
        this.purpose = purpose;
    }

    // method: sims chatbot responding
    void respond() {
        System.out.println(name + " (" + purpose + " Chatbot ): Hello, how may I assist you?");
    } 
}

// main class where objects are created and used
public class objectclasses {
    public static void main(String[] args) {
        // create chatbot objects from chatbot class
        Chatbot newsBot = new Chatbot("NewsBot", "News Update");
        Chatbot weatherBot = new Chatbot("WeatherBot", "Weather Forecast");
        Chatbot aiBot = new Chatbot("AIBot", "AI Conversation");

        //display responses
        System.out.println("Chatbot Conversations:");
        newsBot.respond();
        weatherBot.respond();
        aiBot.respond();
    }
}