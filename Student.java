class Student {
    String name;

    String inputName(String n) {
        name = n;
        return name;
    }

    void Average(int m1, int m2, int m3) {
        int avg = (m1 + m2 + m3) / 3;
        if (avg > 50) {
            System.out.println(name + " passed");
        } else {
            System.out.println(name + " Failed");
        }
    }

    public static void main(String args[]) {
        Student s = new Student();
        s.inputName("Rahul");
        s.Average(60, 70, 45);
    }
}
