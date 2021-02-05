package Board;


import Pokemons.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public  class GameBoard extends JFrame  implements ActionListener {

    private static JFrame pokemonFrame;
    private static JPanel pokemonPanel;
    private static JLabel pokemonLabel , dialogBox;
    private static JButton pokemon1, pokemon2;
    private static JDialog pokemonDialog;



    public GameBoard()  {



        pokemonFrame = new JFrame();
        pokemonPanel = new JPanel();

        pokemonFrame.setSize(600,600);
        pokemonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pokemonFrame.add(pokemonPanel);
        pokemonFrame.setVisible(true);

        pokemonPanel.setLayout(null);

        pokemonLabel = new JLabel("Pokemon stats:");
        pokemonLabel.setBounds(10,25,100,10);
        pokemonPanel.add(pokemonLabel);

        pokemon1 = new JButton("Eevee");
        pokemon1.setBounds(120, 20 , 100, 20);
        pokemon1.addActionListener(this::actionPerformed);




        pokemon2 = new JButton("Scorbunny");
        pokemon2.setBounds(230, 20 , 100, 20);


        pokemonPanel.add(pokemon1);
        pokemonPanel.add(pokemon2);


    }



    @Override
    public void actionPerformed(ActionEvent e) {

       /* pokemonDialog = new JDialog();
        pokemonDialog.setSize(250,250);
        dialogBox = new JLabel("I fucked up");
        pokemonDialog.setVisible(true);
        pokemonPanel.add(dialogBox);*/

        Modal.render(this,"Stats" ,"Stats");

    }



    private void pokemon (Pokemon pokemon) {


    }
}
