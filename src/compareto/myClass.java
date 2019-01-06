package compareto;

public class myClass implements Comparable<myClass> {
	
	int num;
	String name;
	
	public myClass(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[" + num + ", " + name + "]";
	}
	@Override
	public int compareTo(myClass m) {
		
	   return (num - m.getNum());
	//	return (name.compareTo(m.getName()));
	}
	
	

}
