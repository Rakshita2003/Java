// given a route containing 4 directions (E,W,N,S), find the shortest path to reach destination

public class Strings5 {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            // direction
            char dir = path.charAt(i);

            // south y-1
            if (dir == 'S') {
                y--;
            }
            // north y+1
            else if (dir == 'N') {
                y++;
            }
            // west <- x-1
            else if (dir == 'W') {
                x--;
            }
            // east -> x+1
            else {
                x++;
            }

        }
        int x2 = x * x; // sqrt.(x2-x1)^2 + (y2-y1)^2
        int y2 = y * y;

        return (float)Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
