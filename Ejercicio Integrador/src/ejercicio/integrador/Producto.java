/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.integrador;

/**
 *
 * @author Aulas Heredia
 */
public class Producto {
    String CodProd;
    String NameProd;
    String NameUser;
    String IDUser;
    int CantProd;
    int Price;
    String Type;
    double PriceB;
    double Profit;

    public Producto(String CodProd, String NameProd, String NameUser, String IDUser, int CantProd, int Price, String Type, double PriceB, double Profit) {
        this.CodProd = CodProd;
        this.NameProd = NameProd;
        this.NameUser = NameUser;
        this.IDUser = IDUser;
        this.CantProd = CantProd;
        this.Price = Price;
        this.Type = Type;
        this.PriceB = PriceB;
        this.Profit = Profit;
    }

    public String getCodProd() {
        return CodProd;
    }

    public void setCodProd(String CodProd) {
        this.CodProd = CodProd;
    }

    public String getNameProd() {
        return NameProd;
    }

    public void setNameProd(String NameProd) {
        this.NameProd = NameProd;
    }

    public String getNameUser() {
        return NameUser;
    }

    public void setNameUser(String NameUser) {
        this.NameUser = NameUser;
    }

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public int getCantProd() {
        return CantProd;
    }

    public void setCantProd(int CantProd) {
        this.CantProd = CantProd;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getPriceB() {
        return PriceB;
    }

    public void setPriceB(double PriceB) {
        this.PriceB = PriceB;
    }

    public double getProfit() {
        return Profit;
    }

    public void setProfit(double Profit) {
        this.Profit = Profit;
    }

    
    
    
}
