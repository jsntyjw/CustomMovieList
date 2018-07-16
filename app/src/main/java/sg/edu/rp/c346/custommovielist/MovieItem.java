package sg.edu.rp.c346.custommovielist;

/**
 * Created by 16003753 on 16/7/2018.
 */

public class MovieItem {

    //define the data you want to use
    private String name;
    private String date;

    //generate the constructor
    public MovieItem(String name, String date) {
        this.name = name;
        this.date = date;
    }

    //generate the setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //generate the toString()
    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }



}
