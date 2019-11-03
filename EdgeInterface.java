
interface EdgeInterface {

	//[(x1,y1,z1),(x2,y2,z2)]
	// 2 points for an edge which can be in any order

	PointInterface [] edgeEndPoints();

}

class Edge implements EdgeInterface {

	Point Point1;

	Point Point2;

	Edge(Point p1,Point p2){
		this.Point1=p1;
		this.Point2=p2;
	}

	PointInterface [] edgeEndPoints(){
		PointInterface[] pointarray=new PointInterface[]{Point1,Point2};
		return pointarray;
	}

	float getLength(){
		float xdiff=Point1.getX()-Point2.getX();
		float ydiff=Point1.getY()-Point2.getY();
		float zdiff=Point1.getZ()-Point2.getZ();

		float len2=(xdiff*xdiff)+(ydiff*ydiff)+(zdiff*zdiff);
		float length=Math.sqrt(len2);
		return length;
	}
	@Override
	public boolean equals(Object trythis){
		Edge fuck=(Edge)trythis;
		if(((fuck.Point1.equals(Point1))&&(fuck.Point2.equals(Point2)))||((fuck.Point2.equals(Point1))&&(fuck.Point1.equals(Point2)))){
			return true;
		}
		else{
			return false;
		}
	}
}
