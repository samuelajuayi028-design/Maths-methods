//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isRaining = true;

        int x = 20;
        int y = 18;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        }

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int a = 20;
        int b = 18;
        if (a > b) {
            System.out.println("x is greater than y");

            boolean isLightOn = true;
            if (isLightOn) {


                boolean IsLightOn = false;
                if (isLightOn) {
                    System.out.println("The light is on.");  // This will not be printed
                    System.out.println("This line always runs.");


                    if (20 > 18)
                        System.out.println("20 is greater than 18");


                    int X = 20;
                    int Y = 18;

                    if (X > Y)
                        System.out.println("x is greater than y");
                    System.out.println("This line runs no matter what (not part of the if statement)");


                    int i = 20;
                    int j = 18;

                    if (i > j) {
                        System.out.println("x is greater than y");
                        System.out.println("Both lines are part of the if");
                    }

                    System.out.println("I am outside if, not part of if!");


                    boolean IsRaining = false;

                    if (isRaining) {
                        System.out.println("Bring an umbrella!");
                    } else {
                        System.out.println("No rain today, no need for an umbrella!");


                        int time = 20;
                        if (time < 18) {
                            System.out.println("Good day.");
                        } else {
                            System.out.println("Good evening.");

                            int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

                            if (weather == 1) {
                                System.out.println("Bring an umbrella.");
                            } else if (weather == 2) {
                                System.out.println("Wear sunglasses.");
                            } else {
                                System.out.println("Just go outside normally.");


                                int Time = 16;

                                if (time < 12) {
                                    System.out.println("Good morning.");
                                } else if (time < 18) {
                                    System.out.println("Good day.");
                                } else {
                                    System.out.println("Good evening.");


                                    int TIME = 22;

                                    if (time < 12) {
                                        System.out.println("Good morning.");
                                    } else if (time < 18) {
                                        System.out.println("Good day.");
                                    } else {
                                        System.out.println("Good evening.");

                                        int TIme = 20;
                                        String result;
                                        result = (time < 18) ? "Good day." : "Good evening.";
                                        System.out.println(result);

                                        int TIMe = 22;
                                        String message = (time < 12) ? "Good morning."
                                                : (time < 18) ? "Good afternoon."
                                                : "Good evening.";
                                        System.out.println(message);


                                        int W = 15;
                                        int T = 25;

                                        if (x > 10) {
                                            System.out.println("x is greater than 10");

                                            // Nested if
                                            if (y > 20) {
                                                System.out.println("y is also greater than 20");

                                                int age = 20;
                                                boolean isCitizen = true;

                                                if (age >= 18) {
                                                    System.out.println("Old enough to vote.");

                                                    if (isCitizen) {
                                                        System.out.println("And you are a citizen, so you can vote!");
                                                    } else {
                                                        System.out.println("But you must be a citizen to vote.");
                                                    }
                                                } else {
                                                    System.out.println("Not old enough to vote.");


                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}