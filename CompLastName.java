import java.util.*;

public class CompLastName implements Comparator<String>{
	
   public int compare(String a, String b){
         int i,j;

         i = a.lastIndexOf(' ');
         j=a.lastIndexOf(' ');


  return a.substring(i).compareToIgnoreCase(b.substring(j));

   }

}
class CompPancard implements Comparator<String>{
	
   public int compare(String a, String b){
         int i,j;

          // i =  a.IndexOf(' ');
          // j= b.IndexOf(' ');


  return a.compareToIgnoreCase(b);

   }

}

class  ComapreThenByFirst implements Comparator<String>{

      public int compare (String a, String b)
{

		int i,j;
		return a.compareToIgnoreCase(b);

}


}

class TreeNapDemo2{

    public static void main (String args[]){
           CompLastName  comp = new CompLastName();
           CompPancard  pcomp = new CompPancard();
           Comparator<String> compaLastThenFirst = comp.thenComparing(new ComapreThenByFirst());
             Comparator<String> compPan = pcomp.thenComparing(new CompPancard());
          TreeMap<String, Double>  tm =  new TreeMap<String, Double>(compPan);
       tm.put("john Doe", new Double(123.233));
       tm.put("vohn Doe", new Double(163.233));
       tm.put("hohn Doe", new Double(183.233));
       tm.put("kohn Doe", new Double(1883.233));
       tm.put("yohn Doe", new Double(1299.233));
       tm.put("bohn Doe", new Double(1238.233));
       tm.put("asda", new Double(1883.233));
       tm.put("dfgdg", new Double(1299.233));
       tm.put("qweq", new Double(1238.233));
   

 Set<Map.Entry<String, Double>> set = tm.entrySet();

 for(Map.Entry<String,Double> me : set){
 	System.out.println("key" +me.getKey());
 	 	System.out.println("values" +me.getValue());


 }
    double balance= tm.get("john Doe");
    tm.put("john Doe", balance+2000);
    System.out.println("new balance" +tm.get("john Doe"));




    }


}