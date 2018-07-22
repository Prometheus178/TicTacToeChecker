public class Reverse {
    public static void main(String[] args) {

        String[] array = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


        int len = array.length;
        for (int i = 0; i < len; i++){
            int indexToPrint = len - 1 - i;
            System.out.println(array[indexToPrint] + " ");
        }



    }

}
