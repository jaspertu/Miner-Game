import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Fader that fades current screen into Game Selection screen.
 * 
 * @author (Jasper Tu) 
 * @version (January 2015)
 */
public class FaderToLoadGame extends FaderType1
{
    private GreenfootSound menu = new GreenfootSound("MainMenuTrack.mp3");
    private Intro myWorld = new Intro();

    /**
     * Act - do whatever the Fader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fade(fadeLevel = fadeLevel + 20);
        if (fadeLevel > 255)
        {
            Greenfoot.setWorld(new LoadGame()); // (myWorld.getTheme()));
        }
    }    

    public FaderToLoadGame()
    {
        fade(0);
    }
}