import java.util.Scanner;

public class GUI {
    Scanner input = new Scanner(System.in);

    public void checkUser() {
        System.out.println("What kind of user are u?");
        System.out.println("1: Are you an Admin?");
        System.out.println("2: Are you an Author?");
        System.out.println("3: Are you an Reviewer?");


        boolean isRunning = true;

        while (isRunning) {
            switch (input.nextInt()) {
                case 1:
                    adminInterface();
                    break;
                case 2:
                    authorInterface();
                    break;
                case 3:
                    reviewerInterface();
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    isRunning = false;
                    break;

            }
        }
    }

    public void adminInterface(){

        System.out.println("1: Add open submission period?");
        System.out.println("2: Add reviewer");
        System.out.println("3: Remove a reviewer?");
        System.out.println("4: Submit reviewers");
        System.out.println("5: See all submitted articles");

        boolean isAdmin = true;
        while (isAdmin) {
           switch(input.nextInt()){
               case 1:
                   addSubmissionPeriod();
                   break;
               case 2:
                   addReviewer();
                   break;
               case 3:
                   removeReviewer();
                   break;
               case 4:
                   submitReviewer();
                   break;
               case 5:
                   displaySubmittedArticles();
                   break;
               default:
                   System.out.println("Please enter a valid option!");
                   isAdmin = false;
                   break;
           }
        }

    }
    public void authorInterface(){
        System.out.println("1: Sign up and register");
        System.out.println("2: See the current year's open submission period and submit an article if\n" + "the current date is in the submission period.");
        System.out.println("3: See the list of youre submissions?");

        boolean isAuthor = true;
        while (isAuthor) {
            switch(input.nextInt()){
                case 1:
                    register();
                    break;
                case 2:
                    submitArticle();
                    break;
                case 3:
                    displayListOfSubmissions();
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    isAuthor = false;
                    break;
            }
        }
    }
    public void reviewerInterface(){
        System.out.println("1: See list of all assigned articles");
        System.out.println("2: Make a decission of article");

        boolean isReviewer = true;
        while (isReviewer) {
            switch(input.nextInt()){
                case 1:
                    displayListOfAssignedArticles();
                    break;
                case 2:
                    makeDecissionAboutArticle();
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    isReviewer = false;
                    break;
            }
        }
    }

    //Methods for admin alternatives
    public void addSubmissionPeriod(){}
    public void addReviewer(){}
    public void removeReviewer(){}
    public void submitReviewer(){}
    public void displaySubmittedArticles(){}

    //Methods for author alternatives
    public void register(){}
    public void submitArticle(){}
    public void displayListOfSubmissions(){}

    //Methods for reviewer alternatives
    public void displayListOfAssignedArticles(){}
    public void makeDecissionAboutArticle(){}

}
