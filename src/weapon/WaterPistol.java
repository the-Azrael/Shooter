package weapon;

public class WaterPistol extends Weapon {

    public WaterPistol(int damage, int bulletsInSlot, int reloadTime) {
        super(damage, bulletsInSlot, reloadTime);
    }

    @Override
    public void setName() {
        this.name = "Водяной пистолет";
    }

    @Override
    public void setShotSound() {
        this.shotSound = "бульк!";
    }
}
