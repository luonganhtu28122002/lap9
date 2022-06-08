package bank.t2108a;

public class ValidateAccount {

    //kiem tra dang nhap
    public final String MOBILE = "0904666666";
    public final String PASSWORD = "Ngo Van Khoai";
    public boolean checkAcount(String mobile, String password) {
        if (mobile.equals(MOBILE)){
            if (password.equals(PASSWORD)){
                System.out.println("Dang Nhap Thanh Cong!");
                return true;
            } else {
                System.out.println("Mat khau sai, vui long nhap lai");
                return false;
            }
        }else {
            System.out.println("Kiem tra lai so dien thoai hoac password");
            return false;
        }
    }
}
