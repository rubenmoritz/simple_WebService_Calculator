/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibCalculator;

import calculator.LibCalculatorStub;
import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
import org.apache.axis2.AxisFault;
import org.apache.log4j.varia.NullAppender;

/**
 *
 * @author rjgmoritz
 */
public class Client {

    public static void main(String[] args) throws Exception {

        org.apache.log4j.BasicConfigurator.configure(new NullAppender());
        run();
    }

    /**
     * Dit zorgt er voor dat het programma blijft draaien tot dat er exit word
     * ingevoerd. Dit doet het door middel van een vorm van recursie.
     *
     */
    public static void run() throws RemoteException {
        String opdracht = vraagOpdracht();
        if (!opdracht.contains("exit")) {
            Double newOut = verwerkOpdracht(opdracht);
            JOptionPane.showMessageDialog(null,newOut);
            run();
        }

    }

    /**
     * print de vraag voor invoer van de user en vangt de invoer op.
     */
    public static String vraagOpdracht() {
        String input = JOptionPane.showInputDialog("Wat voor een bewerking zou u willen uitvoeren?");
        if(input==null){
            printHelp();
            vraagOpdracht();
        }
        return input;
    }

    /**
     * dit zorgt voor dat de help geprint word wanneer dit aangeroepen word.
     */
    public static void printHelp() {
        JOptionPane.showMessageDialog(null,
                        "De verwachte invoer is: nummer bewerking nummer "+
                        "\n"+"Een voorbeeld is 5 * 5"+
                        "\n"+"Het programma eindigen met exit.");
    }

    /**
     *
     * Stuurt de opdracht door naar de libcalculator class na bepaald is of de
     * berekening wel correct is door middel van een regex test. hierna word
     * gekeken wat voor een berekening het is plus min , gedeeld door etc. De
     * output is het berekende cijfer.
     */
    public static Double verwerkOpdracht(String input) throws AxisFault, RemoteException {
        LibCalculatorStub stub = new LibCalculatorStub();
        LibCalculatorStub.Som somReq = new LibCalculatorStub.Som();
        LibCalculatorStub.Modulo moduloReq = new LibCalculatorStub.Modulo();
        LibCalculatorStub.Product productReq = new LibCalculatorStub.Product();
        LibCalculatorStub.Quotient quotientReq = new LibCalculatorStub.Quotient();
        LibCalculatorStub.Verschil verschilReq = new LibCalculatorStub.Verschil();

        Double output = 0.0;
        if (input.matches("(\\d+)([\\+\\-\\*\\\\/\\%])(\\d+)")) {
            if (input.contains("+")) {
                int getal1 = parseInt(input.substring(0, input.indexOf("+")));
                int getal2 = parseInt(input.substring(input.indexOf("+") + 1, input.length()));
                somReq.setGetal1(getal1);
                somReq.setGetal2(getal2);
                LibCalculatorStub.SomResponse resp = stub.som(somReq);
                output = resp.get_return();
            } else if (input.contains("-")) {
                int getal1 = parseInt(input.substring(0, input.indexOf("-")));
                int getal2 = parseInt(input.substring(input.indexOf("-") + 1, input.length()));
                verschilReq.setGetal1(getal1);
                verschilReq.setGetal2(getal2);
                LibCalculatorStub.VerschilResponse resp = stub.verschil(verschilReq);
                output = resp.get_return();
            } else if (input.contains("*")) {
                int getal1 = parseInt(input.substring(0, input.indexOf("*")));
                int getal2 = parseInt(input.substring(input.indexOf("*") + 1, input.length()));
                productReq.setGetal1(getal1);
                productReq.setGetal2(getal2);
                LibCalculatorStub.ProductResponse resp = stub.product(productReq);
                output = resp.get_return();
            } else if (input.contains("/")) {
                int getal1 = parseInt(input.substring(0, input.indexOf("/")));
                int getal2 = parseInt(input.substring(input.indexOf("/") + 1, input.length()));
                quotientReq.setGetal1(getal1);
                quotientReq.setGetal2(getal2);
                LibCalculatorStub.QuotientResponse resp = stub.quotient(quotientReq);
                output = resp.get_return();
            } else if (input.contains("%")) {
                int getal1 = parseInt(input.substring(0, input.indexOf("%")));
                int getal2 = parseInt(input.substring(input.indexOf("%") + 1, input.length()));
                moduloReq.setGetal1(getal1);
                moduloReq.setGetal2(getal2);
                LibCalculatorStub.ModuloResponse resp = stub.modulo(moduloReq);
                output = resp.get_return();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Wrong output");
            printHelp();
        }

        return output;
    }

}
