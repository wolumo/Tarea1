
package ni.uni.edu.programacion.Controllers;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ni.uni.edu.programacion.views.panels.PnlMoneda;

public class MonedaController implements ActionListener {
private PnlMoneda pnlMoneda;

public MonedaController(PnlMoneda pnlMoneda){
    this.pnlMoneda = pnlMoneda;
    initComponent();
}
private void initComponent(){
    pnlMoneda.getBtnCalc().addActionListener(this);
    pnlMoneda.getBtnNew().addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equalsIgnoreCase("Calcular")) {
        double n1;
        n1 = Double.parseDouble(pnlMoneda.getTxtDolares().getText());
        pnlMoneda.getTxtCordobas().setText(String.valueOf(Calculo(n1)));
    }else if (e.getActionCommand().equalsIgnoreCase("Nuevo")){
        pnlMoneda.getTxtDolares().setText("");
        pnlMoneda.getTxtCordobas().setText("");
        pnlMoneda.getTxtDolares().requestFocus();
    }
    }
    private double Calculo(double a){
        return (a*35.10);
    }
    
}
