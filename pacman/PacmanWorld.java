import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanWorld extends World
{
    private static final int WIDTH_WALL=28;
    private static final int HEIGHT_WALL=28;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();

        for(int x = 50; x < 550; x+= WIDTH_WALL)
        {
            wall = new Wall();
            addObject(wall,x,30);
            wall = new Wall();
            addObject(wall,x,350);
        }

        for(int y = 58; y < 200; y+=HEIGHT_WALL)
        {
            wall = new Wall();
            addObject(wall,50,y);
            wall = new Wall();
            addObject(wall,526,y);
        }
    
        Ballon ballon = new Ballon();
        addObject(ballon,268,188);
        Banana banana = new Banana();
        addObject(banana,419,141);
        BigBall bigBall = new BigBall();
        addObject(bigBall,415,245);
        Cherry cherry = new Cherry();
        addObject(cherry,276,255);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,325,135);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,385,99);
        Ballon ballon2 = new Ballon();
        addObject(ballon2,177,266);
        Banana banana2 = new Banana();
        addObject(banana2,89,271);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,137,197);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,200,163);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,249,127);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,480,292);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,476,184);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,352,198);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,329,306);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,233,307);
        Banana banana3 = new Banana();
        addObject(banana3,274,83);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,459,81);
        
        PacmanHud hud = new PacmanHud();
        addObject(hud,0,0);

        Pacman pacman = new Pacman(hud);
        addObject(pacman,110,80);
    }
}
