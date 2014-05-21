/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujianrkppl113040163;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 604-02
 */
public class PengujianAssert {
    
    public static Mahasiswa m;
    
    @Test
    public void test1(){
        m.setNrp("113040163");
        assertNotNull("Harusnya NRP Tidak Kosong : " + m.getNrp());
        
    }
    
    
    @Test
    public void test 2(){
        m.setNama("Andri Muhammad Ferdian");
        assertNotNull("Harusnya Nama Tidak Kosong :" + m.getNama());
    }
    
}
