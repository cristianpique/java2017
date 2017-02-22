
package com.company; /* Falta posar el paquet al que pertany la clase */

class Position {
    int x;
    int y;
}

class Orientation {
    int orientation;  // 1: N, 2: W, 3: S, 4: E
}

/* Els nivells de vida, son una funcio corresponent del jugador, la qual s'asigna al mateix, per la qual cosa, no te sentit que la vida sigui una clase especifica del codi */

class Armor {
    int max;
    int level;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class Gun {
    int max;
    int level;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class Player {
    Position position;
    Orientation orientation;
    Armor armor;
    Gun gun;

    public void Health(){

        int max=100;
        int level=200;
    }
}

public class E3 {
    public static void main(String[] args) {

        Player player1 = new Player(); /* Faltava instanciar la clase,ja que nomes s'havia declarat la clase sense instanciarla */
        Player player2 = new Player(); /* Faltava instanciar la clase,ja que nomes s'havia declarat la clase sense instanciarla */

        player1.position.x = 100;
        player1.position.y = 100;
        player1.orientation.orientation = 2; /* Faltava accedir a l'atribut de la clase Orientation, nomes s'accedia a la clase */

        player2.position.x = 500; /* La clase instanciada per a aquest atribut de la clase player,es player2 amb minuscula i aqui, es trobava escrit en majuscula */
        player2.position.y = 100;
        player2.orientation.orientation = 4; /* Faltava accedir a l'atribut de la clase Orientation, nomes s'accedia a la clase */

        Armor a=new Armor();
        a.getMax();
        a.getLevel();

        Gun g = new Gun();

        g.getMax();
        g.getLevel();

        player1.Health();
        player2.Health();
    }
}
