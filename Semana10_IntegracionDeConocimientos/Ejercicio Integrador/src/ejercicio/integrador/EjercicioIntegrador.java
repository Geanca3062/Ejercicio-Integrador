/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.integrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EjercicioIntegrador {

    /**
     * @param args the command line arguments
     */
    public static String[] Start() {
        String Data[] = new String[4];
        Data[0] = JOptionPane.showInputDialog(null, "Nombre del supermercado:");
        Data[1] = JOptionPane.showInputDialog(null, "Codigo del supermercado:");
        Data[2] = JOptionPane.showInputDialog(null, "Username: ");
        Data[3] = JOptionPane.showInputDialog(null, "Cedula: ");
        return Data;
    }

    public static void agregar(String Data[]) {
        //JOptionPane.showMessageDialog(null, Data[2]);
        //boolean Add = false;
        int res = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos productos desea agregar?"));
        Producto Producto[] = new Producto[res];
        for (int x = 0; x <= res; x++) {
            String CodP = JOptionPane.showInputDialog(null, "Ingrese el codigo del producto #" + (x + 1));
            String NameP = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto #" + (x + 1));
            int cantP = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad del producto #" + (x + 1)));
            int precioP = Integer.parseInt(JOptionPane.showInputDialog(null, "Precio base del producto #" + (x + 1)));
            int Select = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo del producto #" + (x + 1) + " \n 1)Alimentos  \n 2)Bebidas \n 3)Higiene \n 4)Limpieza"));
            String TypeP = "";
            switch (Select) {
                case 1:
                    TypeP = "Alimentos";
                    break;
                case 2:
                    TypeP = "Bebidas";
                    break;
                case 3:
                    TypeP = "Higiene";
                    break;
                case 4:
                    TypeP = "Limpieza";
                    break;
                default:
                    throw new AssertionError();    
            }
            double PrecioB = 0;
            switch (TypeP) {
                case "Alimentos":
                    PrecioB = precioP +(precioP * 0.20);
                    break;
                case "Bebidas":
                    PrecioB = precioP +(precioP * 0.30);
                    break;
                case "Higiene":
                    PrecioB = precioP +(precioP * 0.25) + 500;
                    break;
                case "Limpieza":
                    PrecioB = (precioP +(precioP * 0.19))* 0.04 + 1000 + precioP;
                    break;
                default:
                    throw new AssertionError();    
            }
            double Ganancia = (PrecioB - precioP) * cantP;
            
            Producto[x] = new Producto(CodP,NameP,Data[0],Data[1],cantP,precioP,TypeP,PrecioB,Ganancia);
            JOptionPane.showMessageDialog(null, Producto[x].CantProd);
        }
        
        
        
        

    }
    
    public static void Mostrar(){
        
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String data[] = Start(); //Data 0= Nombre del mercado 2=Codigo del mercado 3=Empleado 4= cedula del empleado
        agregar(data);
        //JOptionPane.showMessageDialog(null, data);

    }

}
