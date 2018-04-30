public class Calculator {

    private float num1;
    private float num2;

    public Calculator(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public float add(){
        return num1 + num2;
    }

    public float subtract(){
        return num1 - num2;
    }

    public float multiply(){
        return num1 * num2;
    }

    public float divide(){
        return num1 / num2;
    }

}
