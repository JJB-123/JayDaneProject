package jaydaneproject;

// Imports needed
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Jason & Dane
 * This project will generate Random enemies to battle until the user Quits.
 * The battles are Turn-Based
 */
public class JayDaneProject {

    public static void main(String[] args) {
        
        // Build a JFrame for data input
        JFrame Name_Getter_Frame = new JFrame("RandomRPG");
        Name_Getter_Frame.setSize(350, 350);
        
        // Closing the JFrame ends the Application
        Name_Getter_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the Workspace
        JPanel workspace = new JPanel();
        Name_Getter_Frame.add(workspace);
        
        // Setup the input fields
        setFields(workspace);
       
        // Make the fields Visable
        Name_Getter_Frame.setVisible(true);
    
    }

    // Function that Sets the fields
    public static void setFields(JPanel _workspace){
        
        
        _workspace.setLayout(null);
        
        // Name label
        JLabel inputNameLbl = new JLabel("Please Name Your Hero: ");
        inputNameLbl.setBounds(10, 10, 160, 25);
        _workspace.add(inputNameLbl);

        // Name input
        final JTextField  inputName = new JTextField(20);
        inputName.setBounds(120, 40, 160, 25);
        _workspace.add(inputName);        
              
        // Submit button - Triggers the game
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(120, 70, 80, 25);
        _workspace.add(submitBtn); 
        submitBtn.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                // TODO : Start the game
                // Use the player name to generate a Random seed
                LetterCounter SeedGetter = new LetterCounter();
                int[] randomSeed = SeedGetter.AlphaCount(inputName.getText().toString());
                
            }
        });      
      
    }
}
