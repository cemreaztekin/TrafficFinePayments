import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String satir;
        int hız, tekrar, bazCeza=0, toplamCeza;

        satir = JOptionPane.showInputDialog("Hız miktarını giriniz.");
        hız = Integer.parseInt(satir);
        satir = JOptionPane.showInputDialog("Tekrar sayısını giriniz.");
        tekrar = Integer.parseInt(satir);

        if(hız>=111 && hız<=140){
            if (tekrar>=1 && tekrar<=3){
                bazCeza=150;
            }
            if (tekrar>=4 && tekrar<=5){
                bazCeza=350;
            }
            if (tekrar>=6 && tekrar<=8){
                bazCeza=800;
            }
            if (tekrar>8){
                bazCeza=5000;
            }
        }

        if(hız>=141 && hız<=160){
            if (tekrar>=1 && tekrar<=3){
                bazCeza=375;
            }
            if (tekrar>=4 && tekrar<=5){
                bazCeza=875;
            }
            if (tekrar>=6 && tekrar<=8){
                bazCeza=2000;
            }
            if (tekrar>8){
                bazCeza=11000;
            }
        }
        if(hız>=161 && hız<=180){
            if (tekrar>=1 && tekrar<=3){
                bazCeza=720;
            }
            if (tekrar>=4 && tekrar<=5){
                bazCeza=1650;
            }
            if (tekrar>=6 && tekrar<=8){
                bazCeza=3800;
            }
            if (tekrar>8){
                bazCeza=18000;
            }
        }
        if(hız>=181){
            if (tekrar>=1 && tekrar<=3){
                bazCeza=1200;
            }
            if (tekrar>=4 && tekrar<=5){
                bazCeza=2800;
            }
            if (tekrar>=6 && tekrar<=8){
                bazCeza=6500;
            }
            if (tekrar>8){
                bazCeza=42000;
            }
        }

        toplamCeza=bazCeza+hız*2;

        JOptionPane.showMessageDialog(null, bazCeza, "Baz Ceza" ,JOptionPane.OK_OPTION);
        JOptionPane.showMessageDialog(null, toplamCeza, "Toplam Ceza", JOptionPane.OK_OPTION);

    }
}
