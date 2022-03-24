package Pc;
/**
 *
 * @author arthu
 */

public class Desktop {
    // Atributos
    private String marca;
    private double preco;
    private int quant;
    private int placasVid;
    private String tipoMem;
    private String marcaMem;
    private int numSlotMem;
    private String tipoHd;
    private String marcaHd;
    private int capacidadeHd;
    private String tipoMonitor;
    private String marcaMonitor;
    private int resMonitor;
    private String tipoFonte;
    private String marcaFonte;
    private int potencFonte;
    private String marcaPlacaVid;
    
    Desktop(){}
    public Desktop(String marca, double preco, int quant, int placasVid, String marcaPlacaVid){
        this.marca = marca;
        this.preco = preco;
        this.quant = quant;
        this.placasVid = placasVid;
        this.marcaPlacaVid = marcaPlacaVid;
    }
    public Desktop(String tipoMem, String marcaMem, int numSlotMem){
        this.tipoMem = tipoMem;
        this.marcaMem = marcaMem;
        this.numSlotMem = numSlotMem;
    }
    public Desktop(String tipoHd, int capacidadeHd, String marcaHd ){
        this.tipoHd = tipoHd;
        this.capacidadeHd = capacidadeHd;
        this.marcaHd = marcaHd;
    }
    public Desktop(int resMonitor, String marcaMonitor, String tipoMonitor){
        this.resMonitor = resMonitor;
        this.marcaMonitor = marcaMonitor;
        this.tipoMonitor = tipoMonitor;
    }
    
    // Getters e Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public int getPlacasVid() {
        return placasVid;
    }
    public void setPlacasVid(int placasVid) {
        this.placasVid = placasVid;
    }
    public String getTipoMem() {
        return tipoMem;
    }
    public void setTipoMem(String tipoMem) {
        this.tipoMem = tipoMem;
    }
    public String getMarcaMem() {
        return marcaMem;
    }
    public void setMarcaMem(String marcaMem) {
        this.marcaMem = marcaMem;
    }
    public int getNumSlotMem() {
        return numSlotMem;
    }
    public void setNumSlotMem(int numSlotMem) {
        this.numSlotMem = numSlotMem;
    }
    public String getTipoHd() {
        return tipoHd;
    }
    public void setTipoHd(String tipoHd) {
        this.tipoHd = tipoHd;
    }
    public String getMarcaHd() {
        return marcaHd;
    }
    public void setMarcaHd(String marcaHd) {
        this.marcaHd = marcaHd;
    }
    public int getCapacidadeHd() {
return capacidadeHd;
    }
    public void setCapacidadeHd(int capacidadeHd) {
        this.capacidadeHd = capacidadeHd;
    }
    public String getTipoMonitor() {
        return tipoMonitor;
    }
    public void setTipoMonitor(String tipoMonitor) {
        this.tipoMonitor = tipoMonitor;
    }
    public String getMarcaMonitor() {
        return marcaMonitor;
    }
    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }
    public int getResMonitor() {
        return resMonitor;
    }
    public void setResMonitor(int resMonitor) {
        this.resMonitor = resMonitor;
    }
    public String getTipoFonte() {
        return tipoFonte;
    }
    public void setTipoFonte(String tipoFonte) {
        this.tipoFonte = tipoFonte;
    }
    public String getMarcaFonte() {
        return marcaFonte;
    }
    public void setMarcaFonte(String marcaFonte) {
        this.marcaFonte = marcaFonte;
    }
    public int getPotencFonte() {
        return potencFonte;
    }
    public void setPotencFonte(int potencFonte) {
        this.potencFonte = potencFonte;
    }
    public String getMarcaPlacaVid() {
        return marcaPlacaVid;
    }
    public void setMarcaPlacaVid(String marcaPlacaVid) {
        this.marcaPlacaVid = marcaPlacaVid;
    }
}


