class addcalci{
    public int add(int a, int b){
        return a+b;
    }
}


class subcalci extends addcalci{
    public int sub(int a, int b){
        return a-b;
    }
}

class mulcalci extends subcalci{
    public int mul(int a, int b){
        return a*b;
    }
}


class parent{
    public void print(){
        System.out.println("Parent");
    }
}

class child extends parent{
    public void print(){
        System.out.println("Child");
    }
}

public class NestedClass{
    public static void main(String[] args) {
        mulcalci cal=new mulcalci();
        int res=cal.add(3,4);
        parent p=new child();
        System.out.println(res);
    }
}




