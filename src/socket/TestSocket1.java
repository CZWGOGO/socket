package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by CZWGOGO on 2019/10/20 4:24
 */
public class TestSocket1 {
    public static void main(String[] args) throws IOException {

        Process p=Runtime.getRuntime().exec("ping "+"192.168.2.106");

        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line=null;
        StringBuilder sb=new StringBuilder();
        while ((line=br.readLine())!=null){
            if(line.length()!=0)
                sb.append(line+"\r\n");
        }
        System.out.println("本次指令返回的消息是：");
        System.out.println(sb.toString());
    }
}
