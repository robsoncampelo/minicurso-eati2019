/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import org.primefaces.model.chart.Axis;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author robson.campelo
 */
@ManagedBean
public class MaisVendidosBean {
    
    private BarChartModel barModel;
    
    @PostConstruct
    public void init(){
         createBarModels();
    }
    
    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
 
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public BarChartModel getBarModel() {
        return barModel;
    }
    
     private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
 
        ChartSeries v1 = new ChartSeries();
        v1.setLabel("Fiat");
        v1.set("2015", 120);
        v1.set("2016", 100);
        v1.set("2017", 150);
        v1.set("2018", 110);
                
        ChartSeries v2 = new ChartSeries();
        v2.setLabel("Ford");
        v2.set("2015", 52);
        v2.set("2016", 60);
        v2.set("2017", 90);
        v2.set("2018", 75);
        
        ChartSeries v3 = new ChartSeries();
        v3.setLabel("Renault");
        v3.set("2015", 120);
        v3.set("2016", 100);
        v3.set("2017", 120);
        v3.set("2018", 130);
         
        ChartSeries v4 = new ChartSeries();
        v4.setLabel("Honda");
        v4.set("2015", 75);
        v4.set("2016", 96);
        v4.set("2017", 90);
        v4.set("2018", 179);
        
        model.addSeries(v1);
        model.addSeries(v2);
        model.addSeries(v3);
        model.addSeries(v4);
 
        return model;
    }

    private void createBarModels() {
        createBarModel();
    }
    
    private void createBarModel() {
        barModel = initBarModel();
 
        barModel.setTitle("Mais Vendidos");
        barModel.setLegendPosition("ne");
 
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Marcas");
 
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Vendas");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }
 
    
    
}
