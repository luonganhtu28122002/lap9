package bank.t2108a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();

    public long getBalanceNumber() {
        return balanceNumber;
    }

    public static long transfes(long money) {
        //kiem tra neu so tien nho hon 50.000 thi thong bao so tien chuyen toi thieu phai la 50.000
        //neu so tien chuyen lon hon so du thi thong bao tai khoan khong du
        //neu chuyen thanh cong thi thong bao chuyen khoan thanh cong, in ra so du moi va them lich su giao dich moi
        return balanceNumber;
    }

    public void actionTransfer() {
        //thuc hienj cong viec nhu nhap so tai khoan thu huong so tien mo ta taij day
    }
    public void getHistory() {
        //in danh sach lich su giao dich
    }
    //dinh dang so tien minh mong muon
    public static String fomatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->1000,000.00
        return formatter.format(money);
    }

}
