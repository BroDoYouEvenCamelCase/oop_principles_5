package Projects.project_07;

public class Books {


    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     Create a custom constructor that will take 3 args and defines the Book object
     Define Book  class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE
    public Books(String name, String genre, int totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    //Define instance variables here
    //YOUR CODE HERE
    public String name, genre;
    public int totalPage;


    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
