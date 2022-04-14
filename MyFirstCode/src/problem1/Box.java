package problem1;

public class Box {
	
	private double height,width,depth;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	Box(double h,double w,double d){
		height=h;
		width=w;
		depth=d;
	}
	
	void DisplayVol() {
		
		System.out.println("Volume= "+height*width*depth);
		
		
		
	}

}
