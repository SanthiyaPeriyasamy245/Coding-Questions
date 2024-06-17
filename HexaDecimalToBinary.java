/*Input: Hexadecimal = 1AC5
Output: Binary = 0001101011000101
Explanation:
    Equivalent binary value of 1: 0001
    Equivalent binary value of A: 1010
    Equivalent binary value of C: 1100
    Equivalent binary value of 5: 0101

Input: Hexadecimal = 5D1F
Output: Binary = 0101110100011111 

we can also use try catch for exception handling
 try{
            hextobinhexdec);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("");
        }

*/

public class HexaDecimalToBinary {
    public static void main(String[] args) {
        String s = "5D1F";
        hexatoBin(s.toCharArray());
    }

    public static void hexatoBin(char[] arr) {
        int i = 0;
        while (i < arr.length) {
            switch (arr[i]) {
                case '0':
                    System.out.print("0000 ");
                    break;
                case '1':
                    System.out.print("0001 ");
                    break;
                case '2':
                    System.out.print("0010 ");
                    break;
                case '3':
                    System.out.print("0011 ");
                    break;
                case '4':
                    System.out.print("0100 ");
                    break;
                case '5':
                    System.out.print("0101 ");
                    break;
                case '6':
                    System.out.print("0110 ");
                    break;
                case '7':
                    System.out.print("0111 ");
                    break;
                case '8':
                    System.out.print("1000 ");
                    break;
                case '9':
                    System.out.print("1001 ");
                    break;
                case 'A':
                case 'a':
                    System.out.print("1010 ");
                    break;
                case 'B':
                case 'b':
                    System.out.print("1011 ");
                    break;
                case 'C':
                case 'c':
                    System.out.print("1100 ");
                    break;
                case 'D':
                case 'd':
                    System.out.print("1101 ");
                    break;
                case 'E':
                case 'e':
                    System.out.print("1110 ");
                    break;
                case 'F':
                case 'f':
                    System.out.print("1111 ");
                case '.':
                    System.out.print(".");
                    break;
                default:
                    System.out.print("\nInvalid hexadecimal digit " + arr[i]);

            }
            i++;

        }
    }
}