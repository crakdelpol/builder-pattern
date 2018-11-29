public class Main {

    public static void main(String[] args) {

        System.out.println("Hi i'm trying to learn builder pattern");

        String fuelType = "Diesel";
        String make = "Volkswagen";
        String model = "GTD";
        String power = "180Hp";

        Car golf = new Car.CarBuilder().setFueltype(fuelType).setMake(make).setModel(model).setPower(power).build();

        // simple test without junit
        if(!golf.getFueltype().equals(fuelType)){
            System.out.println("Something goes wrong!");
        }
        if(!golf.getMake().equals(make)){
            System.out.println("Something goes wrong!");
        }
        if(!golf.getModel().equals(model)){
            System.out.println("Something goes wrong!");
        }
        if(!golf.getPower().equals(power)){
            System.out.println("Something goes wrong!");
        }

        System.out.println(golf.toString());

    }
}
