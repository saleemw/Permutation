public class Permute {

    public static void main(String[] args) {

        final int[] intArr = new int[]{1, 2, 3, 4};
        final String str = "ABCD";
        final Permutation permutation = new Permutation();
        permutation.permute(intArr).forEach(System.out::println);
        System.out.println("_____________________________________________");
        permutation.permute(str).forEach(System.out::println);
    }

}
