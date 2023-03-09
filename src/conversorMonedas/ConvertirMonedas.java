package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

    public void ConvertirDolares(double valor){
        double monedaDolar = valor / 823.03;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaDolar+ " Pesos Chilenos");
    }

    public void ConvertirEuros(double valor){
        double monedaEuro = valor / 864.05;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaEuro+ " Pesos Chilenos");
    }

    public void ConvertirVes(double valor){
        double monedaVes = valor / 33.34;
        monedaVes = (double) Math.round(monedaVes*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaVes+ " Pesos Chilenos");
    }

    public void ConvertirLibras(double valor){
        double monedaLibras = valor / 973.55;
        monedaLibras = (double) Math.round(monedaLibras *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaLibras+ " Pesos Chilenos");
    }

    public void ConvertirWon (double valor){
        double monedaWon = valor / 0.62;
        monedaWon= (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $" +monedaWon+ " Pesos Chilenos");
    }
}
