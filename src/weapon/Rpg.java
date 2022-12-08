package weapon;

public class Rpg extends Weapon{

    public Rpg(int damage, int bulletsInSlot, int reloadTime) {
        super(damage, bulletsInSlot, reloadTime);
    }

    @Override
    public void setName() {
        this.name = "РПГ";
    }

    @Override
    public void setShotSound() {
        this.shotSound = "бдышь!";
    }
}
