
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.Cursor;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField Display;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    

    @FXML
    private void ClearButtonAction(ActionEvent event) {
        
        String OldNumber = Display.getText();
        
        if(!OldNumber.equals("")){
            String substr = OldNumber.substring(0, OldNumber.length()-1);
            Display.setText(substr);
        }
    }

    @FXML
    private void AllClearButtonAction(ActionEvent event) {
        
        Display.setText("");
        start = true;
    }

    @FXML
    private void OffButtonAction(ActionEvent event) {
        System.exit(1);
                
    }
    
    
    String operator;
    double number1;
    
    boolean start=true;

    @FXML
    private void OperatorAction(ActionEvent event) {
        
        number1 = Double.parseDouble(Display.getText());
        
        operator = ((Button)event.getSource()).getText();
        Display.setText("");
        
        
    }

    Double number2;
    @FXML
    private void ResultButtonAction(ActionEvent event) {
        
        number2 = Double.parseDouble(Display.getText());
        
        
        
        if(operator.equals("/"))
        {
            Display.setText(""+(number1/number2));
        }
        else if(operator.equals("X"))
        {
            Display.setText(""+(number1*number2));
        }
        else if(operator.equals("-"))
        {
            Display.setText(""+(number1-number2));
        }
        else
        {
            Display.setText(""+(number1+number2));
        }
        
        start = true;
        
    }

    @FXML
    private void DotButtonAction(ActionEvent event) {
        
        String OldNumber = Display.getText();
        
        if(OldNumber.contains(".")) return;
        Display.setText(OldNumber+".");
        
    }

    @FXML
    private void NumberButtonAction(ActionEvent event) {
        
        
        if(start==true)
        {
            Display.setText("");
            start=false;
        }
        
        String oldNumber = Display.getText();
        
        String number = ((Button)event.getSource()).getText();
        
        String NewNumber = oldNumber + number ;
        
        Display.setText(NewNumber);
       
    }

    @FXML
    private void ParsentButtonAction(ActionEvent event) {
        
        String OldNumber = Display.getText();
        
        
    }
    
}
