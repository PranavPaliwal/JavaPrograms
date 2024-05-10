public class getset{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("red");
        System.out.println(p1.getcolor());
        p1.setTip(3);
        System.out.println(p1.gettip());
    }

}
class Pen{
    private String color;
   private int tip;

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){
        this.color=newcolor;
    }

    void setTip(int tip){
        this.tip=tip;
    }

}