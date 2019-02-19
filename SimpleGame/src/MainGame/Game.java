package MainGame;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable {

    public static final int Width = 640, Height = Width/12 *9;
    private Thread thread;
    private boolean running = false;

    private Random r;
    private Handler handler;

    public Game(){
        handler = new Handler();
        this.addKeyListener(new KeyInput(handler));
        new Window(Width,Height,"OUR GAME",this);
        r=new Random();
        handler.addObject(new Player(Width/2-32,Height/2-32,ID.Player));
    }

    public synchronized void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop(){
        try {
            thread.join();
            running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running){
            long now = System.nanoTime();
            delta +=(now - lastTime)/ns;
            lastTime = now;
            while (delta >= 1){
                tick();
                delta --;
            }
            if (running){
                render();
                frames ++;
            }

            if (System.currentTimeMillis() - timer > 1000){
                timer +=1000;
                //System.out.println("FPS " + frames);
                frames=0;
            }
        }
        stop();
    }

    private void tick(){
        handler.tick();
   }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics graphics = bs.getDrawGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,Width,Height);

        handler.render(graphics);

        graphics.dispose();
        bs.show();
    }

    public static void main(String args[]){
        Game game = new Game();
    }

}
