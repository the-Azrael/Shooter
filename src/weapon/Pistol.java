package weapon;

public class Pistol extends Weapon {

    public Pistol(int damage, int bulletsInSlot, int reloadTime) {
        super(damage, bulletsInSlot, reloadTime);
    }

    @Override
    public void setName() {
        this.name = "Пистолет";
    }

    @Override
    public void setShotSound() {
        this.shotSound = "пух!";
    }
}
