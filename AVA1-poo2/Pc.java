package Pc;
import javax.swing.JOptionPane;

public class Pc {
    public static void main(String[] args) {
            int operacao = 0;
            operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero para cadastrar: \n 1 - Servidor \n 2 - Notebook \n3 - Desktop")); 
            // Dessa forma executa somente o que o usu�rio deseja cadastrar, e n�o  a classe inteira
            
        switch(operacao){
               case 1: // caso 1, executa somente o servidor
            // SERVIDOR
            Servidor S1 = new Servidor();
            S1.setMarca(JOptionPane.showInputDialog("Inform e a marca: "));
            S1.setPreco(Double.parseDouble(JOptionPane.showInputDialog ("Informe o pre�o: ")));
            S1.setQuant(Integer.parseInt(JOptionPane.showInputDialog ("Informe  a quantidade: ")));
            S1.setNumHd(Integer.parseInt(JOptionPane.showInputDialog ("Informe o n�mero do HD: " )));
            S1.setSlotMem(Integer.parseInt(JOptionPane.showInputDialog ("Informe o slot de mem�ria: ")));
            S1.setTipoMem(JOptionPane.showInputDialog ("Informe o tipo da mem�ria: "));
            S1.setMarcaMem(JOptionPane.showInputDialog ("Informe a marca da mem�ria: "));
            S1.setCapacidMem(Integer.parseInt(JOptionPane.showInputDialog("Informe  a capacidade da mem�ria: ")));
            S1.setTipoHd(JOptionPane.showInputDialog ("Informe o tipo do HD: "));
            S1.setMarcaHd(JOptionPane.showInputDialog("I nforme a marca do HD: "));
            S1.setCapacidHd(Integer.parseInt(JOptionPane.showInputDialog ("Informe a capacidade  do HD: ")));
            S1.setTipoGab(JOptionPane.showInputDialog ("Informe o tipo do  gabinete: "));
            S1.setMarcaGab(JOptionPane.showInputDialog("Inf orme a marca do gabinete: "));
            S1.setTipoFonte(JOptionPane.showInputDialog("Inform e o tipo da fonte: "));
            S1.setMarcaFonte(JOptionPane.showInputDialog ("Informe a marca da fonte: "));
            S1.setPotenciaFonte(Integer.parseInt(JOptionPane.showInputDialog ("Informe a pot�ncia da fonte: ")));
            System.out.println("Marca: " + S1.getMarca());
            System.out.println("Pre�o: " + S1.getPreco());
            System.out.println("Quantidade: " + S1.getQuant());
            System.out.println("N�mero do HD: " + S1.getNumHd());
            System.out.println("Slots de mem�ria: " + S1.getSlotMem());
            System.out.println("Tipo da mem�ria: " + S1.getTipoMem());
            System.out.println("Marca da mem�ria: " + S1.getMarcaMem());
            System.out.println("Capacidade da mem�ria: "  + S1.getCapacidMem ());
            System.out.println("Tipo do HD: " + S1.getTipoHd ());
            System.out.println("Marca do HD: " + S1.getMarcaHd());
            System.out.println("Capacidade do HD: " + S1.getCapacidHd ());
            System.out.println("Tipo do gabinete: " + S1.getTipoGab());
            System.out.println("Marca do gabinete: " + S1.getMarcaGab ());
            System.out.println("Tipo da fonte: " + S1.getTipoFonte());
            System.out.println("Marca da fonte: " + S1.getMarcaFonte());
            System.out.println("Pot�ncia da fonte: " + S1.getPotenciaFonte());
            break;
case 2: // caso 2, executa somente o notebook
            //NOTEBOOK
            Notebook N1 = new Notebook();
            N1.setMarca(JOptionPane.showInputDialog("Informe  a marca: "));
	
            N1.setPreco(Double.parseDouble(JOptionPane.showInputDialog ("Informe o pre�o: ")));
            N1.setQuant(Integer.parseInt(JOptionPane.showInputDialog ("Informe a quantidade:  ")));
            N1.setSlotMem(Integer.parseInt(JOptionPane.showInputDialog ("Informe o slot de mem�ria: ")));
            N1.setTipoMem(JOptionPane.showInputDialog ("Informe o tipo da mem�ria: "));
            N1.setMarcaMem(JOptionPane.showInputDialog("Informe  a marca da mem�ria: "));
            N1.setNumSlotMem(Integer.parseInt(JOptionPane.showInputDialog ("Informe o n�mero de slots da mem�ria: ")));
            N1.setTipoHd(JOptionPane.showInputDialog("I nforme o tipo do HD: "));
            N1.setMarcaHd(JOptionPane.showInputDialog("Inf orme a marca do HD: "));
            N1.setCapacidHd(Integer.parseInt(JOptionPane.showInputDialog ("Informe a capacidade  do HD: ")));
            N1.setTipoMonitor(JOptionPane.showInputDialog("Inf orme o tipo do monitor: "));
            N1.setMarcaMonitor(JOptionPane.showInputDialog("Inform e a marca do monitor: "));
            N1.setResMonitor(Integer.parseInt(JOptionPane.showInputDialog ("Informe a resolu��o do monitor:  ")));
            N1.setTipoFonte(JOptionPane.showInputDialog("Informe  o tipo da fonte: "));
            N1.setMarcaFonte(JOptionPane.showInputDialog ("Informe a marca da fonte: "));
            N1.setPotencFonte(Integer.parseInt(JOptionPane.showInputDialog ("Informe a pot�ncia da fonte: ")));
            System.out.println("Marca: " + N1.getMarca());
            System.out.println("Pre�o: " + N1.getPreco());
            System.out.println("Quantidade: " + N1.getQuant());
            System.out.println("Slots de mem�ria: " + N1.getSlotMem());
            System.out.println("Tipo da mem�ria: " + N1.getTipoMem());
            System.out.println("Marca da mem�ria: " + N1.getMarcaMem());
            System.out.println("N�mero de slots da mem�ria: " + N1.getNumSlotMem ());
            System.out.println("Tipo do HD: " + N1.getTipoHd());
            System.out.println("Marca do HD: " + N1.getMarcaHd());
            System.out.println("Capacidade do HD: " + N1.getCapacidHd ());
            System.out.println("Tipo do monitor: " + N1.getTipoMonitor());
            System.out.println("Marca do monitor: " + N1.getMarcaMonitor ());
            System.out.println("Resolu��o do monitor: " + N1.getResMonitor());
            System.out.println("Tipo da fonte: " + N1.getTipoFonte());
            System.out.println("Marca da fonte: " + N1.getMarcaFonte());
            System.out.println("Pot�ncia da fonte: " + N1.getPotencFonte());
            break;
	case 3: // caso 3, executa somente o desktop
            // DESKTOP
            Desktop D1 = new Desktop();
            D1.setMarca(JOptionPane.showInputDialog("Informe  a marca: "));
            D1.setPreco(Double.parseDouble(JOptionPane.showInputDialog ("Informe o pre�o: ")));
            D1.setQuant(Integer.parseInt(JOptionPane.showInputDialog ("Informe a quantidade:  ")));
            D1.setPlacasVid(Integer.parseInt(JOptionPane.showInputDialog ("Informe a quantidade de placas  de v�deo: ")));
            D1.setTipoMem(JOptionPane.showInputDialog ("Informe o tipo da mem�ria: "));
            D1.setMarcaMem(JOptionPane.showInputDialog("Informe  a marca da mem�ria: "));
            D1.setNumSlotMem(Integer.parseInt(JOptionPane.showInputDialog ("Informe o n�mero de slots da mem�ria: ")));
            D1.setTipoHd(JOptionPane.showInputDialog("I nforme o tipo do HD: "));
            D1.setMarcaHd(JOptionPane.showInputDialog("Inf orme a marca do HD: "));
            D1.setCapacidadeHd(Integer.parseInt(JOptionPane. showInputDialog("Informe a capacidade  do HD: ")));
            D1.setTipoMonitor(JOptionPane.showInputDialog("Inf orme o tipo do monitor: "));
            D1.setMarcaMonitor(JOptionPane.showInputDialog("Inform e a marca do monitor: "));
            D1.setResMonitor(Integer.parseInt(JOptionPane.showInputDialog ("Informe a resolu��o do monitor:  ")));
            D1.setTipoFonte(JOptionPane.showInputDialog("Informe  o tipo da fonte: "));
            D1.setMarcaFonte(JOptionPane.showInputDialog ("Informe a marca da fonte: "));
            D1.setPotencFonte(Integer.parseInt(JOptionPane.showInputDialog ("Informe a pot�ncia da fonte: ")));
            D1.setMarcaPlacaVid(JOptionPane.showInputDialog ("Informe a marca da(s)  placa(s) de v�deo: "));
            System.out.println("Marca: " + D1.getMarca());
            System.out.println("Pre�o: " + D1.getPreco());
            System.out.println("Quantidade: " + D1.getQuant());
            System.out.println("Quantidade de placas de v�deo: " + D1.getPlacasVid());
            System.out.println("Tipo da mem�ria: " + D1.getTipoMem());


System.out.println("Marca da mem�ria: " + D1.getMarcaMem());
            System.out.println("N�mero de slots da mem�ria: " + D1.getNumSlotMem ());
            System.out.println("Tipo do HD: " + D1.getTipoHd());
            System.out.println("Marca do HD: " + D1.getMarcaHd());
            System.out.println("Capacidade do HD: " + D1.getCapacidadeHd ());
            System.out.println("Tipo do monitor: " + D1.getTipoMonitor());
            System.out.println("Marca do monitor: " + D1.getMarcaMonitor ());
            System.out.println("Resolu��o do monitor: " + D1.getResMonitor());
            System.out.println("Tipo da fonte: " + D1.getTipoFonte());
            System.out.println("Marca da fonte: " + D1.getMarcaFonte());
            System.out.println("Pot�ncia da fonte: " + D1.getPotencFonte());
            System.out.println("Marca da(s) placa(s) de v�deo: " + D1.getMarcaPlacaVid());
            break;
        }   
    }
}
