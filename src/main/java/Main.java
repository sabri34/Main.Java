public class Main {
    public static void main (String[] args){
        Car car1 = new Car();

        car1.setColor("Mavi");
        car1.setModel("Renoult Symbol");
        car1.setEngine(1.5);
        car1.setDoors(4);

        System.out.println("Arabanın rengi:" + car1.getColor());
        System.out.println("Arabanın modeli:" + car1.getModel());
        System.out.println("Arabanın motor hacmi:" + car1.getEngine());
        System.out.println("Arabının kapı sayısı:" + car1.getDoors());
    }
}
