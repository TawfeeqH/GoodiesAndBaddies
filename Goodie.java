public class Goodie extends Player {
    Goodie(int x, int y){
        this.x = x;
        this.y = y;

        rectangles = new Rectangle[]{
            new Rectangle(x, y, 50, 50, "green")
        };
    }
}
