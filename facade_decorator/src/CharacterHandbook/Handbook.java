package CharacterHandbook;

public class Handbook {
    private static int baseAttack = 100;
    private static int baseDefense = 100;
    private static int armorDefense = 300;
    private static int weaponAttack = 220;
    private static int magicAttack = 200;

    //Base
    public static int getBaseAttack() {
        return baseAttack;
    }
    public static void setBaseAttack(int value) {
        baseAttack = value;
    }
    public static int getBaseDefense() {
        return baseDefense;
    }
    public static void setBaseDefense(int value) {
        baseDefense = value;
    }

    //Armor
    public static int getArmorDefense() {
        return armorDefense;
    }

    public static void setArmorDefense(int value) {
        armorDefense = value;
    }

    //Weapon
    public static int getWeaponAttack() {
        return weaponAttack;
    }

    public static void setWeaponAttack(int value) {
        weaponAttack = value;
    }

    //Magic
    public static int getMagicAttack() {
        return magicAttack;
    }
    public static void setMagicAttack(int value) {
        magicAttack = value;
    }
}
