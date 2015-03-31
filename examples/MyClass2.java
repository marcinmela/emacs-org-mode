||package emacs;

import java.io.Serializable;

puqblic class MyClass1 implements Serializable {
	
    private static final long serialVersionUID = 2L;

    private String fullName;
	
    private Integer age;
	
    public MyClass1(String fullName) {
	super();
	this.fullName = fullName;
    }

    public MyClass1(String fullName, Integer age) {
	super();
	this.fullName = fullName;
	this.age = age;
    }

    @Override
    public String toString() {
	return "MyClass1 [fullName=" + fullName + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 17;
	int result = 1;
	result = prime * result + ((age == null) ? 0 : age.hashCode());
	result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
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
	if (fullName == null) {
	    if (other.fullName != null)
		return false;
	} else if (!fullName.equals(other.fullName))
	    return false;
	return true;
    }

    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }
}
