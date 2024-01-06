package fourth_day;

public class array_problem {
    public static void main(String[] args) {
        int[] m = {8997, 5, 9, 8, 10, 11, 12, 15, 17, 7 , 11, 13, 14};
        int i = 0;
        int x = 0;

        while (i < m.length) {
            if (i >= 0 && i < m.length) {
                System.out.println(m[i]);
              
                int z = i + m[i];
                x++;
                if (z >= 0 && z < m.length) {
                    i = z;
                } else {
                    break; 
                }
            } else {
                break; 
            }
        }

        System.out.println("The total number of jumps: " + (x));
    }
}
