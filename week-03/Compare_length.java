public class Compare_length {
    public static void main(String[] args) {

// - Készíts egy `firstArrayOfNumbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[1, 2, 3]`
// - Készíts egy `secondArrayOfNumbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[4, 5]`
// - Írasd ki a konzolra, hogy "A secondArrayOfNumbers hosszabb", ha
//   `secondArrayOfNumbers` több elemet tartalmaz, mint az `firstArrayOfNumbers`

        int[] firstArrayOfNumbers = new int[3];

        firstArrayOfNumbers[0] = '1';
        firstArrayOfNumbers[1] = '2';
        firstArrayOfNumbers[2] = '3';

        int[] secondArrayOfNumbers = new int[2];

        secondArrayOfNumbers[0] = '4';
        secondArrayOfNumbers[1] = '5';

        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("A secondArrayOfNumbers hosszabb" + secondArrayOfNumbers.length + "elem van összesen, míg a " + firstArrayOfNumbers.length);
        }
        else{
            System.out.println("A secondArrayOfNumbers rövidebb, ebben a tömbben: " + secondArrayOfNumbers.length + " elem van összesen, míg a firstArrayOfNumbers tömbben " + firstArrayOfNumbers.length + " elem van.");
        }
    }
}
