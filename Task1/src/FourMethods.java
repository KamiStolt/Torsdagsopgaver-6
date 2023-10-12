public class FourMethods {
    public void methodA(String input){
        System.out.println("j");
        if (input.equals("Declan")){
            methodB("b ");
        } else {
            System.out.println("a ");
        }
    }
    public void methodB(String input){
        System.out.println(input);
        if(input.equals("n")){
            System.out.println("n ");
        } else {
            System.out.println("a ");
        }
    }
    public void methodC(String input){
        System.out.println("e ");
        if(input.equals("c")){
        } else {
            System.out.println("r");
        }
    }
    public void methodD(String input) {
        System.out.println("s ");
        if(input.equals("h")){

        }else {
            System.out.println("j");
        }
    }
    public void methodE(String input){
        System.out.println("o");
        if(input.equals("p")){
        } else {
            System.out.println("v");
        }
    }
}
