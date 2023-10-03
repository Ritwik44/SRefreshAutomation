package Javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunction {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("Cprajitha");
		names.add("Rampurhat");
		names.add("Aparna");
		names.add("Shishir");
		names.add("Avishikta");
		names.add("Somapa");
		names.add("Balapras");
		
	// printig the value
	//	names.stream().forEach(s->System.out.println(s));
		
	//  printing the value starts with B	
	//	names.stream().filter(s->s.startsWith("B")).forEach(s->System.out.println(s));

	//   Long no=names.stream().filter(s->s.startsWith("A")).count();
	//   System.out.println(no);
	   
	// names.stream().filter(s->s.length()<7).forEach(s->System.out.println(s));
  //	names.stream().filter(s->s.length()>7).limit(1).forEach(s->System.out.println(s));
		
//		names.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//		names.stream().sorted().forEach(s->System.out.println(s));
//		names.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
//		names.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
	//	names.stream().filter(s->s.startsWith("S")).sorted().forEach(s->System.out.println(s));
		
	//	boolean flag=names.stream().anyMatch(s->s.equalsIgnoreCase("Shishir"));
	//	System.out.println(flag);
		
	/*	List<String> new_name=names.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		System.out.println(new_name.get(0));
		int size=new_name.size();
		System.out.println(new_name.get(size-1));  */
		
		List<Integer> values=Arrays.asList(12,5,14,2,20,2,3);
	//	values.stream().sorted().forEach(s->System.out.println(s));
		
	//	values.stream().sorted().distinct().forEach(s->System.out.println(s));
		
		List<Integer> new_values=values.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(new_values.get(1));
		
	}

}
