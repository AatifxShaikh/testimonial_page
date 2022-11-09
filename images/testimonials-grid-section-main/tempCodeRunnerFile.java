public class Main{
    static int logic(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)+5;
        }
    }
    public static void main(String[] args) {
       int c=logic(10,20);
       System.out.println(c);
    }

}