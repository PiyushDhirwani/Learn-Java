import java.util.*;  


class Student{
    int id;
    String name;
    int section;

    public void show(){
        System.out.println(id+" "+ name+" "+section);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        int s1=1,s2=2;
        System.out.println("Hello, World!");
        System.out.print("Hello, World!");
        System.out.print(s1+s2);
        int alpha=1;
        if (alpha>1){
            System.out.println("Not");
        }
        else{
            System.out.println("okay");
        }
        switch(alpha){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
        int i=0;
        do {
            System.out.println(i);
            i++;
        } while (i==2);
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for (int j=0;j<m;j++){
            for (int k=0;k<n;k++){
                arr[j][k]=sc.nextInt();
            }
        }
        for (int j=0;j<m;j++){
            for (int k=0;k<n;k++){
                System.out.print(arr[j][k]);
            }
            System.out.println();
        }

        Student st1=new Student();
        st1.id=0;
        st1.name="A";
        st1.section=0;
        Student st2=new Student();
        st2.id=1;
        st2.name="B";
        st2.section=1;
        Student st3=new Student();
        st3.id=2;
        st3.name="C";
        st3.section=2;
        Student students[]=new Student[3];
        students[0]=st1;
        students[1]=st2;
        students[2]=st3;
        for (int j=0;j<3;j++){
            System.out.println(students[j].id+students[j].name+students[j].section);
        }
        List<Integer> arr=new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        for (int i=0;i<10;i++){
            System.out.println(arr.get(i));
        }
    }
}