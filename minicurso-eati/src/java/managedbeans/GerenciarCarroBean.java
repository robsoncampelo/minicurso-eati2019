/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entidades.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Robson Campelo
 */
@ManagedBean
@SessionScoped
public class GerenciarCarroBean {
    
    private Carro carro = new Carro();
    private List<Carro> carros = new ArrayList<Carro>();
    
    public void adicionar(){
        carros.add(carro);
        carro = new Carro();      
    }
    
    public void limpar(){
        carros = new ArrayList<>();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
}
