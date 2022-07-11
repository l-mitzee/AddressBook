package line.bl.segment;

public class Line_Segment {
	public static void main(String[] args) {
		int x1=2, y1=3, x2=4, y2=5;
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("calculate distance of the given cartesian = "+distance);
	}

}
