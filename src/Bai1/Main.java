package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction psTong;
        Fraction psTru;
        Fraction psNhan;
        Fraction psChia;


        //phân số thứ nhất
        System.out.println("Nhập các phần tử của phân sô thứ nhất:");
        System.out.println("Nhập tử số:");
        ps1.setTuSo(sr.nextInt());
        System.out.println("Nhập mẫu số:");
        ps1.setMauSo(sr.nextInt());
        System.out.println("Phân số thứ nhất vừa nhập là:");
        ps1.hienThi();
        System.out.println("Phân số rứt gọn của phân số thứ nhất là:");
        ps1.rutGon();
        System.out.println("Phân số nghich đảo của phân số thứ nhất là:");
        ps1.nghichDao();


        System.out.println("---------------");
        //phân số thứ hai
        System.out.println("Nhập các phần tử của phân sô thứ hai:");
        System.out.println("Nhập tử số:");
        ps2.setTuSo(sr.nextInt());
        System.out.println("Nhập mẫu số:");
        ps2.setMauSo(sr.nextInt());
        System.out.println("Phân số thứ hai vùa nhập là:");
        ps2.hienThi();
        System.out.println("Phân số nghich đảo của phân số thứ nhất là:");
        ps2.nghichDao();
        System.out.println("Phân số rứt gọn của phân số thứ hai là:");
        ps2.rutGon();

        psTong = ps1.add(ps2);
        System.out.println("Phan so tong la:");
        psTong.hienThi();

        psTru = ps1.sub(ps2);
        System.out.println("Phan so hiệu la:");
        psTru.hienThi();

        psNhan = ps1.mul(ps2);
        System.out.println("Phan so nhan la:");
        psNhan.hienThi();

        psChia = ps1.div(ps2);
        System.out.println("Phan so hiệu la:");
        psChia.hienThi();

    }
}