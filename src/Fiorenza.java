import java.util.Scanner;
public class Fiorenza
{
	static Scanner in = new Scanner(System.in);
	static int[] numeri = new int[6];
	public static void main(String[] args)
	{
	    System.out.println("Inserisci 6 numeri:");
	    for(int i = 0; i < numeri.length;i++) 
	    {
	    	System.out.println("Inserisci un numero:");
	    	numeri[i] = Integer.parseInt(in.nextLine());
	    }
	    System.out.println("Numeri inseriti:");
    	for(int i = 0;i < numeri.length; i++)
    	{
    		System.out.print(numeri[i]+",");
    	}
	    System.out.println("\nSeleziona l'esercizio:\n 1-somma e differenza indice pari e dispari 2-inverti array");
	    int selezione = Integer.parseInt(in.nextLine());	 
	    switch(selezione)
	    {
	    case 1:
	    	somsotparidisp();
	    case 2:
	    	invertiarray();
	    }
    }
    public static void somsotparidisp()
	{
    	    int sommapari = 0;
	        int differenzadispari = 0;
	        for(int i = 0; i < numeri.length;i++) 
		    {
		        if(i % 2 == 0)
		    	{
		    		sommapari += numeri[i];
		    	}
		    	if(i % 2 == 1)
		    	{
		    		 differenzadispari -= numeri[i];
		    	}
		    }
		    System.out.println("La somma tra i numeri con indice pari è: "+sommapari);
		    System.out.println("La differenza tra i numeri con indice dispari è: "+differenzadispari);
	}
    public static void invertiarray()
    {
    	for(int i = 0,j = numeri.length - 1;i < numeri.length - (numeri.length / 2); i++, j--)
    	{
    		int copiai;
    		copiai = numeri[i];
    		numeri[i] = numeri[j];
    		numeri[j] = copiai;
    	}
    	System.out.println("L'array al contrario è: ");
    	for(int i = 0;i < numeri.length; i++)
    	{
    		System.out.print(numeri[i]+",");
    	}
    }
}
