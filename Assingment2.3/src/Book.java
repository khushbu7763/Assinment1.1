import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationyear;

    //task 4
    private double rating;
    private ArrayList<String> reviews = new ArrayList<>();

    // constructor
    public Book(String title, String author, int publicationyear) {
        this.title = title;
        this.author = author;
        this.publicationyear = publicationyear;
    }
    //getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

    // task 4

    // set rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // add review
    public void addReview(String review) {
        reviews.add(review);
    }

    // get rating
    public double getRating() {
        return rating;
    }

    // get reviews
    public ArrayList<String> getReviews() {
        return reviews;
    }


}



