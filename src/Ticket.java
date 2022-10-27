public class Ticket {
    private Route route;
    private MyDateTime time;
    private double price;

    public Ticket( Route route, MyDateTime time, double price){
        this.route = route;
        this.time = time;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public long getDistance(){
        return route.getDistance();
    }

    @Override
    public String toString() {
        return route +" " + time + "  " + price + " " + "EU";
    }

    public void changeTime(MyDateTime NewDateTime){
        this.time = NewDateTime;

    }
}
