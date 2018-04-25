
package pcbuildguide;

/**
 *
 * @author geoffreysalfi
 */
public class games {
    
    private String title;
    private String year;

    public games(String title, String year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + year;
    }
    
    
    
    
    
}
