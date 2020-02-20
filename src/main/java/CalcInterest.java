public class CalcInterest {
    public float calculateSI(float p, float r,float t){
        return p*r*t/100;
    }
    public float calculateCI(float p, float r,float t)  {
        float amt = (float) (p * Math.pow(1 + (r/100),t));
        float interest = amt - p;
        return interest;
    }
}
