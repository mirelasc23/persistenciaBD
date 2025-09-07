package robervalPSI.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import robervalPSI.view.MenuPrincipal2;

public class ControllerMenuPrincipal implements ActionListener{
    private MenuPrincipal2 menuPrincipal;

    public ControllerMenuPrincipal(MenuPrincipal2 menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
        
        this.menuPrincipal.jButtonFiltrar().addActionListener(this);
        this.menuPrincipal.jComboBoxFiltrarPor().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource() == this.menuPrincipal.jButtonFiltrar()){
            JOptionPane.showMessageDialog(null, "Botão Filtrar");
            if(this.menuPrincipal.jTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada");
            }else{ 
                if(this.menuPrincipal.jComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrar por id.");
                }else if(this.menuPrincipal.jComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrar por nome.");
                }else if(this.menuPrincipal.jComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrar por cpf.");
                }
            }
        }
    }
    
    
}
