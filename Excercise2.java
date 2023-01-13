import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        cook(" driving ");
        scan.close();
    }

    static void cook(String food) {

        System.out.println("ongoing exam ");
        taste(food);

        String feedback = getFeedBack(food);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
             fixRecipe(food);

             // Recursive call
           cook(food);
         } else if (feedback.equals("yes")) {
            serve(food);
      }
    }

    static void taste(String food) {
        System.out.println(" ongoing exam ");
    }

    static String getFeedBack(String food) {
        System.out.println("did you pass the " + food + " exam? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String food) {
        System.out.print("retake the driving lesson ? :");
        String ingredient = scan.next();
        System.out.println(" retaking driving lesson " + ingredient);
    }

    static void serve(String food) {
        System.out.println(" You passed the" + food + "Exam");
    }

}
