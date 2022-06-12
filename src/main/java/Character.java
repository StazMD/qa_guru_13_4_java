public class Character {

    public static void main(String[] args) {
        //Character stats
        String charName = "Nagibator";
        String charMainRace = "Human";
        String charSecondRace = "Undead";
        String charMage = "Mage";
        String charWarrior = "Warrior";
        boolean charAlive = true;
        byte charLevel = 60;
        int charStrength = 15 + charLevel;
        int charAgility = 20 + charLevel;
        int charArmour = 40 + charLevel;
        int charHp = charLevel * 100;
        int charMana = charLevel * 100;
        long charExperience = charLevel * 100000000000L;
        double charCritical = (charAgility + charStrength) / 10d;
        double charParry = (charHp + charArmour) / charCritical;

        //Character's name
        System.out.println("Character name is " + charName);

        //Character is human or undead
        if (charMainRace == "Human" && charAlive) {
            System.out.println(charName + "'s race is " + charMainRace);
        } else {
            System.out.println(charName + "'s is " + charSecondRace);
        }

        //Character is mage or not
        if (charMana >= 1) {
            System.out.println(charName + "'s class is " + charMage);
        } else {
            System.out.println(charName + "'s class is " + charWarrior);
        }

        //Character's critical chance
        System.out.println(charName + " has critical chance " + charCritical);

        //Character is alive?
        if (charHp <= 0) {
            System.out.println(charName + "is dead");
        }

        //int*long
        System.out.println(charName + "'s experience is " + charExperience);

        //int+double
        System.out.println(charName + "'s parry rating is " + charParry);

        //Bytemax
        System.out.println((byte) (charLevel + 68));

        //Bytemin
        System.out.println((byte) (charLevel - 189));

    }

}
