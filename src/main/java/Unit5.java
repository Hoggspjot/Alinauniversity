public class Unit5 {
    public static void main(String[] args) {

        int white = 2;
        int brown = 4;
        int classes = 120/(white+brown);

        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n",
                classes, classes*white, classes*brown);
    }
}
