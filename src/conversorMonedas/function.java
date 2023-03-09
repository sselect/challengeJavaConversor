package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMonedasAClp clp = new ConvertirMonedasAClp();

    public void ConvertirMonedas (Double Minput){
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                {"De Clp a Dolar", "De Clp a Euro", "De Clp a Libras", "De Clp a Ves", "De Clp a Won Coreano","De Dólar a Clp", "De Euro a Clp", "De Libras a Clp","De Ves a Clp","De Won Coreano a Clp"},
                "Seleccion")).toString();
        switch (opcion){
                    case "De Clp a Dolar":
                        monedas.ConvertirDolares(Minput);
                        break;
                    case "De Clp a Euro":
                        monedas.ConvertirEuros(Minput);
                        break;
                    case "De Clp a Libras":
                        monedas.ConvertirLibras(Minput);
                        break;
                    case "De Clp a Ves":
                        monedas.ConvertirVes(Minput);
                        break;
                    case "De Clp a Won Coreano":
                        monedas.ConvertirWon(Minput);
                        break;
                    case "De Dólar a Clp":
                        clp.ConvertirDolaresACpl(Minput);
                        break;
                    case "De Euro a Clp":
                        clp.ConvertirEurosACpl(Minput);
                        break;
                    case "De Libras a Clp":
                        clp.ConvertirLibrasACpl(Minput);
                        break;
                    case "De Ves a Clp":
                        clp.ConvertirVesACpl(Minput);
                        break;
                    case "De Won Coreano a Clp":
                        clp.ConvertirWonACpl(Minput);
                        break;

                }
         }
}
