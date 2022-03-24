package Pc;
/**
 *
 * @author Arthur
 */
public class Notebook {
    // Atributos
    private String marca;
    private double preco;
    private int quant;
    private int slotMem;
    private String tipoMem;
    private String marcaMem;
    private int numSlotMem;
    private String tipoHd;
    private String marcaHd;
    private int capacidHd;
    private String tipoMonitor;
    private String marcaMonitor;
    private int resMonitor;
    private String tipoFonte;
    private String marcaFonte;
    private int potencFonte;
    
    // Construtores
    Notebook(){}
    public Notebook(String marca, double preco, int quant){
        this.marca = marca;
        this.preco = preco;
        this.quant = quant;
    }
    public Notebook(int slotMem, String tipoMem, String marcaMem, int numSlotMem){
        this.slotMem = slotMem;
        this.tipoMem = tipoMem;
        this.marcaMem = marcaMem;
        this.numSlotMem = numSlotMem;
    }
    public Notebook(String tipoHd, String marcaHd, int capacidHd ){
        this.tipoHd = tipoHd;
        this.marcaHd = marcaHd;
        this.capacidHd = capacidHd;
    }
    public Notebook(String tipoMonitor, int resMonitor, String marcaMonitor ){
        this.tipoMonitor = tipoMonitor;
        this.resMonitor = resMonitor;
        this.marcaMonitor = marcaMonitor;
    }
    public Notebook(int potencFonte, String tipoFonte, String marcaFonte){
        this.potencFonte = potencFonte;
        this.tipoFonte = tipoFonte;
        this.marcaFonte = marcaFonte;
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
    public int getSlotMem() {
        return slotMem;
    }
    public void setSlotMem(int slotMem) {
        this.slotMem = slotMem;
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
    public int getCapacidHd() {
        return capacidHd;
    }
    public void setCapacidHd(int capacidHd) {
        this.capacidHd = capacidHd;
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
}
