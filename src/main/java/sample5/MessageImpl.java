package sample5;

public class MessageImpl implements Message {

	private String name; //(������ ���ؼ� �ְ�)
	private String greeting;//setter���ؼ� �ְ�
	
	
	
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
