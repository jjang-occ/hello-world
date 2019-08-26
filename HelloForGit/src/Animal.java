
public class Animal {
	private String name;
	public Animal() { name = "animal"; }
	public String getName() { return name; }
	public void setName(String aName) { name = aName; }
	
	@Override
	public String toString()
	{
		return name;
	}
}
