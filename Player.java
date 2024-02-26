public class Player {
    private int x;
    private int y;

    private Rectangle[] rectangles;

    public Player(int x, int y){
        this.x = x;
        this.y = y;

        rectangles = new Rectangle[]{
            new Rectangle(x, y, 50, 50, "green")
        };
    }

    public void addTo(GameArena gameArena){
        for (Rectangle rectangle : rectangles) {
            gameArena.addRectangle(rectangle);
        }
    }

    public void move(int deltaX, int deltaY){
        x += deltaX;
        y += deltaY;
    }
}
