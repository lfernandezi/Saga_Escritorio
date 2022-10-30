/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlCompras;

import Clases.Proveedor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LUIS
 */
public class ControlProveedorTest {
    
    public ControlProveedorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of mantProv method, of class ControlProveedor.
     */
    @Test
    public void testMantProv() {
        System.out.println("mantProv");
        Proveedor prov = null;
        ControlProveedor instance = new ControlProveedor();
        instance.mantProv(prov);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
