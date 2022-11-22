public class OrcFactory implements WarriorsFactory{
    @Override
    public WarriorMelee getMelee() {
        return new WarriorMeleeOrc();
    }

    @Override
    public WarriorRanger getRanger() {
        return new WarriorRangeOrc();
    }

    @Override
    public WarriorMag getMag() {
        return new WarriorMagOrc();
    }
}
