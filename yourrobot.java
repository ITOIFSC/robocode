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

    public void onScannedRobot(ScannedRobotEvent e) {
        double absBearing = e.getBearingRadians() + getHeadingRadians(); // Calcula o ângulo do inimigo
        double latVel = e.getVelocity() * Math.sin(e.getHeadingRadians() - absBearing); // Velocidade do inimigo
        double gunTurnAmt; // Quantidade que a arma precisa girar
        setTurnRadarLeftRadians(getRadarTurnRemainingRadians()); // Trava o radar no inimigo

        // Chance aleatória de mudar a velocidade para confundir o inimigo
        if (Math.random() > 0.9) {
            setMaxVelocity((12 * Math.random()) + 12); // Define uma nova velocidade máxima aleatória
        }



    }

    public void onHitWall(HitWallEvent e) {
        moveDirection = -moveDirection; // Inverte a direção ao bater em uma parede
    }
    
}