/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Galeria {
    ArrayList<imagensita>imagenes;
    
    public Galeria(){
            imagenes=new ArrayList<imagensita>() ;
            imagensita i1=new imagensita();
            i1.setUrl("/Proyecto/acceso.jpg");
            i1.setTitulo("INFORMATICA");
            i1.setDescripcion("acceso al servidor");
            
          
            imagensita i2=new imagensita();
            i2.setUrl("/Proyecto/aro.jpg");
            i2.setTitulo("INFORMATICA");
            i2.setDescripcion("todo esta a la mano");
            
            imagensita i3=new imagensita();
            i3.setUrl("/Proyecto/conexion.jpg");
            i3.setTitulo("INFORMATICA");
            i3.setDescripcion("conexion entre maquinas");
            
            imagensita i4=new imagensita();
            i4.setUrl("/Proyecto/produccion.jpg");
            i4.setTitulo("INFORMATICA");
            i4.setDescripcion("ensamblaje de tarjeta madre");
            
            imagensita i5=new imagensita();
            i5.setUrl("/Proyecto/tornado.jpg");
            i5.setTitulo("INFORMATICA");
            i5.setDescripcion("entrada y salida de datos");
            
            //agreagar al array
            
            imagenes.add(i1);
            imagenes.add(i2);
            imagenes.add(i3);
            imagenes.add(i4);
            imagenes.add(i5);
            
            
            }

    public ArrayList<imagensita> LeerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<imagensita> imagenes) {
        this.imagenes = imagenes;
    }
    
           
    
}
