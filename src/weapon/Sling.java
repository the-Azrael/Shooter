package weapon;

public class Sling extends Weapon {
    public Sling(int damage, int bulletsInSlot, int reloadTime) {
        super(damage, bulletsInSlot, reloadTime);
    }

    @Override
    public void setName() {
        this.name = "Рогатка";
    }

    @Override
    public void setShotSound() {
        this.shotSound = "вхыть!";
    }
}
