public class LactaFactory implements EggFactory {
    @Override
    public Egg createEgg() {
        return new LactaEgg();
    }
}