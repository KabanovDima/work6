package Work3;

public class Greeter {

    private GreetingMessage greetingMessage;

    public Greeter(GreetingMessage greetingMessage) {
        this.greetingMessage = greetingMessage;
    }

    public String great(){
        return greetingMessage.getMessage();
    }

    //    private String formality;
//
//    public String greet() {
//        switch (this.formality) {
//            case "formal":
//                return "Good evening, sir.";
//            case "casual":
//                return "Sup bro?";
//            case "intimate":
//                return "Hello Darling!";
//            default:
//                return "Hello.";
//        }
//    }
//
//    public void setFormality(String formality) {
//        this.formality = formality;
//    }
}
