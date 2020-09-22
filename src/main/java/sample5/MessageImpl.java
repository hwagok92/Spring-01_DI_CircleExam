package sample5;

public class MessageImpl implements Message {

	private String name; //(생성자 통해서 넣고)
	private String greeting;//setter통해서 넣고
	
	
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	public MessageImpl(String greeting) {
		super();
		this.greeting = greeting;
	}
	
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(name + "~" + greeting + "!");
	}

}
