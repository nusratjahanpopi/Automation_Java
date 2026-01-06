public class CarEncapsulation {
    private String Model;
    private String Speed;


    public CarEncapsulation(String Model, String Speed) {
        this.Model = Model;
        this.Speed = Speed;
    }
        public String getModel () {
            return Model;
        }
        public void setModel (String Model) {
            this.Model = Model;
        }
        public String getSpeed () {
            return Speed;
        }
        public void setSpeed (String Speed) {
            this.Speed = Speed;
        }

        public void displayInfo () {
            System.out.println("Car Model: " + Model);
            System.out.println("Car Speed: " + Speed);
        }

    public static void main(String[] args) {
        CarEncapsulation car = new CarEncapsulation("Toyota", "120 km/h");
        car.displayInfo();

        car.setModel("Honda");
        car.setSpeed("130 km/h");
        System.out.println("Updated Car Information:");
        car.displayInfo();
    }

    }

