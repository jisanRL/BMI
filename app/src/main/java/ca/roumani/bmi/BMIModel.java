package ca.roumani.bmi;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by user on 3/26/17.
 */
public class BMIModel
{
    private double weight;
    private double height;


    public BMIModel(String w, String h ) {
        try
        {
            this.height = Double.parseDouble(h);
            this.weight = Double.parseDouble(w);
        } catch (NumberFormatException e)
        {

        }
    }

    public String getBMI(){
        double index = this.weight / (this.height * this.height);
        String result = String.format("%.1f", index);
        return result;
    }

    public String getWeightInPound() {
        int weightInLb = (int) Math.round(this.weight * 2.20);
        return String.format("%d", weightInLb);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PrintStream output = System.out;

        BMIModel model1 = new BMIModel("100","1.8");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model1.getWeightInPound(), model1.getBMI()));

        BMIModel model2 = new BMIModel("4.5", "1.35");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model2.getWeightInPound(), model2.getBMI()));

        BMIModel model3 = new BMIModel("80", "1.2");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model3.getWeightInPound(), model3.getBMI()));

        BMIModel model4 = new BMIModel("65", "1.6");
        output.println(String.format("Your weight in pound is %s and your BMI is %s", model4.getWeightInPound(), model4.getBMI()));
    }
}
