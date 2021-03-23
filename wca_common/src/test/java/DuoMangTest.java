import org.junit.Test;
import org.omg.CORBA.INTERNAL;

public class DuoMangTest {

    @Test
    public void a(){

        int DbValue = 540348502;

        int b = DbValue%1000000;//时间及秒
        int d = b%100;//失败个数
        int e = (b-d)/100;//用时时间 秒
        int i = 0;
        String x = "";
        if(e>60){//
            i = e/60;//分
        }
        int z = e%60;//秒
        if(z<10){//不满10进行补位
            x = 0+""+z;
        }else
        {
            x = ""+z;
        }
        int c = (DbValue-b)/10000000;
        int f = 99-c+d;//还原个数
        int g = 99-c+2*d;//挑战个数
        System.out.println(f+"/"+g+" 用时"+i+":"+x);
    }

    @Test
    public void velocity() {//12894  //323
        int DbValue =12804;
        int i = 0;//分
        int a = 0;
        int b = 0;
        String x = "";//秒
        String y = "";//秒
        if (DbValue > 6000) {
            i = DbValue / 6000;
        }
        a = DbValue % 6000 / 100;//秒
        if (a < 10 && i != 0) {
            x = 0 + "" + a;
        } else {
            x = "" + a;
        }
        b = DbValue % 100;
        if (b < 10) {
            y = 0 + "" + b;
        } else {
            y = "" + b;
        }
        if (i == 0) {
            System.out.println(x + "." + y);
        }else {
            System.out.println(i + ":" + x + "." + y);
        }
    }
}
