import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class Peon extends Actor
{
    /*
     * metodo para que el peón pueda esperar
     */
    public void wait (int time)
    {
        Greenfoot.delay(time);
    }
    
    /*
     * hacer las 20 tarjetas para el juego
     */
    public void tarjeta1()
    {
        setImage("Tarjeta-1.1.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta2()
    {
        setImage("tarjeta-2.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    
    public void tarjeta3()
    {
        setImage("tarjeta-3.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta4()
    {
        setImage("tarjeta-4.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta5()
    {
        setImage("tarjeta--5.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta6()
    {
        setImage("tarjeta-6.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta7()
    {
        setImage("tarjeta-7.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta8()
    {
        setImage("tarjeta-8.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta9()
    {
        setImage("tarjeta-9.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta10()
    {
        setImage("tarjeta-10.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    public void tarjeta11()
    {
        setImage("tarjeta-11.png");
        wait(60);
        setImage("autos_01.png");
    }
    
    
    /**
     * Act - do whatever the Peon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        move(50);
        wait(30);
        tarjeta1();
        move(150);
        wait(30);
        tarjeta2();
        move(150);
        wait(30);
        tarjeta3();
        move(150);
        tarjeta4();
        turn(-90);
        wait(30);
        move(120);
        turn(90);
        tarjeta5();
        wait(30);
        move(-150);
        tarjeta6();
        wait(30);
        move(-150);
        tarjeta7();
        wait(30);
        move(-150);
        tarjeta8();
        wait(30);
        turn(90);
        wait(30);
        move(-120);
        tarjeta9();
        turn(-90);
        wait(30);
        move(150);
        tarjeta10();
        wait(30);
        move(150);
        tarjeta11();
        wait(30);
        move(150);
        wait(30);
        turn(90);
        wait(30);
        move(-120);
        turn(-90);
        wait(30);
        move(-150);
        wait(30);
        move(-150);
        wait(30);
        move(-150);
        wait(30);
        turn(-90);
        wait(20);
        move(120);
        turn(90);
        wait(30);
        move(150);
        wait(30);
        move(150);
        wait(30);
        move(150);
    }
    
    
    
    
    
}
