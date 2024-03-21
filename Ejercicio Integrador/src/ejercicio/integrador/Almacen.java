/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.integrador;

/**
 *
 * @author Aulas Heredia
 */
public class Almacen {
    public String Productos[] = new String[8];
    /*
    0) Codigo del producto
    1) Nombre del producto
    2) Nombre del empleado
    3)Cedula del empleado
    4)Cantidad de producto
    5) Precio base del producto (Por unidad)
    6) Tipo de producto (Alimentos, Bebidas, Higiene y Limpieza)
    7) precio bruto
    8) Ganacia esperada
    */

    public Almacen(String Productos[]) {
        //this.notas = Nnotas;
        this.Productos = Productos;
    }

    public String[] getProductos() {
        return Productos;
    }

    public void setProductos(String[] Productos) {
        this.Productos = Productos;
    }

    
    
    
}
