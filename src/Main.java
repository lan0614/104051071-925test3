import java.util.Scanner ;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  a, b , c , d , e ;
        int x , y ;
        x = input.nextInt();
        y = input.nextInt();
        System.out.printf("%d %d ", x ,y );

        a=x+y;
        b=x*y;
        c=x-y;
        d=x/y;
        e=x%y;

        System.out.printf("\n%d+%d=%d ", x ,y , a);
        System.out.printf("\n%d*%d=%d ", x ,y , b);
        System.out.printf("\n%d-%d=%d ", x ,y , c);
        System.out.printf("\n%d/%d=%d...%d ", x ,y , d , e );
    }
}
