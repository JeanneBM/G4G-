import java.util.Scanner;

public class choiceMaker {
    static String welcomeType = "";

    public static void main(String[] args) {
        choiceTaker ChoiceTaker = new choiceTaker();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("In what range is the first letter of the language you are looking for?");
            System.out.println("(1) A-G");
            System.out.println("(2) H-N");
            System.out.println("(Other) Libertà");

            int a = scanner.nextInt();
            if (a == 1) {
                Scanner scanAG = new Scanner(System.in);
                System.out.println("-------------------- (1) A-G --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Languages --------------------");
                    System.out.println(" 1 ");
                    System.out.println("(2) ");
                    System.out.println("(3) ");
                    int welcome = scanAG.nextInt();
                    if (welcome == 1) {
                        welcomeType = "Afrikaans";
                        System.out.println("Afrikaans is chosen.");

                    } else if (welcome == 2) {
                        welcomeType = "Arabski";
                        System.out.println("(2) is chosen.");
                    } else if (welcome == 3) {
                        welcomeType = "Bengalski";
                        System.out.println("(3) is chosen.");
                    
   /*                     if (a == 2) {
                            Scanner scanHN = new Scanner(System.in);
                            System.out.println("-------------------- (2) H-M --------------------");
                            for (int i = 0; i < 1; i++) {
                                System.out.println("-------------------- Languages --------------------");
                                System.out.println("(1) ");
                                System.out.println("(2) ");
                                System.out.println("(3) ");
                                int welcome = scanHN.nextInt();
                                if (welcome == 1) {
                                    welcomeType = "";
                                    System.out.println("(1) is chosen.");
                                } else if (welcome == 2) {
                                    welcomeType = "";
                                    System.out.println("(2) is chosen.");
                                } else if (welcome == 3) {
                                    welcomeType = "";
                                    System.out.println("(3) is chosen.");
                                } else {
                                    break;
                                }
                            }

                            if (a == 3) {
                                Scanner scanNW = new Scanner(System.in);
                                System.out.println("-------------------- (3) N-W --------------------");
                                for (int i = 0; i < 1; i++) {
                                    System.out.println("-------------------- Languages --------------------");
                                    System.out.println("(1) ");
                                    System.out.println("(2) ");
                                    System.out.println("(3) ");
                                    int welcome = scanHN.nextInt();
                                    if (welcome == 1) {
                                        welcomeType = "";
                                        System.out.println("(1) is chosen.");
                                    } else if (welcome == 2) {
                                        welcomeType = "";
                                        System.out.println("(2) is chosen.");
                                    } else if (welcome == 3) {
                                        welcomeType = "";
                                        System.out.println("(3) is chosen.");
                                    } else {
                                        break;
                                    }
                                }

                                System.out.println("");
                                welcomeOrder welcomeOrder = new welcomeOrder(welcomeMaker, welcomeType);
                                ChoiceTaker.takeChoice(welcomeOrder);
                            } else {
                                System.out.println("-------------------------------------------------------------------------------");
                                System.out.println("Libertà");
                                break;
                            } */
                        }
                    }
                }
            }
                    }
                }


            
