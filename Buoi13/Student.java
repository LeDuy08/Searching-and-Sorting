public class Student {  
    private String id;  
    private String fullName;  
    private int age;  
    private float gpa;  

    public Student() {  
    }  

    public Student(String id, String fullName, int age, float gpa) {  
        this.id = id;  
        this.fullName = fullName;  
        this.age = age;  
        this.gpa = gpa;  
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
        result = prime * result + age;
        result = prime * result + Float.floatToIntBits(gpa);
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
        Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (fullName == null) {
            if (other.fullName != null)
                return false;
        } else if (!fullName.equals(other.fullName))
            return false;
        if (age != other.age)
            return false;
        if (Float.floatToIntBits(gpa) != Float.floatToIntBits(other.gpa))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", fullName=" + fullName + ", age=" + age + ", gpa=" + gpa + "]";
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }  
}
