import java.awt.*;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            while (true) {

                // Position aléatoire
                int x = random.nextInt(screenWidth);
                int y = random.nextInt(screenHeight);

                // Déplacement souris
                robot.mouseMove(x, y);

                System.out.println("Souris déplacée vers : " + x + ", " + y);

                // Attente de 30 secondes
                Thread.sleep(30000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}