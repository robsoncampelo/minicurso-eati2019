package managedbeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidades.Cliente;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Robson Campelo
 */
@ManagedBean
@ViewScoped
public class GerenciarClienteBean {

    private Cliente cliente = new Cliente();
      
    public void enviarMensagem(){
        FacesMessage msg = null;
        msg = new FacesMessage("Mensagem", "Olá " + cliente.getNome() + " " + cliente.getSobrenome() + "!");   
        FacesContext.getCurrentInstance().addMessage(null, msg);      
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }   
    
}
    
