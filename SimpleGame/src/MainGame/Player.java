package MainGame;

import jdk.nashorn.internal.ir.IfNode;

import java.awt.*;
import java.util.Random;


public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
      x += speedX;
      y += speedY;
    }

    @Override
    public void render(Graphics graphics) {
        if (id == ID.Player){
            graphics.setColor(Color.cyan);
        }else if (id == ID.Player2){
            graphics.setColor(Color.darkGray);
        }

        graphics.fillRect(x,y,40,40);
    }
}
