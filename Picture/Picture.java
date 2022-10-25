
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Square door;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Circle moonshadow;
    private Square trunk;
    private Triangle tree;
    private Square sky;
    private Square step1;
    private Square step2;
    private Square step3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("black");
        sky.moveVertical(-100);
        sky.moveHorizontal(-100);
        sky.changeSize(400);
        sky.makeVisible();
        
        wall = new Square();
        wall.changeColor("yellow");
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(10);
        window.moveVertical(100);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("blue");
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
        
        door = new Square();
        door.changeColor("red");
        door.moveHorizontal(40);
        door.moveVertical(160);
        door.changeSize(20);
        door.makeVisible();

        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(175);
        moon.moveVertical(-10);
        moon.changeSize(60);
        moon.makeVisible();
        
        moonshadow = new Circle();
        moonshadow.changeColor("black");
        moonshadow.moveHorizontal(155);
        moonshadow.moveVertical(0);
        moonshadow.changeSize(60);
        moonshadow.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("magenta");
        trunk.moveHorizontal(155);
        trunk.moveVertical(200);
        trunk.changeSize(20);
        trunk.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(200, 60);
        tree.moveHorizontal(175);
        tree.moveVertical(40);
        tree.makeVisible();
        
        step1 = new Square();
        step1.changeColor("white");
        step1.moveHorizontal(40);
        step1.moveVertical(180);
        step1.changeSize(18);
        step1.makeVisible();
        
        step2 = new Square();
        step2.changeColor("white");
        step2.moveHorizontal(39);
        step2.moveVertical(200);
        step2.changeSize(20);
        step2.makeVisible();
        
        step3 = new Square();
        step3.changeColor("white");
        step3.moveHorizontal(37);
        step3.moveVertical(223);
        step3.changeSize(24);
        step3.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            window2.changeColor("white");
            door.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            moon.changeColor("black");
            moonshadow.changeColor("white");
            trunk.changeColor("black");
            tree.changeColor("white");
            sky.changeColor("black");
            step1.changeColor("white");
            step2.changeColor("white");
            step3.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("yellow");
            window.changeColor("blue");
            window2.changeColor("blue");
            door.changeColor("red");
            roof.changeColor("red");
            sun.changeColor("yellow");
            moon.changeColor("white");
            moonshadow.changeColor("black");
            trunk.changeColor("magenta");
            tree.changeColor("green");
            sky.changeColor("black");
            step1.changeColor("white");
            step2.changeColor("white");
            step3.changeColor("white");
        }
    }

}
