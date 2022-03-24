package Pc;
/**
 *
 * @author Arthur
 */
public class Servidor {
    // Atributos
    private String marca;
    private double preco;
    private int quant;
    private int numHd;
    private int slotMem;
    private String tipoMem;
    private String marcaMem;
    private int capacidMem;
    private String tipoHd;
    private String marcaHd;
    private int capacidHd;
    private String tipoGab;
    private String marcaGab;
    private String tipoFonte;
    private String marcaFonte;
    private int potenciaFonte;
    
    // Construtores
    Servidor(){}
    public Servidor(String marca, double preco, int quant){
        this.marca = marca;
        this.preco = preco;
        this.quant = quant;
    }
    public Servidor(int numHd, String tipoHd, String marcaHd, int capaciHd ){
        this.numHd = numHd;
        this.tipoHd = tipoHd;
        this.marcaHd = marcaHd;
        this.capacidHd = capaciHd;
    }
    public Servidor(int slotMem, String tipoMem, String marcaMem){
        this.slotMem = slotMem;
        this.tipoMem = tipoMem;
        this.marcaMem = marcaMem;
    }
    public Servidor(String tipoGab, String marcaGab){
        this.tipoGab = tipoGab;
        this.marcaGab = marcaGab;
    }
    public Servidor (String tipoFonte, String marcaFonte, int potenciaFonte){
        this.tipoFonte = tipoFonte;
        this.marcaFonte = marcaFonte;
        this.potenciaFonte = potenciaFonte;
    }
    
    // Getters e Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuant(int quant){
        this.quant = quant;
    }
    public void setNumHd(int numHd){
        this.numHd = numHd;
    }
    public void setSlotMem(int slotMem){
        this.slotMem = slotMem;
    }
    public void setTipoMem(String tipoMem){
        this.tipoMem = tipoMem;
    }
    public void setMarcaMem(String marcaMem){
        this.marcaMem = marcaMem;
    }
    public void setCapacidMem(int capacidMem){
        this.capacidMem = capacidMem;
    }
    public void setTipoHd(String tipoHd){
        this.tipoHd = tipoHd;
    }
    public void setMarcaHd(String marcaHd){
        this.marcaHd = marcaHd;
    }
    public void setCapacidHd(int capacidHd){
        this.capacidHd = capacidHd;
    }
    public void setTipoGab(String tipoGab){
        this.tipoGab = tipoGab;
    }
    public void setMarcaGab(String marcaGab){
        this.marcaGab = marcaGab;
    }
    public void setTipoFonte(String tipoFonte){
        this.tipoFonte = tipoFonte;
    }
    public void setMarcaFonte(String marcaFonte){
        this.marcaFonte = marcaFonte;
    }
    public void setPotenciaFonte(int potenciaFonte){
        this.potenciaFonte = potenciaFonte;
    }
    
    public String getMarca(){
        return marca;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuant(){
        return quant;
    }
    public int getNumHd(){
        return numHd;
    }
    public int getSlotMem(){
        return slotMem;
    }
    public String getTipoMem(){
        return tipoMem;
    }
    public String getMarcaMem(){
        return marcaMem;
    }
    public int getCapacidMem(){
        return capacidMem;
    }
    public String getTipoHd(){
        return tipoHd;
    }
    public String getMarcaHd(){
        return marcaHd;
    }
    public int getCapacidHd(){
        return capacidHd;
    }
    public String getTipoGab(){
        return tipoGab;
    }
    public String getMarcaGab(){
        return marcaGab;
    }
    public String getTipoFonte(){
        return tipoFonte;
    }
    public String getMarcaFonte(){
        return marcaFonte;
    }
    public int getPotenciaFonte(){
        return potenciaFonte;
    }
}


