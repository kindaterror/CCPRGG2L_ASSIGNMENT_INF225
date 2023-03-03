import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainMenu extends JFrame{
        MainMenu(){
            //Main Menu Image
           JLabel imageLabel = new JLabel();                 
           ImageIcon DOCTORImage = new ImageIcon("DOCTOR WHO OUT OF TIME.jpg"); 
            imageLabel.setIcon(DOCTORImage); 
            this.add(imageLabel);
            

            

            // Start Button
            JButton startButton = new JButton();
            startButton.setText("START GAME");
            startButton.setFont(new Font("FF Blur", Font.ITALIC, 25));
            this.add(startButton);

            EventHandler handler = new EventHandler();
            startButton.addActionListener(handler);

                this.setLayout(new FlowLayout());

                

            

            this.setTitle("Snake Game");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);           
            this.setSize(250,475);           
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.darkGray);
}
        

private class EventHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){
                new ColorMenu();

                dispose();
}}}         


