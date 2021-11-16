import weapon.*;

/** @author Stanislav Rakitov */
class Player {
  // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
  private Weapon[] weaponSlots;

  public Player() {
    // Снаряжаем нашего игрока
    weaponSlots =
        new Weapon[] {
          new WaterPistol(), new Slingshot(), new Pistol(), new SubmachineGun(), new RPG()
        };
  }

  public int getSlotsCount() {
    // length - позволяет узнать, сколько всего слотов с оружием у игрока
    return weaponSlots.length;
  }

  public void shotWithWeapon(int slot) {
    // если значение slot некорректно, то
    // выйти из метода написав об этом в консоль
    if (slot >= weaponSlots.length || slot < 0) {
      System.out.println("Нет такого оружия.");
      return;
    }
    // Получаем оружие из выбранного слота
    Weapon weapon = weaponSlots[slot];
    // Огонь!
    weapon.shot();
  }
}
