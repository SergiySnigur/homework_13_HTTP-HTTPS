package exerciseOne.user;

public class Geo {
    private double lat;
    private double lng;

    public Geo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "geo{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
