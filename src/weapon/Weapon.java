package weapon;

public class Weapon {
    private int damage;
    private int bulletsInSlot;
    private int bullets;
    private double reloadTime;
    protected String name;
    protected String shotSound;

    public Weapon(int damage, int bulletsInSlot, int reloadTime) {
        this.damage = damage;
        this.bulletsInSlot = bulletsInSlot;
        this.reloadTime = reloadTime;
        this.bullets = this.bulletsInSlot;
        setShotSound();
        setName();
    }

    public void setName() {
        this.name = "Безымянный";
    }

    public void setShotSound() {
        this.shotSound = " ";
    }

    public void reload() throws InterruptedException {
        System.out.println("Перезаряжаемся...");
        Thread.sleep((long) this.reloadTime);
        this.bullets = this.bulletsInSlot;
        System.out.println(String.format("Осталось патронов в магазине: %d шт.", this.bullets));
    }

    public boolean isEmptySlot() {
        return (this.bullets == 0);
    }

    public void shot() throws InterruptedException {
        if (isEmptySlot()) {
            this.reload();
        }
        System.out.println(String.format("Стреляем из " + this.name));
        System.out.println(this.shotSound);
        this.bullets--;
        System.out.println(String.format("Нанесено повреждений: -%d HP", this.damage));
        System.out.println(String.format("Осталось патронов в магазине: %d шт.", this.bullets));
    }
}
