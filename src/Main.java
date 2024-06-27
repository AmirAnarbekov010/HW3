//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // создание массива с задаными значениями
        double [] array = {12.23,12.123,123.23,-2.23,23.23,23.23,12.23,12.123,123.23,-2.23,23.23,12.23,12.123,123.23,-2.23,23.23};

        boolean negatifFaund = false;

        int countPositiveNumber = 0;

        int sumPositiveNumber = 0;

        //цикл for each-"для каждого занчение"
        for (double number:array){
            if (!negatifFaund&&number<0){
                negatifFaund = true;
            }else if (negatifFaund&&number>0){
                countPositiveNumber++;
                sumPositiveNumber +=number;
            }
        }

        //расчет среднего арифметического
        double averege  = sumPositiveNumber/countPositiveNumber;

        System.out.println("Средняя орифметическое чисел в масиве положительных чисел равна: " + averege);

    }
}