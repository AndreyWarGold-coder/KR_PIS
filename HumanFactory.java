public class HumanFactory implements WarriorsFactory{
    @Override
    public WarriorMelee getMelee() {
        return new WarriorMeleeHum();
    }

    @Override
    public WarriorRanger getRanger() {
        return new WarriorRangerHum();
    }

    @Override
    public WarriorMag getMag() {
        return new WarriorMagHum();
    }
}
