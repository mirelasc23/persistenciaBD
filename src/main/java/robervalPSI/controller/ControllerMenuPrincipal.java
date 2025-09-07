package robervalPSI.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import robervalPSI.view.MenuPrincipal;

public class ControllerMenuPrincipal implements ActionListener{
    private MenuPrincipal menuPrincipal;

    public ControllerMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
        
        this.menuPrincipal.buttonFiltrar().addActionListener(this);
        this.menuPrincipal.comboBoxFiltrarPor().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == this.menuPrincipal.buttonFiltrar()){
            JOptionPane.showMessageDialog(null, "Botão Filtrar");
        }
    }
    
    public void tst(){
        
    }
    
}
