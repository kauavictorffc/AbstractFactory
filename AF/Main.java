public class Main {
    public static void main(String[] args) {
        EggFactory nestleFactory = new NestleFactory();
        Egg nestleEgg = nestleFactory.createEgg();

        System.out.println("Ovo de Páscoa: " + nestleEgg.getName());

        EggFactory garotoFactory = new GarotoFactory();
        Egg garotoEgg = garotoFactory.createEgg();

        System.out.println("Ovo de Páscoa: " + garotoEgg.getName());

        EggFactory lactaFactory = new LactaFactory();
        Egg lactaEgg = lactaFactory.createEgg();

        System.out.println("Ovo de Páscoa: " + lactaEgg.getName());
    }
}