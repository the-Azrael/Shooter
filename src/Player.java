import weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new WaterPistol(0, 50, 10000),
                new Pistol(50, 12, 1000),
                new MachineGun(100, 30, 1000),
                new Sling(5, 1, 500),
                new Rpg(1000, 1, 3000)
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) throws InterruptedException {
        if (slot > weaponSlots.length - 1 || slot < 0) {
            System.out.println("Номер слота не соответствует количеству слотов оружия");
            return;
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
