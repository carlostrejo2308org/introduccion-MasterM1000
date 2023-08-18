import java.util.*;
public class Fibo {
    static Scanner s = new Scanner(System.in);
    public static void Fibona() {
        int V1 = 0;
        int v2 = 1;
        int V3=0;
        System.out.println("ingrese el numero de repeticiones de la serie");
        int C= s.nextInt();
        for (int i = 0; i < C; i++) {
             System.out.println(V3);
            V3 = V1 + v2;
            V1 = v2;
            v2 = V3;
        }

    }

    public static void main(String[] args) {
        Fibona();
    }
}