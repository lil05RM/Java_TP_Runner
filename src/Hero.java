import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Hero extends AnimatedThing {
    private double x;
    private double y;

    private Image spriteSheet;

    public ImageView getSprite() {
        return sprite;
    }

    private ImageView sprite;

    /*Constructeur*/
    public Hero (double x, double y, String fileName){
        super(x,y,fileName,1);
        this.x=x;
        this.y=y;

        spriteSheet=new Image(fileName);
        sprite = new ImageView(spriteSheet);

        sprite.setViewport(new Rectangle2D(20,14,60,85));
        sprite.setX(x);
        sprite.setY(y);

    }

    /*public void update(long time){

    }*/
}
