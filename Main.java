public class Main {
    public static void main(String[] args) {
        WarriorsFactory warriorsFactory = new HumanFactory();
        WarriorMelee warriorMelee = warriorsFactory.getMelee();
        WarriorRanger warriorRanger = warriorsFactory.getRanger();
        WarriorMag warriorMag = warriorsFactory.getMag();

        warriorMelee.fightMelee();
        warriorRanger.fightRanger();
        warriorMag.fightStaf();

        System.out.println("------------------------");

        warriorsFactory = new OrcFactory();
        warriorMelee = warriorsFactory.getMelee();
        warriorRanger = warriorsFactory.getRanger();
        warriorMag = warriorsFactory.getMag();

        warriorMelee.fightMelee();
        warriorRanger.fightRanger();
        warriorMag.fightStaf();
    }
}