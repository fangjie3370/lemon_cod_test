package HomeDay.day05;

/**
 * 2021/5/10 - 9:53
 */
public class Student {
    private String name;
    private int age = 15;
    private int score;

    public Student() {
        System.out.println("无参构造");
    }
    public Student(String name,int age,int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("有参构造");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age >15) {
            this.age = age;
        }else {
            System.out.println("年龄输入有误");
        }
    }
    public int getAge() {
        return age;
    }
//    public void setScore(int score) {  //只有get方法，没有set方法
//        this.score = score;
//    }
    public int getScore() {
        return score;
    }
    public void study() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }

}
