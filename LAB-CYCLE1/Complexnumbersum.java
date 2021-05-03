public class Complexnumbersum {
    double real,img;
    Complexnumbersum(double r,double i){
        this.real=r;
        this.img=i;
    }
    public static Complexnumbersum sum(Complexnumbersum x1,Complexnumbersum x2)
    {
        Complexnumbersum temp=new Complexnumbersum(0,0);
        temp.real=x1.real+x2.real;
        temp.img=x1.img+x2.img;
        return temp;
    }
    public static void main(String[] args) {
        Complexnumbersum x1=new Complexnumbersum(6.2,5);
        Complexnumbersum x2=new Complexnumbersum(2.3,4.7);
        Complexnumbersum temp=sum(x1,x2);
        System.out.println("Sum is:"+ temp.real+" + "+ temp.img+"i");

    }
}
