public class D3_1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add (new Phone ("Nancy", "1234"));
        phoneBook.add (new Phone ("Tom", "5678"));
        phoneBook.add (new Phone ("Ann", "9012"));
        print(search (phoneBook, "Tom"));
    }
    public static Phone search (PhoneBook phoneBook, String key) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equals(key)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }
    public static void print (Phone phone) {
        System.out.println ("name:" + phone.getName() + " number:" + phone.getNumber());
    }
}
