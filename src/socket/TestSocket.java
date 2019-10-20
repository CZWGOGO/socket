package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLOutput;

/**
 * Created by CZWGOGO on 2019/10/20 3:11
 */
public class TestSocket {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host=InetAddress.getLocalHost();
        String ip=host.getHostAddress();
        System.out.println("本机ip地址:"+ip);

    }
}
