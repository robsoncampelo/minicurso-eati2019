/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entidades.Marca;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Robson Campelo
 */
@ManagedBean
@ViewScoped
public class CatalogoCarrosBean {
    
    private List<Marca> marcas;
    private Marca selecionada;

    public CatalogoCarrosBean() {
        marcas = serviceMarcas();
    }
    
    private List<Marca> serviceMarcas() {
        marcas = new ArrayList<>();
        
        String[] colors = new String[10];
        colors[0] = "Black";
        colors[1] = "Pink";
        colors[2] = "Green";
        colors[3] = "Red";
        colors[4] = "Blue";
        colors[5] = "Orange";
        colors[6] = "Silver";
        colors[7] = "Yellow";
        colors[8] = "Brown";
        colors[9] = "Purple";
        
        String[] brands = new String[10];
        brands[0] = "BMW";
        brands[1] = "Mercedes";
        brands[2] = "Volvo";
        brands[3] = "Audi";
        brands[4] = "Renault";
        brands[5] = "Fiat";
        brands[6] = "Volkswagen";
        brands[7] = "Honda";
        brands[8] = "Jaguar";
        brands[9] = "Ford";
        
        Marca m1 = new Marca();
        m1.setId(UUID.randomUUID().toString().substring(0, 8));
        m1.setNome(brands[new Random().nextInt(10)]);
        m1.setPreco((int) (Math.random() * 100000));
        m1.setAno((int) (Math.random() * 10 + 2009));
        m1.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m1);
        
        Marca m2 = new Marca();
        m2.setId(UUID.randomUUID().toString().substring(0, 8));
        m2.setNome(brands[new Random().nextInt(10)]);
        m2.setPreco((int) (Math.random() * 100000));
        m2.setAno((int) (Math.random() * 10 + 2009));
        m2.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m2);
        
        Marca m3 = new Marca();
        m3.setId(UUID.randomUUID().toString().substring(0, 8));
        m3.setNome(brands[new Random().nextInt(10)]);
        m3.setPreco((int) (Math.random() * 100000));
        m3.setAno((int) (Math.random() * 10 + 2009));
        m3.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m3);
        
        Marca m4 = new Marca();
        m4.setId(UUID.randomUUID().toString().substring(0, 8));
        m4.setNome(brands[new Random().nextInt(10)]);
        m4.setPreco((int) (Math.random() * 100000));
        m4.setAno((int) (Math.random() * 10 + 2009));
        m4.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m4);
        
        Marca m5 = new Marca();
        m5.setId(UUID.randomUUID().toString().substring(0, 8));
        m5.setNome(brands[new Random().nextInt(10)]);
        m5.setPreco((int) (Math.random() * 100000));
        m5.setAno((int) (Math.random() * 10 + 2009));
        m5.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m5);
        
        Marca m6 = new Marca();
        m6.setId(UUID.randomUUID().toString().substring(0, 8));
        m6.setNome(brands[new Random().nextInt(10)]);
        m6.setPreco((int) (Math.random() * 100000));
        m6.setAno((int) (Math.random() * 10 + 2009));
        m6.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m6);
        
        Marca m7 = new Marca();
        m7.setId(UUID.randomUUID().toString().substring(0, 8));
        m7.setNome(brands[new Random().nextInt(10)]);
        m7.setPreco((int) (Math.random() * 100000));
        m7.setAno((int) (Math.random() * 10 + 2009));
        m7.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m7);
        
        Marca m8 = new Marca();
        m8.setId(UUID.randomUUID().toString().substring(0, 8));
        m8.setNome(brands[new Random().nextInt(10)]);
        m8.setPreco((int) (Math.random() * 100000));
        m8.setAno((int) (Math.random() * 10 + 2009));
        m8.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m8);
        
        Marca m9 = new Marca();
        m9.setId(UUID.randomUUID().toString().substring(0, 8));
        m9.setNome(brands[new Random().nextInt(10)]);
        m9.setPreco((int) (Math.random() * 100000));
        m9.setAno((int) (Math.random() * 10 + 2009));
        m9.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m9);
        
        Marca m10 = new Marca();
        m10.setId(UUID.randomUUID().toString().substring(0, 8));
        m10.setNome(brands[new Random().nextInt(10)]);
        m10.setPreco((int) (Math.random() * 100000));
        m10.setAno((int) (Math.random() * 10 + 2009));
        m10.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m10);
               
        Marca m11 = new Marca();
        m11.setId(UUID.randomUUID().toString().substring(0, 8));
        m11.setNome(brands[new Random().nextInt(10)]);
        m11.setPreco((int) (Math.random() * 100000));
        m11.setAno((int) (Math.random() * 10 + 2009));
        m11.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m11);
        
        Marca m12 = new Marca();
        m12.setId(UUID.randomUUID().toString().substring(0, 8));
        m12.setNome(brands[new Random().nextInt(10)]);
        m12.setPreco((int) (Math.random() * 100000));
        m12.setAno((int) (Math.random() * 10 + 2009));
        m12.setCor(colors[new Random().nextInt(10)]);
        marcas.add(m12);
                
        return marcas;
    }
    
    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public Marca getSelecionada() {
        return selecionada;
    }

    public void setSelecionada(Marca selecionada) {
        this.selecionada = selecionada;
    }   
    
}
