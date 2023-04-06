public class Car {
    private String make = "Rolls Royce";
    private String model = "Bullet";
    private String color = "Black";
    private int doors = 2;
    private boolean convertible = true;
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }
    public void setMake(String make){
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porche", "rolls royce" -> this.make = make;
            default -> {
                this.make ="Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void DescribeCar(){
        System.out.println(doors+"-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "convertible" : ""));
    }

}