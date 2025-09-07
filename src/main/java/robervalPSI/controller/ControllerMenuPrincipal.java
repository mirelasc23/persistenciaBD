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
            if(this.menuPrincipal.textFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada");
            }else{ 
                if(this.menuPrincipal.comboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrar por id.");
                }else if(this.menuPrincipal.comboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrar por nome.");
                }else if(this.menuPrincipal.comboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrar por cpf.");
            }
        }}
    }
    
    
}
