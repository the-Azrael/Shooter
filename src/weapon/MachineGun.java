package weapon;

public class MachineGun extends Weapon {
    public MachineGun(int damage, int bulletsInSlot, int reloadTime) {
        super(damage, bulletsInSlot, reloadTime);
    }

    @Override
    public void setName() {
        this.name = "Автомат";
    }

    @Override
    public void setShotSound() {
        this.shotSound = "тра-та-та-та-та!";
    }
}