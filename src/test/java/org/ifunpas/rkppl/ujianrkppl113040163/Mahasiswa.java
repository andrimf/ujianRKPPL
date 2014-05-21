/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujianrkppl113040163;

/**
 *
 * @author 604-02
 */
public class Mahasiswa {

    private String nrp;
    private String nama;
    private double ipk;
    
    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public boolean validasi (double d){
        boolean toReturn = false;
        if (d > 0 && d < 100) {
            toReturn = true;
        }
        return toReturn;
    }
    
    public String index (double ipk){
        String toReturn = null;
            if (ipk >= 3.5 && ipk <= 4.0) {
                toReturn = "A";
        } 
          else if (ipk < 3.5 && ipk > 3.0) {
                toReturn = "B";
        }
          else if (ipk < 3.0 && ipk > 2.5) {
                toReturn = "C";
        } 
          else if (ipk < 2.5 && ipk > 1.0) {
                toReturn = "D";
        } 
          else if (ipk < 1.0) {
                toReturn = "E";
        } 
          else {
              toReturn = "NONE";
          }
        
        return toReturn;
    }
    
}
