import java.util.*;

public class Questions {

    public static void magicBall() {
        Questions survey = new Questions();
        Scanner userInput = new Scanner(System.in);
        String carColor = survey.redCar(userInput);
        String userPetName = survey.pet(userInput);
        int userLuckyNum = survey.lucky(userInput);
        int faveQBNum = survey.quaterback(userInput);
        int carModelNum = survey.carModelNum(userInput);
        String userFaveActor = survey.userFaveActor(userInput);
        int userFaveNum = survey.number(userInput);

        Random random = new Random();
        int rand1 = random.nextInt(75);
        int rand2 = random.nextInt(65);

        int magicBall = 0;

        if (rand1 < 32) {
            magicBall = faveQBNum * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
            System.out.println(magicBall);
        } else {
            magicBall = userLuckyNum * rand1;
            while (magicBall > 75) {
                magicBall -= 75;
            }
        }

        int nonMagic1 = userPetName.charAt(2);
        while (nonMagic1 > 65) {
            nonMagic1 -= 65;
        }

        int nonMagic2 = carModelNum + userLuckyNum;
        while (nonMagic2 > 65) {
            nonMagic2 -= 65;
        }

        int nonMagic3 = userFaveNum - rand2;
        while (nonMagic3 > 65) {
            nonMagic3 -= 65;
        }

        int nonMagic4 = 42;

        int nonMagic5 = userFaveActor.charAt(userFaveActor.length() - 1);

        System.out.println("Lottery Numbers: " + nonMagic1 + ", " + nonMagic2 + ", " + nonMagic3 + ", " + nonMagic4
                + ", " + nonMagic5 + " Magic Ball: " + magicBall);

    }

    public String redCar(Scanner userInput) {
        System.out.println("Is your car red?");
        String car = userInput.nextLine();
        return car;
    }

    public String pet(Scanner userInput) {
        System.out.println("What is the name of your favorite pet?");
        String pet = userInput.nextLine();
        return pet;
    }

    public Integer lucky(Scanner userInput) {
        System.out.println("What is your lucky number?");
        Integer lucky = userInput.nextInt();
        return lucky;
    }

    public Integer quaterback(Scanner userInput) {
        System.out.println("What is your favorite quarterback's jersey number?");
        Integer jersey = userInput.nextInt();
        return jersey;
    }

    public Integer carModelNum(Scanner userInput) {
        System.out.println(
                "What is the two-digit model year of your car?(ONLY enter 2 digits like '15' for '2015' year)");
        Integer model = userInput.nextInt();
        return model;
    }

    public String userFaveActor(Scanner userInput) {
        System.out.println();
        System.out.println("What is the first name of your favorite actor/actress?");
        String userFaveActor = userInput.next();
        return userFaveActor;
    }

    public Integer number(Scanner userInput) {
        System.out.println("Enter a random number between 1 and 50.");
        Integer num = userInput.nextInt();
        System.out.println();
        return num;
    }

}