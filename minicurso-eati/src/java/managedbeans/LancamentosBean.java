/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entidades.Lancamento;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author robson.campelo
 */
@ManagedBean
@ViewScoped
public class LancamentosBean {
    
    private List<Lancamento> lancamentos;

    public LancamentosBean() {
        lancamentos = service();
    }

    private List<Lancamento> service() {
        lancamentos = new ArrayList<>();
        
        Lancamento l1 = new Lancamento();
        l1.setAno(2019);
        l1.setFabricante("Fiat");
        l1.setItens("Ar condicionado, Computador de Bordo");
        l1.setModelo("Argo");
        l1.setPreco(58870.00);
        l1.setCor("Red");
        lancamentos.add(l1);
        
        Lancamento l2 = new Lancamento();
        l2.setAno(2020);
        l2.setFabricante("Renault");
        l2.setItens("Porta-malas espaçoso de 437 litros, Câmbio automático CVT, Trava antifurto de estepe");
        l2.setModelo("Captur");
        l2.setPreco(79900.00);
        l2.setCor("Blue");
        lancamentos.add(l2);
                      
        Lancamento l3 = new Lancamento();
        l3.setAno(2019);
        l3.setFabricante("Ford");
        l3.setItens("Ajuste de altura do volante, Ajuste lombar do banco do motorista, Controle da intensidade da luz do painel.");
        l3.setModelo("Ranger");
        l3.setPreco(183400.00);
        l3.setCor("Silver");
        lancamentos.add(l3);
        
        return lancamentos;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }
    
    
    
}
