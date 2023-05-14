public 
import java.util.Scanner;

public class nisharul {

// Initialize quiz questions and answers
private static final String[] questions = {
    "What was the errly capital of magadh?",
    "Capital of anga mahajanpada?",
    "What is the name of the famous clock tower in London?"
};

private static final String[][] options = {
    {"rajgriha", "vaishali", "patliputra", "champa"},
    {"vaishali", "champa", "Rajgri", "patliputra"},
    {"Big Ben", "Eiffel Tower", "Colosseum", "Golden Gate Bridge"}
};

private static final int[] correctAnswers = {0, 1, 0};

// Initialize user profile information
private static String username;
private static String password;
private static int age;

// Initialize quiz variables
private static int score = 0;
private static int totalQuestions = questions.length;
private static int questionNumber = 0;

// Initialize timer variables
private static long startTime;
private static final long TIME_LIMIT = 600000; // 10 minutes in milliseconds

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Login
    System.out.print("Enter username: ");
    username = scanner.nextLine();
    System.out.print("Enter password: ");
    password = scanner.nextLine();
    
    // Update profile and password
    System.out.println("Enter profile information:");
    System.out.print("Age: ");
    age = scanner.nextInt();
    scanner.nextLine(); // Consume remaining newline character
    System.out.print("New password (leave blank to keep the same): ");
    String newPassword = scanner.nextLine();
    if (!newPassword.isEmpty()) {
        password = newPassword;
    }
    
    // Quiz loop
    startTime = System.currentTimeMillis();
    while (questionNumber < totalQuestions && System.currentTimeMillis() - startTime < TIME_LIMIT) {
        // Display question and options
        System.out.println("Question " + (questionNumber + 1) + ": " + questions[questionNumber]);
        for (int i = 0; i < options[questionNumber].length; i++) {
            System.out.println((i + 1) + ". " + options[questionNumber][i]);
        }
        
        // Get answer
        System.out.print("Select your answer (1-" + options[questionNumber].length + "): ");
        int answer = scanner.nextInt() - 1;
        if (answer == correctAnswers[questionNumber]) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
        
        questionNumber++;
    }
    
    // Auto-submit and display score
    System.out.println("Time's up! Submitting quiz...");
    System.out.println("Your score is " + score + "/" + totalQuestions);
    
    // Logout
    System.out.println("Goodbye, " + username + "!");
}
}

{
    
}
