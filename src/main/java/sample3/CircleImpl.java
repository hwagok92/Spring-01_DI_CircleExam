package sample3;


public class CircleImpl implements Circle{
	private double radius; //반지름
	private Point point;
	 
	public CircleImpl() {
		System.out.println("CircleImpl() 생성자");
	}
	public CircleImpl(double radius, Point point) {
		super();
		System.out.println("CircleImpl(double radius, Point point)");
		this.radius = radius;
		this.point = point;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("원의 중심:"+point.getXpos()+","+point.getYpos());
		System.out.println("원의 면적:"+getArea());
	
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2.0);//3.14*radius의 제곱
		
	}

}
