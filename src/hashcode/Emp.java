package hashcode;

import java.util.HashMap;
import java.util.HashSet;

public class Emp {
 
	int id;
	String name;
	String city;
	public Emp(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	public static void main(String[] args) {
		HashMap<Emp, String> hm = new HashMap<Emp, String>();
		Emp e1 = new Emp(1, "P", "pune");
		Emp e2 = new Emp(2, "P", "mum");
		hm.put(e1, "e1");
		hm.put(e2, "e2");
		
	
		//HashSet hset=new HashSet<>();
		//hm.get();
		System.out.println("my opp  : "+hm.get(new Emp(6, "N", "lavasa")));
		
	}
	
	
	
}
