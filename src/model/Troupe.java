package model;

public abstract class Troupe { // car c'est une base commune à toutes les troupes
    protected int x;    // position x de la troupe
    protected int y;    // position y de la troupe
    protected int health;   // points de vie de la troupe
    protected int damage;   // dégâts que la troupe inflige
    protected int speed;    // vitesse de déplacement de la troupe

    public Troupe(int x, int y, int health, int damage, int speed) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.damage = damage;
        this.speed = speed;
    }

    // public abstract void attack(Troupe target); // chaque troupe a une façon différente d'attaquer

    /* public void takeDamage(int damage) {
        health -= damage; // la troupe perd des points de vie lorsqu'elle subit des dégâts
        if (health < 0) {
            health = 0; // la santé ne peut pas être négative
        }
    }
    
    public boolean isAlive() {
        return health > 0; // la troupe est vivante si elle a plus de 0 points de vie
    }
        */
    
    // Méthode pour déplacer une troupe vers une position cible (targetX, targetY).
    // Comparer la position actuelle avec la destination et déplacer la troupe
    // progressivement selon sa vitesse sans dépasser la position cible.
    public void moveTo(int targetX, int targetY) {
        if (x < targetX) {
            x += speed;
            if (x > targetX) x = targetX;
        } else if (x > targetX) {
            x -= speed;
            if (x < targetX) x = targetX;
        }

        if (y < targetY) {
            y += speed;
            if (y > targetY) y = targetY;
        } else if (y > targetY) {
            y -= speed;
            if (y < targetY) y = targetY;
        }
    }

    // Vérifier si la troupe est arrivée à la position cible.
    public boolean isArrived(int targetX, int targetY) {

        return x == targetX && y == targetY;
    }


    // Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getHealth() {
        return health;
    }
}