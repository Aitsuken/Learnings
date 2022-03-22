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
			int[] x = new int[]{25, 30, 40, 50, 60, 70, 90, 100, 110};

			int[] y = new int[x.Length];
			for(int i =0; i < x.Length; i++)
            {
				y[i] = x[i];
				Console.Write(y[i] + " ");
            }

            // Wait for the user to respond before closing...
            Console.ReadKey();
        }
	}
}