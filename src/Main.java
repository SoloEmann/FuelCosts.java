import java.util.Scanner;

class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double mpg = 0;
        double price = 0;
        boolean done = false;

        do {
            System.out.print("Enter gallons of gas: ");

            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                if (gallons > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter miles per gallon: ");

            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                if (mpg > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter gas price per gallon: ");

            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                if (price > 0) {
                    done = true;
                } else {
                    System.out.println("Enter a number greater than 0.");
                }
            } else {
                in.nextLine();
                System.out.println("Invalid input. Enter a number.");
            }
        } while (!done);

        double cost = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost);
        System.out.println("Distance on a full tank: " + distance + " miles");
    }
}
