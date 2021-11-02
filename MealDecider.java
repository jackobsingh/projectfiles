import java.util.*;

import java.math.*;

public class MealDecider implements BreakFast,FastFood,DiningIn,TakeOut,ExtraFunctions{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 0, max = 7, x, y;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        String letsEat = "Lets eat ";

        while (true) {
            ExtraFunctions.greeting();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                BreakFast.ihop();
                ExtraFunctions.yesNo();

                if (sc.nextInt() == 2) {
                    System.out.println(letsEat + cafes[0]);
                    ExtraFunctions.soundsGood();
                    if (sc.nextInt()==1){
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                     } else {

                            ExtraFunctions.returnToMain();
                            break;
                        }
                    }
                

                else  {
                   BreakFast.study();
                    ExtraFunctions.yesNo();
                
                 } if (sc.nextInt() == 1) {
                    System.out.println(letsEat + cafes[1]);
                    ExtraFunctions.soundsGood();
                    if(sc.nextInt()==1){
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                    }else{
                        ExtraFunctions.returnToMain();
                        break;
                    }
                }
                if (sc.nextInt() == 2) {
                    System.out.println(letsEat + cafes[2]);
                    ExtraFunctions.soundsGood();
                }
                if (sc.nextInt() == 1) {
                    ExtraFunctions.timeToEAT();
                    System.exit(0);
                }
                if (sc.nextInt() == 2) {
                    System.out.println(letsEat + cafes[3]);
                    ExtraFunctions.soundsGood();
                }
                if (sc.nextInt() == 1) {
                    ExtraFunctions.timeToEAT();
                    System.exit(0);
                }
                if (sc.nextInt() == 2) {
                 
                    ExtraFunctions.returnToMain();
                }
                break;
            case 2:
                FastFood.craving();
                FastFood.chickenBeef();
                switch(sc.nextInt()){
                case 1: {
                    FastFood.chicken();
                    ExtraFunctions.yesNo();
                    if (sc.nextInt() == 1) {
                        System.out.println(letsEat + driveThrus[0]);
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt()==1){
                            ExtraFunctions.timeToEAT();
                            System.exit(0);
                        }else {
                            ExtraFunctions.returnToMain();
                            break;
                        }
                    }
                    else{
                        System.out.println(letsEat + driveThrus[3]);
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt() == 1) {
                            ExtraFunctions.timeToEAT();
                            System.exit(0);
                        }
                        else {
                            ExtraFunctions.returnToMain();
                            break;
                        }
                    }
                }case 2: {
                    FastFood.beef();
                    ExtraFunctions.yesNo();
                    if (sc.nextInt() == 1) {
                        ExtraFunctions.timeToEAT();
                      System.exit(0);
                    }else {
                        System.out.println(letsEat + driveThrus[2]);
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt() == 1) {
                            ExtraFunctions.timeToEAT();
                            System.exit(0);
                        }else {
                            ExtraFunctions.returnToMain();
                            break;
                        }

                    }}
                
                case 3:
                 
                    {System.out.println(letsEat + driveThrus[1]);
                    ExtraFunctions.soundsGood();
                    if (sc.nextInt() == 1) {
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                    }else {
                        ExtraFunctions.returnToMain();
                        break;
                    }}
                
                case 4: 
                    {System.out.println(letsEat + driveThrus[4]);
                    ExtraFunctions.soundsGood();
                    if (sc.nextInt() == 1) {
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                    }else {
                        ExtraFunctions.returnToMain();
                        break;
                    }
                }}

                break;

              case 3:
                TakeOut.heavy();
                ExtraFunctions.yesNo();
                if (sc.nextInt() == 1) {
                    TakeOut.halal();
                    ExtraFunctions.soundsGood();
                    if (sc.nextInt() == 1) {
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                    }else {
                        System.out.println(letsEat + togo[0]);
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt() == 1) {
                            ExtraFunctions.timeToEAT();

                            }else{
                            TakeOut.rolly();
                            ExtraFunctions.soundsGood();
                            if (sc.nextInt() == 1) {
                                ExtraFunctions.timeToEAT();
                                System.exit(0);
                            }else {
                                System.out.println(letsEat + togo[1]);
                                ExtraFunctions.soundsGood();
                                if (sc.nextInt() == 1) {
                                    ExtraFunctions.timeToEAT();
                                    System.exit(0);

                                }else {
                                    System.out.println("Alright then, how bout we get "+ togo[2]);
                                    ExtraFunctions.soundsGood();
                                    if (sc.nextInt() == 1) {
                                        ExtraFunctions.timeToEAT();
                                        System.exit(0);
                                    }else {
                                        ExtraFunctions.returnToMain();
                                        break;
                                    }
                                }
                            }
                        }
                    }

                }else {
                    TakeOut.sushi();
                    ExtraFunctions.soundsGood();
                    if (sc.nextInt() == 1) {
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                    }else {
                        System.out.println(letsEat + togo[3]);
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt() == 1) {
                            ExtraFunctions.timeToEAT();
                        }else {
                            TakeOut.pho();
                            ExtraFunctions.soundsGood();
                            if (sc.nextInt() == 1) {
                                ExtraFunctions.timeToEAT();
                                System.exit(0);
                            }else {
                                ExtraFunctions.returnToMain();
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                System.out.println("Would you like to go somewhere we NEVER go?");
                ExtraFunctions.yesNo();
                if (sc.nextInt() == 1) {
                    System.out.println(letsEat + randomRestaurants[random_int]);
                    ExtraFunctions.soundsGood();
                    if (sc.nextInt() == 1) {
                        ExtraFunctions.timeToEAT();
                        System.exit(0);
                    }else {
                        System.out.println("Lets run the program again.");
                        System.exit(0);
                    }
                }else {
                    DiningIn.hungry();
                    if (sc.nextInt() == 1) {
                        DiningIn.pelicana();
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt() == 1) {
                            System.out.println(letsEat + restaurants[2]);
                            ExtraFunctions.yesNo();
                            if (sc.nextInt() == 1) {
                                ExtraFunctions.timeToEAT();
                                System.exit(0);
                            }else {
                                System.out.println("Okay lets go eat " + restaurants[0]);
                                ExtraFunctions.soundsGood();
                                if (sc.nextInt() == 1) {
                      
                                    ExtraFunctions.timeToEAT();
                                    System.exit(0);
                                }else {
                                    ExtraFunctions.returnToMain();
                                    break;
                                }
                            }
                        }
                    }else {
                        DiningIn.kbbq();
                        ExtraFunctions.soundsGood();
                        if (sc.nextInt() == 1) {
                            ExtraFunctions.timeToEAT();
                            System.exit(0);
                        }else {
                            System.out.println(letsEat + restaurants[1]);
                            ExtraFunctions.soundsGood();
                            if (sc.nextInt() == 1) {
                                ExtraFunctions.timeToEAT();
                                System.exit(0);
                            }else {
                                ExtraFunctions.returnToMain();
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                sc.close();
                System.exit(0);

            }

        }

    }
}
