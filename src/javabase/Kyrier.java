package javabase;
//задание 1 от 22.01
public class Kyrier {
    public static void main(String[] args)
    {
        int [][] dom = new int[10][5];
        for(int i = 0; i<dom.length; i++)
        {
            for(int k = 0; k < dom[i].length; k++)
            {//заполнение квартитирами
             dom[i][k]  = k + 1 + (i + dom[i].length);
                System.out.println(i + 1 + "этаж , кв" + (k + 1 + (i + dom[i].length)) + " доставлено, \n");
            }
        }
    }
}
