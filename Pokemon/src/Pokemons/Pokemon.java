package Pokemons;

public abstract class Pokemon {

    private String pokemonType;
    private String type;
    private String secondType;
    private String name;
    private int attack;
    private int defence;
    private int speed;
    private int HP;

    public Pokemon(String pokemonType, String name, String type, String secondType, int attack, int defence, int speed, int HP){


        this.pokemonType = pokemonType;
        this.name = name;
        this.type = type;
        this.secondType = secondType;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.HP = HP;



}
    public void showPokemonStats(){
         StringBuilder strB = new StringBuilder();
        strB.append("Pokemon Type: ");
        strB.append(getClass().getSimpleName());
        strB.append(System.getProperty("line.separator"));

        strB.append("Name: ");
        strB.append(this.name);
        strB.append(System.getProperty("line.separator"));

        strB.append("Type: ");
        strB.append(this.type);
        strB.append(System.getProperty("line.separator"));

        strB.append("Second Type:");
        strB.append(this.secondType);
        strB.append(System.getProperty("line.separator"));

        strB.append("Attack: ");
        strB.append(this.attack);
        strB.append(System.getProperty("line.separator"));

        strB.append("Defence: ");
        strB.append(this.defence);
        strB.append(System.getProperty("line.separator"));

        strB.append("Speed: ");
        strB.append(this.speed);
        strB.append(System.getProperty("line.separator"));

        strB.append("HP:" );
        strB.append(this.HP);
        strB.append(System.getProperty("line.separator"));
        strB.append(System.getProperty("line.separator"));


        System.out.printf(strB.toString());




    }




/*this.name = "Eevee";
        this.type = "Normal";
        this.secondType = "";
        this.height = 0.3F;
        this.weight = 6.5F;
        this.attack = 10;
        this.specialAttack = 5;
        this.defence = 10;
        this.specialDefense = 6;
        this.HP = 20;
        this.speed = 10;*/

    /*System.out.println("Pokemon's name: " + name + "\n" +
            " Type : " + type + "\n" +
            " Second Type : " + secondType + "\n" +
            " Attack : " + attack + "\n" +
            " Defence : " + defence + "\n" +
            " Speed : " + speed + "\n" +
            " HP : " + HP + "\n");*/


    }

