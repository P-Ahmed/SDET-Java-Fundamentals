/*4. 1 piece share 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.
Find total price and total quantity using regular expression.*/

package assignment03_14_08_2021;

public class Assignment03_04 {
    public static void main(String[] args) {
        String str = "1 piece share 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk.";
        str = str.replaceAll("[^\\d]", " "); //replaces all letter with blank spaces
        //System.out.println(str);
        str = str.trim(); //replaces all spaces before the first number and after the last number
        //System.out.println(str);
        str = str.replaceAll(" +", " "); //replaces all the spaces between the numbers
        //System.out.println(str);
        String[] arr = (str.split(" ")); //puts the split numbers into arrays

        double shareQuantity = Double.parseDouble(arr[0]);
        double sharePrice = Double.parseDouble(arr[1]);
        double shirtQuantity = Double.parseDouble(arr[2]);
        double shirtPrice = Double.parseDouble(arr[3]);
        double pantQuantity = Double.parseDouble(arr[4]);
        double pantPrice = Double.parseDouble(arr[5]);

        double totalQuantity = (shareQuantity + shirtQuantity + pantQuantity);
        double totalPrice = ((shareQuantity * sharePrice) + (shirtQuantity * shirtPrice) + (pantQuantity * pantPrice));

        System.out.println("Total quantity: "+totalQuantity);
        System.out.println("Total price: "+totalPrice);
    }
}
