public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;


    public Car(String make, int year, String model, int miles) {
        this.make = make;
        this.year=year;
        this.model=model;
        this.miles=0;


    }

    public String toString() {
        return "this car is a " + this.getYear()+ " " + this.getMake() + " " + this.getModel() + " with " + this.getMiles() + " miles";
    }


    public void setMiles(int miles) {
        this.miles = miles;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMiles() {
        return miles;
    }

    public String getModel() {return model; }

    public String getMake() {  return make; }

    public int getYear() {return year; }




}

