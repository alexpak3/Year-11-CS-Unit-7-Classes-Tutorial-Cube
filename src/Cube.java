public class Cube {
    private int side;

    public Cube() {
        side = 1;
    }
    public Cube(int i) {
        if (i<1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else {
            side = i;
        }
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side<1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        else {
            this.side = side;
        }
    }

    public int getSurfaceArea() {
        return 6 * (side * side);
    }

    public int getVolume() {
        return side*side*side;
    }


    @Override
    public String toString() {
        return "Cube{side="+side+"}";
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.setSide(1);
        int volume = cube.getVolume();
        System.out.println(cube.toString());
    }
}