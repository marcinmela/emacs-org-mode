package emacs;

import java.io.Serializable;

public class MyClass1 implements Cloneable, Serializable {
	
    private static final long serialVersionUID = 1L;

    private String name;
	
    private Integer age;
	
    public MyClass1(String name) {
	super();
	this.name = name;
    }

    public MyClass1(String name, Integer age) {
	super();
	this.name = name;
	this.age = age;
    }

    @Override
    public String toString() {
	return "MyClass1 [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }
	
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	MyClass1 other = (MyClass1) obj;
	if (age == null) {
	    if (other.age != null)
		return false;
	} else if (!age.equals(other.age))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }
}
