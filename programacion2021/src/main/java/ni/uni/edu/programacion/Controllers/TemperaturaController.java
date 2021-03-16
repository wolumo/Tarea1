
package ni.uni.edu.programacion.Controllers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ni.uni.edu.programacion.views.panels.PnlTemperatura;

public class TemperaturaController implements ActionListener {
    private PnlTemperatura pnlTemperatura;
    public TemperaturaController(PnlTemperatura pnlTemperatura){
        this.pnlTemperatura= pnlTemperatura;
        initComponent();   
    }
    private void initComponent(){
        pnlTemperatura.getBtnCalc().addActionListener(this);
        pnlTemperatura.getBtnNew().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase("Calcular")){
            double n1;
            n1 = Double.parseDouble(pnlTemperatura.getTxtCelcius().getText());
            pnlTemperatura.getTxtFarenheit().setText(String.valueOf(Convertido(n1)));
        }else if (e.getActionCommand().equalsIgnoreCase("Nuevo")){
            pnlTemperatura.getTxtCelcius().setText("");
            pnlTemperatura.getTxtFarenheit().setText("");
            pnlTemperatura.getTxtCelcius().requestFocus();
        }
    }
    private double Convertido(double a){
        return ((a*9/5)+32);
    }
    
}
