

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String[] str=new String[] {"Apple","Orange","Mango","Apple","Apple","Orange"};
	   Map<String, Integer> map=new HashMap<String, Integer>();
	   for(int i=0;i<str.length;i++) {
	   map.put(str[i],map.getOrDefault(str[i], 0)+1 );
	   
	   
	   }
	}

}
