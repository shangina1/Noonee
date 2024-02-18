package javabase;
//задание 2 от 18.01
public class Massiv20 {
    public static void main(String[] args)
    {
        int[] lol = new int[10];

        int zn = 20;

        for (int i = 0; i < lol.length; i++)
        {
            lol[i] = zn;
            zn -= 2;
        }
        for (int i = 0; i < lol.length; i++)
        {
            System.out.println(lol[i] + "; ");
        }
    }
}
