
public class Graph {

	public int[][] metrics = { 
			{ -1, 5, -1, 5, 7 },
			{ -1, -1, 4, -1, -1},
			{ -1, -1, -1, 8, 2 }, 
			{ -1, -1, 8, -1, 6 }, 
			{ -1, 3, -1, -1, -1 } 
			};
	//最大距离
	int firstDistance = 0;
	
	public void operate(String start, String end, int maxStop,int longestDistance) {
		
		int lastIndex = start.length() - 1;
		//赋值最大距离
		if (lastIndex==0) {
			firstDistance=longestDistance;
		}
		//控制超出站点数
		if (lastIndex > maxStop)
			return;
		//控制距离不超过firstDistance
		if (longestDistance<= 0) 
			return;
		
		String lastCharacter = start.substring(lastIndex);

		if (lastIndex != 0 && end.equals(lastCharacter)) {
			System.out.println("stops:" + start + ",---steps:" + (lastIndex)+",---distance:"+(firstDistance-longestDistance));
		}
		
		for (int i = 0; i < 5; i++) {
			int distance=metrics[lastCharacter.charAt(0) - 'A'][i];
			if ( distance> 0) {
				operate(start + (char) (i + 'A'), end, maxStop,longestDistance-distance);
			}
		}
	}

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		// input start end  maxStop and longestDistance
		
		graph.operate("E", "A", 10,50);
	  /**
		* 	Test output
		* 
		* 	stops:CD,---steps:1,---distance:8
		*	stops:CDCD,---steps:3,---distance:24
		*	stops:CDEBCD,---steps:5,---distance:29
		*	stops:CEBCD,---steps:4,---distance:17
		*
		*/
	}
}