package com.alen.Test;

public class Test {
    public static void main(String[] args) {
        ExceptionHandle et=new ExceptionHandle();
        for(int i=0;i<3;i++){
            try{

                    et.A();
                    System.out.println(i);



            }catch (Exception e){
                System.out.println("捕获到异常了");
                e.printStackTrace();
            }
        }


    }
}
