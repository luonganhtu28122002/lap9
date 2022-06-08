package bank.t2108a;

import java.util.concurrent.locks.ReentrantLock;

public class idGenerate {
    private static Long id = 0L;
    private static ReentrantLock lock = new ReentrantLock();

    public static Long getNewID() {
        Long result;
        lock.lock();//khoa bien id laij de cho duy nhat mot thread duoc truy xuat cap
        //de tranh tinh trang Data Racing
        try {
            result = ++id;//Tang roi gan vao rusult
        } finally {
            lock.unlock();//tang roi thi mo lock cho thread khac cung truy cap
            //nhieu nhu minh dung xong nha ve sinh thi di ra thoi
        }
        return result;
    }
    private void IdGenerate() {

    }
}
