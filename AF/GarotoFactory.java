public class GarotoFactory implements EggFactory {
    @Override
    public Egg createEgg() {
        return new GarotoEgg();
    }
}