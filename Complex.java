public class Complex {
    double R;//复数的实部
    double I;//复数的虚部

    Complex(double R, double I) {
        this.R = R;
        this.I = I;
    }

    public static double getRealPart(double R) {  //返回复数的实部
        return R;
    }

    public static double getImagePart(double I) { //返回复数的虚部
        return I;
    }

    public Complex ComplexAdd(Complex c) {//加法运算
        return new Complex(R + c.R, I + c.I);
    }

    public Complex ComplexSub(Complex c) {//减法运算
        return new Complex(R - c.R, I - c.I);
    }

    public Complex ComplexMulti(Complex c) {//乘法运算
        return new Complex(R * c.R - I * c.I, R * c.I + I * c.R);
    }

    public Complex ComplexDiv(Complex c) {//除法运算
        return new Complex((R * c.I + I * c.R) / (c.I * c.I + c.R * c.R), (I * c.I + R * c.R) / (c.I * c.I + c.R * c.R));
    }

    public String toString() {//重写toString方法
        String str = "";
        if (I > 0)
            str = R + "+" + I + "i";
        if (I == 0)
            str = R+"";
        if (I < 0)
            str = R + "" + I + "i";
        return str;
    }
    public boolean equals(Object obj){//重写equals方法
        if (this == obj)
            return true;
        if(obj==null)
            return false;
        if(obj instanceof Complex){
            Complex p = (Complex) obj;
            if(p.R==this.R &&p.I==this.I )
                return true;
        }
        return false;
    }
}