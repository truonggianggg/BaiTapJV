package Bai1;

public class Fraction {
    int tuSo;
    int mauSo;

    // getter của thuộc tính tuSo
    public int getTuSo() {
        return tuSo;
    }

    // setter của thuộc tính tuSo
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }


    // getter của thuộc tính mauSo
    public int getMauSo() {
        return mauSo;
    }

    // setter của thuộc tính mauSo
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    // Ham khoi tao khong doi so
    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }
    // Ham khoi tao co doi so
    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }

    //   CÁC PHƯƠNG THỨC
    //  - In Phân số
    public void hienThi(){

        if (mauSo * tuSo >= 0) {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }


    //- Rút gọn phân số
    public void rutGon(){
        // Tim uscln
        int a = tuSo;
        int b = mauSo;
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        // Toi gian phan so
        if (tuSo * mauSo >= 0){
            System.out.println(Math.abs(tuSo / b) + "/" + Math.abs(mauSo / b));
        } else {
            System.out.println("-" + Math.abs(tuSo / b) + "/" + Math.abs(mauSo / b));
        }
    }

    //- Nghịch đảo phân số
    public  void nghichDao(){
        int a = Math.abs(tuSo);
        int b = Math.abs(mauSo);

        if (tuSo * mauSo >= 0){
            System.out.println(b+ "/" + a);
        } else {
            System.out.println("-" + b+ "/" + a);
        }

    }



    //- add(), sub(), mul(), div() tương ứng để thực hiện cộng, trừ, nhân, chia hai phân số cho nhau.


    // Ham cong 2 phan so
    public Fraction add(Fraction ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    // Ham trừ 2 phan so
    public Fraction sub(Fraction ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
    // Ham nhân 2 phan so
    public Fraction mul(Fraction ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
    // Ham chia 2 phan so
    public Fraction div(Fraction ps2) {
        int ts = tuSo * ps2.mauSo;
        int ms = mauSo * ps2.tuSo;
        return new Fraction(ts, ms);
    }
}
