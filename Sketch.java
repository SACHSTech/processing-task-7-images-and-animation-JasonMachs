
import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet{
	
	
  public void settings() {
	// size call 
    size(355, 145);
      }
  
  //golbal variables
  PImage backImage;
  PImage objOne;
  float positionX = 0;
  float positionY = 30;
  float postX = -110;
  float postY = 10;
  float speedOne = 2;

  /**
   * load background image and other image
   */
   public void setup() {
   backImage = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-7-images-and-animation-JasonMachs\\bg3.jpg");
   objOne = loadImage("C:\\Users\\majas\\github-classroom\\SACHSTech\\processing-task-7-images-and-animation-JasonMachs\\car1-PhotoRoom.png");
  }
  /**
   * Movements in the window
   */
  public void draw() {
	  //car
    image(backImage, 0, 0);
    positionX = positionX+speedOne;
    image(objOne,positionX,positionY);
    
    // sun
    fill(255,255,0);
    postX = postX + (int)1;
    postY = (float)(3*(Math.pow( (int)2 , ((int)postX) - 300)) + 25);
    circle(postX, postY,30);
  
    //edge detection
    if(positionX<=-150){
      speedOne=speedOne * -1;
    }
    if(positionX>=170){
      speedOne=speedOne * -1;
    } 
    if(postX >= width){
      postX = -110;
      postY = 10;
    }
   }
  }
