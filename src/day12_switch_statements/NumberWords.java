package day12_switch_statements;

public class NumberWords {
    public static void main(String[] args) {
        int num =3;
        if(num==1){
            System.out.println("one");
        } else if(num==2){
            System.out.println("two");
        }else if(num==3){
            System.out.println("tree");
        }

        switch(num){
            case 1:
                System.out.println("One");

        }
    }
}
