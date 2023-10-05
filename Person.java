public class Person {
    private String email;
    private String fullName;
    private int birthYear;
    private String gender;
    private String phoneNumber;
    private String address;

    public Person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Thong tin ca nhan:");
        System.out.println("Email: " + email);
        System.out.println("Ho và ten: " + fullName);
        System.out.println("Nam sinh: " + birthYear);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("So dien thoai: " + phoneNumber);
        System.out.println("Dia chi: " + address);
    }
}