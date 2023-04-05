public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Rolls Royce");
        car.setModel("Bullet");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.DescribeCar();

        Car targa = new Car();
        targa.setMake("Rolls Royce");
        targa.setModel("Bullet");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Yellow");
        
        targa.DescribeCar();

    }
}
