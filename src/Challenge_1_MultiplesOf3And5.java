public class Challenge_1_MultiplesOf3And5
{
    /***
     *      Challenge: 1
     *      If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     *      The sum of these multiples is 23.
     *      Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public static void main(String[] args)
    {
        int total = 0;
        //For loop from 1 to 999
        for (int i = 1; i < 1000; i++)
        {
            //Check if number is a multiple of 3
            if (i % 3 == 0)
            {
                System.out.println(i + " is a multiple of 3");
                total += i;
            }
            else
            {
                //Check if number is a multiple of 5
                if (i % 5 == 0)
                {
                    System.out.println(i + " is a multiple of 5");
                    total += i;
                }
                else
                {
                    //Number is not a multiple of 3 or 5
                    System.out.println(i + " is not a multiple of 3 or 5");
                }
            }
        }
        //Print Total to console
        System.out.println("Sum of multiples of 3 and 5 below 1000 is: " + total);
    }
}
