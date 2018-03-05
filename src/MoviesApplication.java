import movies.Movie;
import movies.MoviesArray;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.printf("%s, %s",MoviesArray.findAll()[0].getName(),MoviesArray.findAll()[0].getCategory());
        System.out.println("\nWhat would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
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
        }
    }
    public static void movies(){
        System.out.print("MOVIE                               |CATEGORY\n");
        for(int i = 0; i < MoviesArray.findAll().length; i++){
            System.out.printf("%-36s|%-2s\n",MoviesArray.findAll()[i].getName(),MoviesArray.findAll()[i].getCategory());
        }
    }
    public static void movies(String category){
        System.out.print("MOVIE                               |CATEGORY\n");
        for(int i = 0; i < MoviesArray.findAll().length; i++){
            if (MoviesArray.findAll()[i].getCategory().equals(category)){
                System.out.printf("%-36s|%-2s\n",MoviesArray.findAll()[i].getName(),MoviesArray.findAll()[i].getCategory());
            }
        }
    }
}