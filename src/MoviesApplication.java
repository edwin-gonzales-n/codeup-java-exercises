import movies.MoviesArray;
import movies.Movie;
import util.Input;

public class MoviesApplication {

    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input input = new Input();

        do{
            System.out.println("\nWhat would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - search by title\n" +
                    "8 - you would like to add a movie and category\n");

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
                    movies("musical");
                    break;
                case 7:
                    movieSearch();
                    break;
                case 8:
                    userMovie();
                    break;
            }
        }while(true);
    }

    // objects ###
    public static void movies(){
        System.out.print("MOVIE                               |CATEGORY\n");
        for(Movie movie: movies){
            System.out.printf("%-36s|%-10s\n", movie.getName(),movie.getCategory());
        }
    }
    public static void movies(String category){
        System.out.print("MOVIE                               |CATEGORY\n");
        for(Movie movie: movies){
            if (movie.getCategory().equals(category)){
                System.out.printf("%-36s|%6s\n",movie.getName(),movie.getCategory());
            }
        }
    }
    public static void movieSearch(){
        Input input = new Input();
        System.out.println("Please type a movie name to search for:");
        String userInput = input.getString();
        System.out.print("MOVIE                               |CATEGORY\n");
        for(Movie movie: movies){
            if (movie.getName().equalsIgnoreCase(userInput)){
                System.out.printf("%-36s|%6s\n",movie.getName(),movie.getCategory());
            }
        }
    }
    public static void userMovie(){
        Input input = new Input();
        Movie[] copyArray;
        copyArray = new Movie[movies.length + 1];
        System.arraycopy(movies, 0 , copyArray, 0 , movies.length);

        System.out.println("Please enter a movie name: ");
        String userMovieName = input.getString();
        System.out.println("Please enter a category name: ");
        String userCategoryName = input.getString();

        copyArray[copyArray.length -1] = new Movie(userMovieName,userCategoryName);
        movies = copyArray;

        for (Movie movie: copyArray) {
            System.out.printf("%-36s|%-10s\n",movie.getName(),movie.getCategory());
        }
    }
}