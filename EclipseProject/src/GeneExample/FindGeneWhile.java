package GeneExample;

public class FindGeneWhile {
	
	public static String FindGene(String dna)
	{
		int startIndex= dna.indexOf("ATG");
		int currIndex = dna.indexOf("TAA",startIndex+3);
		
		while (currIndex != -1)
		{
			if ((currIndex - startIndex)%3 == 0)
			{
				return dna.substring(startIndex,currIndex + 3);
			}
			else
			{
				currIndex = dna.indexOf("TAA",currIndex + 1);
			}
			
			
		}
		return "";
	}

	public static void main(String[] args) {

   String dna="AATGCGTAATTAATCG";
   System.out.println("DNA stand is" + dna);
   String gene = FindGene(dna);
   System.out.println("Gene is" + gene);

	}

}
