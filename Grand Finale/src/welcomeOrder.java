public class welcomeOrder implements interfejsCommand{
    welcomeMaker WelcomeMaker;
    String order;
    public welcomeOrder(welcomeMaker WelcomeMaker, String order){
        this.WelcomeMaker = WelcomeMaker;
        this.order= order;
    }

    @Override
    public void choiceUp() {
        WelcomeMaker.welcomeType = order;
        WelcomeMaker.getOrder("Welcome");
    }
}
        
        