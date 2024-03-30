package swiggy_Test;

class Arena {
    private Player playerA;
    private Player playerB;
    private int sides;

    public Arena(Player playerA, Player playerB, int sides) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.sides = sides;
    }

    public void fight(int rounds) {
        for (int i = 0; i < rounds; i++) {
            Player attacker = playerA;
            Player defender = playerB;

            while (playerA.isAlive() && playerB.isAlive()) {
                int attackRoll = attacker.rollDice(sides);
                int defenseRoll = defender.rollDice(sides);
                int attackDamage = attackRoll * attacker.getAttack();
                int defenseDamage = defenseRoll * defender.getStrength();
                int damageTaken = Math.max(0, attackDamage - defenseDamage);
                defender.reduceHealth(damageTaken);

                System.out.println("Round " + (i + 1));
                System.out.println("Player stats:" + attacker.getHealth() + " attacks and rolls die: " + attackRoll);
                System.out.println("Player  stats:" + defender.getHealth() + " defends and rolls die: " + defenseRoll);
                System.out.println("Attack damage: " + attackDamage);
                System.out.println("Defending strength: " + defenseDamage);
                System.out.println("Player stats: " + defender.getHealth() + " health reduced by " + damageTaken);
                System.out.println();

                // Switch roles for next round
                Player temp = attacker;
                attacker = defender;
                defender = temp;
            }
            System.out.println("Round " + (i + 1) + " Over!");
            System.out.println("Player A Health: " + playerA.getHealth());
            System.out.println("Player B Health: " + playerB.getHealth());
            System.out.println();
        }
    }
}