/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graphique;

import Beans.Question;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Julien Modena
 */
public class Visuel extends JFrame{

  

    /**
     * Constructor
     * @param q la question est passé en parametre pour être ajouter a mon conteneur
    
     */
    public Visuel(Question q) {
        
       JPanel bouton = new JPanel();
       JPanel global = new JPanel();
       JPanel reponse = new JPanel();
       Box content= new Box(BoxLayout.PAGE_AXIS);
       global.setLayout(new BorderLayout());
       
          // ajout de la question a un JLabel pour l'afficher ensuite
         String quest = q.getQuestion();
         JLabel question = new JLabel(quest);
         
        // Gestion de la reponse
        reponse.setLayout(new GridLayout(0,2));
        
        JTextField rep = new JTextField(30);
        JLabel ti = new JLabel("Réponse : ");
        reponse.add(ti);
        reponse.add(rep);

        
        // ajout de la question et de la réponse en notre composant
        content.add(question);
        content.add(reponse);
        
        // Creation des boutons
        JButton verifier = new JButton("Verifier");
        JButton solution = new JButton("Solution");
        JButton autre = new JButton("Autre Question");
      
        
        // ajout des listener pour chaque bouton
        verifier.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String verif = rep.getText();
               verif.toLowerCase();
               String reponsedb = q.getReponse();  String repo = reponsedb.toLowerCase();
               
               if(verif.equals(repo))
               {
                   JOptionPane.showMessageDialog(null, "Bravo vous avez trouvé la bonne réponse "
                           ,"Verification", JOptionPane.INFORMATION_MESSAGE);
               }
               else{
                   JOptionPane.showMessageDialog(null, "Quel dommage !!! la bonne réponse était "
                           +q.getReponse(),"Verification", JOptionPane.WARNING_MESSAGE);
               }
           }
       });
        solution.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "la solution de la reponse est  "
                        +q.getReponse(), "Solution", JOptionPane.INFORMATION_MESSAGE);
           }
       });
        
        autre.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              
                 
           }
       });
        
        //ajout des bouton au panel regroupant les boutons
        bouton.add(verifier);
        bouton.add(solution);
        bouton.add(autre);
        
        
        // ajout des différents panel au panel général
        global.add(bouton,BorderLayout.SOUTH);
        global.add(content,BorderLayout.CENTER);
        this.add(global);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fermeture
        this.setResizable(false); // Fenêtre non-redimensionnable
        this.pack(); // Ajustement de la taille au contenu
        // On positionne la fenêtre au milieu de l'écran
        this.setLocationRelativeTo(null);
        this.setVisible(true); // Affichage de la fenêtre
       
    }
}