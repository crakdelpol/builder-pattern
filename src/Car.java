public class Car {

    private String model;
    private String power;

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public String getFueltype() {
        return fueltype;
    }

    public String getMake() {
        return make;
    }

    private String fueltype;
    private String make;

    public Car(CarBuilder carBuilder){
        this.model = carBuilder.model;
        this.power = carBuilder.power;
        this.fueltype = carBuilder.fueltype;
        this.make = carBuilder.make;
    }

    @Override
    public String toString() {
        return String.format("You have a beautifull %s of %s with fuel type %s with power as %s",this.model, this.make, this.fueltype, this.power );
    }

    public static class CarBuilder {

        private String model;
        private String power;
        private String fueltype;
        private String make;


        public CarBuilder(String model, String power, String fueltype, String make) {
            this.model = model;
            this.power = power;
            this.fueltype = fueltype;
            this.make = make;
        }
        public CarBuilder(){

        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setPower(String power) {
            this.power = power;
            return this;
        }

        public CarBuilder setFueltype(String fueltype) {
            this.fueltype = fueltype;
            return this;
        }

        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
