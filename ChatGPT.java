class ChatGPT {

    public static void createAccount(String email,
                                     String password,
                                     String firstName,
                                     String lastName) {

        System.out.println("ChatGPT Account Details:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }

    public static void main(String[] args) {

        createAccount(
            "aishwarya@gmail.com",
            "chatgpt@123",
            "Aishwarya",
            "Angadi"
        );
    }
}