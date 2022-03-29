public class Repeats {

    static final int NO_OF_CHARS = 256;

    public static void fillCharaCounts(String str, int[] count)
    {
        for (int i = 0; i < str.length(); i++)
        count[str.charAt(i)]++;
    }

    static void printDups(String str)
    {
        int count[] = new int[NO_OF_CHARS];
        fillCharaCounts(str, count);
        for(int i =0 ; i < NO_OF_CHARS; i++)
            if(count[i] > 1)
                {// remove if not working 
                    System.out.println((char) (i) + ", count = " + count[i]);
                }
     }

     public static void main(String[] args)
     {
         String str = "AljayLabayoga";
         printDups(str);
     }
}
