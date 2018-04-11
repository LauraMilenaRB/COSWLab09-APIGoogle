package cosw.eci.edu.googleapi;


import java.io.Serializable;

/**
 * Created by Laura RB on 9/04/2018.
 */

public class LocationA implements Serializable{

    private String name;
    private String description;
    private double latitude;
    private double longitude;

    public LocationA(){
        name=null;
        description="";
        latitude=0;
        longitude=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
