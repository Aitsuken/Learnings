using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sharupudekinai
{
	class Program
	{
		static void Main(string[] args)
		{
            // This loop goes row by row.
            for (int row = 1; row <= 100; row++)
            {
                if (row % 5 == 0 && row % 3 == 0)
                {
                    Console.WriteLine("FizzBuzz");
                }else if(row % 3 == 0)
                {
                    Console.WriteLine("Fizz");
                }else if(row % 5 == 0)
                {
                    Console.WriteLine("Buzz");
                }
                else
                {
                    Console.WriteLine(row);
                }
                // Print this out to move down a line.
                Console.WriteLine();
            }

            // Wait for the user to respond before closing...
            Console.ReadKey();
        }
	}
}