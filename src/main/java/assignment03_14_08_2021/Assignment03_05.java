/*5. <html>
<body>
<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>
</body>
</html>

Extract only transaction ID from the HTML*/

package assignment03_14_08_2021;

public class Assignment03_05 {
    public static void main(String[] args) {
        String str = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>";
        System.out.println("Transaction ID: "+str.substring(62,72)); //using substring to get exact locations string values
    }
}
