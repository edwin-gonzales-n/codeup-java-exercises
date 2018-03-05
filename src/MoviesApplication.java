import movies.MoviesArray;
import movies.Movie;
import util.Input;
import java.util.List;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Welcome to the movie app, enter any number to continue...");
        int userStart = input.getInt();
        do{
            System.out.println("\nWhat would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - search by title\n" +
                    "7 - you would like to add a movie and category\n");
            int userInput = input.getInt();
            switch (userInput){
                case 0:
                    System.out.println("Thank you for visiting us!");
                    System.exit(0);
                case 1:
                    movies();
                    break;
                case 2:
                    movies("animated");
                    break;
                case 3:
                    movies("drama");
                    break;
                case 4:
                    movies("horror");
                    break;
                case 5:
                    movies("scifi");
                    break;
                case 6:
                    movieSearch();
                    break;
                case 7:
                    userMovie();
                    break;
            }
            System.out.println("\nEnter any number to go back to main menu.");
            userStart = input.getInt();
        }while(userStart < 10);


    }
    public static void movies(){
        System.out.print("MOVIE                               |CATEGORY\n");
        for(int i = 0; i < MoviesArray.findAll().length; i++){
            System.out.printf("%-36s|%-10s\n",MoviesArray.findAll()[i].getName(),MoviesArray.findAll()[i].getCategory());
        }
    }
    public static void movies(String category){
        System.out.print("MOVIE                               |CATEGORY\n");
        for(int i = 0; i < MoviesArray.findAll().length; i++){
            if (MoviesArray.findAll()[i].getCategory().equals(category)){
                System.out.printf("%-36s|%6s\n",MoviesArray.findAll()[i].getName(),MoviesArray.findAll()[i].getCategory());
            }
        }
    }
    public static void movieSearch(){
        Input input = new Input();
        System.out.println("Please type a movie name to search for:");
        String userInput = input.getString();
        System.out.print("MOVIE                               |CATEGORY\n");
        for(int i = 0; i < MoviesArray.findAll().length; i++){
            if (MoviesArray.findAll()[i].getName().equalsIgnoreCase(userInput)){
                System.out.printf("%-36s|%6s\n",MoviesArray.findAll()[i].getName(),MoviesArray.findAll()[i].getCategory());
            }
        }
    }
    public static void userMovie(){
        Input input = new Input();
        Movie[] copyArray;
        copyArray = new Movie[MoviesArray.findAll().length + 1];
        System.arraycopy(MoviesArray.findAll(), 0 , copyArray, 0 , MoviesArray.findAll().length);

        System.out.println("Please enter a movie name: ");
        String userMovieName = input.getString();
        System.out.println("Please enter a category name: ");
        String userCategoryName = input.getString();
        System.out.println(userMovieName);
        System.out.println(userCategoryName);
//        Movie test = new Movie(userMovieName,userCategoryName);
        copyArray[copyArray.length -1] = new Movie(userMovieName,userCategoryName);

        for (int i = 0; i < copyArray.length; i++) {
            System.out.printf("%-36s|%-10s\n",copyArray[i].getName(),copyArray[i].getCategory());
        }
    }
}