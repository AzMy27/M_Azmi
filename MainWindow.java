import javax.swing.JFrame;
public class MainWindow extends JFrame {
    public MainWindow(){
        this.setTitle("Jendela Utama");
        this.setSize(600,320);
    }

    public static void main(String[] args) {
        MainWindow window =  new MainWindow();
        window.setVisible(true);
    }
}
