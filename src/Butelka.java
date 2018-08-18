

public class Butelka {
    private double ileLitrow;

  /*  Butelka()
    {

    }*/
    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }

    public static void main(String[] args) {
    Butelka butelka[] = new Butelka[50];
    for (int i=0;i<=49;i++) {
        butelka[i] = new Butelka(2);
        System.out.println(butelka[i]);
    }
    }
}
