import java.util.ArrayList;

public class Challenge_3_LargestPrimeFactor
{
    /***
     *          Challenge: 3
     *          The prime factors of 13195 are 5, 7, 13 and 29.
     *          What is the largest prime factor of the number 600851475143 ?
     */

    //Service method to determine whether a number is Prime
    public static boolean checkPrime(long x)
    {
        //Disregard negatives and 0
        if (x <= 1)
        {
            return false;
        }
        else
        {
            //Check all numbers less than square root of  x to see if X is non prime
            for (long i = 2; i <= Math.sqrt(x); i++)
            {
                if (x % i == 0)
                {
                    //X is not prime
                    return false;
                }
            }
            //There are no divisors in X except itself and 1
            //X is therefore a prime number
            return true;
        }
    }


    public static void main(String[] args)
    {
        //Set target number to find largest prime factor of
        long target = 600851475143L;
        //Create ArrayList to hold Prime Factors
        ArrayList<Long> primes = new ArrayList<>();
        //Iterate over all numbers between 2 and square root of target
        for (long i = 2; i <= Math.sqrt(target); i++)
        {
            //Check if i is odd (all even numbers are not prime as divisible by 2)
            if (i % 2 != 0)
            {
                //Determine whether i is a factor of target
                //System.out.println(i);
                if (target % i == 0)
                {
                    //Check if i is prime
                    if (checkPrime(i))
                    {
                        //Add to list of primes
                        primes.add(i);
                    }
                }
            }

        }
        //Print out highest Prime factor of Target
        System.out.println("Largest Prime Factor of " + target + " = " + primes.get(primes.size() - 1));
    }
}
