public class Assignment1Question5 {
    public static void main(String[] args) {
        String word = "INEURON";
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
//I
//IN
//INE
//INEU
//INEUR
//INEURO
//INEURON








