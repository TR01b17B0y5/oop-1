public class Introduction {
    public static void main(String[] args) {
        // Thông tin cá nhân
        String fullName = "Vũ Thanh Tùng";
        String studentID = "23020572";
        String className = "K68IS";
        String githubUsername = "TR01b17B0y5";
        String email = "tungrabbit0104@gmail.com";

        System.out.println(fullName + "\t" + studentID + "\t" + className + "\t" + githubUsername + "\t" + email);

        for (int i = 9; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down, pass it around,");
            if (i - 1 ==  0) {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
