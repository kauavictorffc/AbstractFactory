public class NestleFactory implements EggFactory {
    @Override
    public Egg createEgg() {
        return new NestleEgg();
    }
}
