
import javax.swing.JOptionPane;

public class numero {

    public static void main(String[] args) {

        String m, c, d, u;
        double ux = 0, dx = 0, cx = 0, mx = 0;

        double total;

        m = JOptionPane.showInputDialog("Insira a casa de milhar: ");
        c = JOptionPane.showInputDialog("Insira a casa de centena: ");
        d = JOptionPane.showInputDialog("Insira a casa de dezena: ");
        u = JOptionPane.showInputDialog("Insira a casa de unidade: ");

        if (null != u) {
            switch (u) {
                case "um":
                    ux = 1;
                    break;
                case "dois":
                    ux = 2;
                    break;
                case "tres":
                    ux = 3;
                    break;
                case "quatro":
                    ux = 4;
                    break;
                case "cinco":
                    ux = 5;
                    break;
                case "seis":
                    ux = 6;
                    break;
                case "sete":
                    ux = 7;
                    break;
                case "oito":
                    ux = 8;
                    break;
                case "nove":
                    ux = 9;
                    break;
                default:
                    break;
            }
        }

        if (null != c) {
            switch (c) {
                case "cem":
                    cx = 100;
                    break;
                case "duzentos":
                    cx = 200;
                    break;
                case "trezentos":
                    cx = 300;
                    break;
                case "quatrocentos":
                    cx = 400;
                    break;
                case "quinhentos":
                    cx = 500;
                    break;
                case "seiscentos":
                    cx = 600;
                    break;
                case "setecentos":
                    cx = 700;
                    break;
                case "oitocentos":
                    cx = 800;
                    break;
                case "novecentos":
                    cx = 900;
                    break;
                default:
                    break;
            }
        }

        if (null != d) {
            switch (d) {
                case "dez":
                    dx = 10;
                    break;
                case "vinte":
                    dx = 20;
                    break;
                case "trinta":
                    dx = 30;
                    break;
                case "quarenta":
                    dx = 40;
                    break;
                case "cinquenta":
                    dx = 50;
                    break;
                case "sessenta":
                    dx = 60;
                    break;
                case "setenta":
                    dx = 70;
                    break;
                case "oitenta":
                    dx = 80;
                    break;
                case "noventa":
                    dx = 90;
                    break;
                default:
                    break;
            }
        }

        if (null != m) {
            switch (m) {
                case "mil":
                    mx = 1000;
                    break;
                case "dois mil":
                    mx = 2000;
                    break;
                case "tres mil":
                    mx = 3000;
                    break;
                case "quatro mil":
                    mx = 4000;
                    break;
                case "cinco mil":
                    mx = 5000;
                    break;
                case "seis mil":
                    mx = 6000;
                    break;
                case "sete mil":
                    mx = 7000;
                    break;
                case "oito mil":
                    mx = 8000;
                    break;
                case "nove mil":
                    mx = 9000;
                    break;
                default:
                    break;
            }
        }

        total = ux + dx + cx + mx;

        JOptionPane.showMessageDialog(null, "Total: " + total);

    }
}
