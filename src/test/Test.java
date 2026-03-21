package test;

import model.*;
import view.Affichage;
import view.StartPanel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Test {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame fenetre = new JFrame("FreeFight");
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Appel de la méthode maintenant existante
            StartPanel startPanel = new StartPanel(() -> lancerJeu(fenetre));
            fenetre.setContentPane(startPanel);

            fenetre.pack();
            fenetre.setResizable(false);
            fenetre.setLocationRelativeTo(null);
            fenetre.setVisible(true);
        });
    }

    
    private static void lancerJeu(JFrame fenetre) {

        // Création troupes
        List<Troupe> troupes = new ArrayList<>();
        troupes.add(new Barbare(50, 500));
        troupes.add(new Sorcier(120, 500));
        troupes.add(new Pekka(190, 500));

        // Remplacer le contenu de la fenêtre
        fenetre.setContentPane(new Affichage(troupes));
        fenetre.revalidate();
        fenetre.pack();
    }
}