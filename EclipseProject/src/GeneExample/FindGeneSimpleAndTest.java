package GeneExample;

public class FindGeneSimpleAndTest {
	
	public static String FindGeneSimple(String dna)
	{
	  String Result ="";
	  int startIndex = dna.indexOf("ATG");
	  if (startIndex == -1)
	  {
		  return "";
	  }
	  int stopIndex = dna.indexOf("TAA",startIndex+3);
	  if (startIndex == -1)
	  {
		  return "";
	  }
	  Result = dna.substring(startIndex, stopIndex+3);
	  return Result;
		  
	}
	
	public static void main(String[] args) {
		
	    String dna = "AATGCGTAATATGGT";
	    System.out.println("DNA Stand is  "  +  dna);
	    String gene = FindGeneSimple(dna);
	    
	    System.out.println("Gene is " + gene);
		}


	
}
