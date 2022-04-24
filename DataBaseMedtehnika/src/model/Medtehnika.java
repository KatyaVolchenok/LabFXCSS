/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HoziainKompa365
 */
public class Medtehnika {
    private Integer id;
    private String medname;
    private String model;
    private String sernumber;
    private String manufact;
    private String department;

    public Medtehnika(Integer id, String medname, String model, String sernumber, String manufact, String department) {
        this.id = id;
        this.medname = medname;
        this.model = model;
        this.sernumber = sernumber;
        this.manufact = manufact;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedname() {
        return medname;
    }

    public void setMedname(String medname) {
        this.medname = medname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSernumber() {
        return sernumber;
    }

    public void setSernumber(String sernumber) {
        this.sernumber = sernumber;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Medtehnika{" + "id=" + id + ", medname=" + medname + ", model=" + model + ", sernumber=" + sernumber + ", manufact=" + manufact + ", department=" + department + '}';
    }
    
    
}
