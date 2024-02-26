public class Player {
    protected int x;
    protected int y;

    protected Rectangle[] rectangles;

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
