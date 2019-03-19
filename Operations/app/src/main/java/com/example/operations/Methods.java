package com.example.operations;

public class Methods {

    public static int  Calculate(int N1,int N2,String Operation){
        int Total =0;
        switch (Operation){
            case "Addition":
                Total = N1 + N2;
                break;
            case "Subtraction":
                Total = N1 - N2;
                break;
        }
        return Total;
    }

}
