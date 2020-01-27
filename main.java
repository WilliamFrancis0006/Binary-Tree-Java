
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
            
            
    public static void main(String[] args)
    {
        hello();
    }
    public static char[][] hello()
    {
        
            char[][]arr = new char[5][5];
            for(int i = 0; i < 5; i++)
            {
                arr[i][i] = 'x'; 
                arr[i][4-i] = 'x';   
            }
            for(int i = 1; i < 4; i++)
            {
                arr[0][i] = '+';
            }
            for(int i = 1; i < 4; i++)
            {
                arr[i][0] = '0';
            }
            System.out.println(arr);
            return arr;
    }
}
