package co.simplon.exercices.cowboy;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Cowboy luckyLuke = createLuckyLuke();
        Cowboy joeDalton = createJoeDalton();
        System.out.println("Before shooting:");
        print(luckyLuke, joeDalton);
        shootUntilDeath(luckyLuke, joeDalton);
        System.out.println("After shooting:");
        print(luckyLuke, joeDalton);
    }

    /**
     * Les cowboys en paramètres se tirent dessus aléatoirement jusqu'à la mort
     * de l'un des deux.
     * <p>
     * Note: plusieurs solutions possibles pour implémenter un tire aléatoire,
     * aller au plus simple.
     */
    private static void shootUntilDeath(Cowboy luckyLuke, Cowboy joeDalton) {
        // To be implemented
        while (!joeDalton.isDead() && !luckyLuke.isDead()) {

            Random r = new Random();
            int num = r.nextInt(2);
            System.out.println("Le random num" + num);
            if(num == 0){
                luckyLuke.shoot(joeDalton);
            } else {
                joeDalton.shoot(luckyLuke);
            }
        }
    }

    private static Cowboy createLuckyLuke() {
        // To be implemented
        Weapon weapon = new Weapon("Colt 15", 10, 1);
        return new Cowboy("Lucky Luke", 10, weapon);
    }

    private static Cowboy createJoeDalton() {
        // To be implemented
        Weapon weapon = new Weapon("Colt 10", 10, 1);
        return new Cowboy("Joe Dalton", 10, weapon);
    }

    private static void print(Cowboy luckyLuke, Cowboy joeDalton) {
        System.out.println(luckyLuke);
        System.out.println(joeDalton);
        System.out.println();
    }

}
