/*
 * Author: Chun-Kit Chung\
 * Date: 5/20/2018
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class RenderPanel extends JPanel {

	public static final Color BLACK = new Color(000000);

	@SuppressWarnings("static-access")
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Snake snake = Snake.snake;

		g.setColor(BLACK); //sets background colour

		g.fillRect(0, 0, 800, 700);

		g.setColor(Color.WHITE);//sets snake colour

		for (Point point : snake.snakeParts) {
			g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		}

		g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);

		g.setColor(Color.YELLOW); //sets cherry colour

		g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);

		String score = "Score: " + snake.score + ", Length: " + (snake.tailLength + 1) + ", Time: " + snake.time / 20; 

		g.setColor(Color.white); 

		g.drawString(score, (int) (getWidth() / 2 - score.length() * 2.5f), 10);//makes score board at top

		String gameOver = "You Died! Game Over"; 

		if (snake.over) {
			g.drawString(gameOver, (int) (getWidth() / 2 - score.length() * 2.5f), (int) snake.dim.getHeight() / 4); //shown on frame when you die

			Leaderboard leaderboard = new Leaderboard();
			//leaderboard.main(null);
			leaderboard.setVisible(true);
			
			snake.setVisible(false);
			
		}
	}
}
