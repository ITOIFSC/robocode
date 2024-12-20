package sample;

import robocode.*;
import java.awt.*;

public class AimLock extends AdvancedRobot {
    int moveDirection = 1; // Direção de movimento (1 para frente, -1 para trás)

    /**
     * run: Função principal de execução do robô Tracker
     */
    public void run() {
        setAdjustRadarForRobotTurn(true); // Mantém o radar estável enquanto o robô gira
        setBodyColor(new Color(128, 128, 50)); // Define a cor do corpo
        setGunColor(new Color(50, 50, 20));    // Define a cor da arma
        setRadarColor(new Color(200, 200, 70)); // Define a cor do radar
        setScanColor(Color.white);             // Define a cor do feixe de escaneamento
        setBulletColor(Color.blue);            // Define a cor das balas
        setAdjustGunForRobotTurn(true);        // Mantém a arma estável enquanto o robô gira
        turnRadarRightRadians(Double.POSITIVE_INFINITY); // Faz o radar girar continuamente para a direita

    }
    
}