package MainGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println(key);
        for (int i =0; i< handler.objects.size();i++){
            GameObject tempObject = handler.objects.get(i);
            if (tempObject.getId() == ID.Player){
              //all moves
                if (key == KeyEvent.VK_W)tempObject.setSpeedY(-5);
                if (key == KeyEvent.VK_S)tempObject.setSpeedY(5);
                if (key == KeyEvent.VK_A)tempObject.setSpeedX(-5);
                if (key == KeyEvent.VK_D)tempObject.setSpeedX(5);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (int i =0; i< handler.objects.size();i++){
            GameObject tempObject = handler.objects.get(i);
            if (tempObject.getId() == ID.Player){
                //all moves
                if (key == KeyEvent.VK_W)tempObject.setSpeedY(0);
                if (key == KeyEvent.VK_S)tempObject.setSpeedY(0);
                if (key == KeyEvent.VK_A)tempObject.setSpeedX(0);
                if (key == KeyEvent.VK_D)tempObject.setSpeedX(0);
            }
        }
    }
}
