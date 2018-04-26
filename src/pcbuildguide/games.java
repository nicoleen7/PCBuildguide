
package pcbuildguide;

/**
 *
 * @author geoffreysalfi and nicholasroberto
 */
public class games {
    
    private String title;
    private String year;
    private int rating;

    public games(String title, String year, int rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
    
    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + year;
    }
    
    
    
    
    
}
