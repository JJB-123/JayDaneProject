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
 * @author Jason + Dane
 */
public class JayDaneProject {

    public static void main(String[] args) {
        
        // Build a JFrame for data input
        JFrame BMI_Calc = new JFrame("BMI Calculator");
        BMI_Calc.setSize(350, 350);
        
        // Closing the JFrame ends the Application
        BMI_Calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add the Workspace
        JPanel workspace = new JPanel();
        BMI_Calc.add(workspace);
        
        // Setup the input fields
        setFields(workspace);
       
        // Make the fields Visable
        BMI_Calc.setVisible(true);
    
    }

    // Function that Sets the fields
    public static void setFields(JPanel _workspace){
        
        _workspace.setLayout(null);
        
        JLabel inputNameLbl = new JLabel("Name: ");
        inputNameLbl.setBounds(10, 10, 80, 25);
        _workspace.add(inputNameLbl);

        final JTextField  inputName = new JTextField(20);
        inputName.setBounds(120, 10, 160, 25);
        _workspace.add(inputName);        
        
        JLabel inputWeightLbl = new JLabel("Weight (Pounds): ");
        inputWeightLbl.setBounds(10, 40, 100, 25);
        _workspace.add(inputWeightLbl);

        final JTextField inputWeight = new JTextField(20);
        inputWeight.setBounds(120, 40, 160, 25);
        _workspace.add(inputWeight);    
        
        JLabel inputHeightLbl = new JLabel("Height (Inches): ");
        inputHeightLbl.setBounds(10, 70, 100, 25);
        _workspace.add(inputHeightLbl);

        final JTextField inputHeight = new JTextField(20);
        inputHeight.setBounds(120, 70, 160, 25);
        _workspace.add(inputHeight);  		
        
        
        // Submit button - Triggers the calculation
        JButton submitBtn = new JButton("Submit");
        submitBtn.setBounds(120, 110, 80, 25);
        _workspace.add(submitBtn); 
        submitBtn.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                // Pass the values in the Fields to the GetBMI function
               GetBMI(inputName.getText(), inputHeight.getText(), inputWeight.getText());
            }
        });      
      
    }
    // Calculate the BMI and return it to the user
    public static double GetBMI(String _Name, String Height, String Weight){
        
        
        double _Height = Double.parseDouble(Height);
        double _Weight = Double.parseDouble(Weight);
        double BMI;
        String status;
               
        //Calculate BMI
        BMI = _Weight/(_Height * _Height) * 703;
        if (BMI >= 30){
            status = "Obese";
        } else if (BMI >= 25){
            status = "Overweight";
        } else if (BMI >= 18.5){
            status = "Normal";
        } else {
            status = "Underweight";
        }
        JOptionPane.showMessageDialog(null, 
                "Using the formula at cdc.gov (weight (lb) / [height (in)]2 x 703) \n"
                + _Name + "\n" + "Your BMI is " + BMI + "\n" + "Current Weight Status: " + status);

        // Extra output
        System.out.printf("Using the formula at cdc.gov (weight (lb) / [height (in)]2 x 703) \n");
        System.out.printf(_Name);
        System.out.printf("Your BMI is %f \n", BMI);
        System.out.printf("Current Weight Status: ");

        return BMI;
    }    
}
