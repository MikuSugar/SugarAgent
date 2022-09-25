package me.mikusugar.easyagent;

import cn.hutool.extra.ssh.JschUtil;
import com.jcraft.jsch.Session;

/**
 * @author mikusugar
 * @version 1.0, 2022/9/23 16:41
 */
public class APP
{
    public static void main(String[] args) throws Exception
    {
        final Conf conf = Conf.parse(args);
        System.out.println("准备建立SSH 连接 " + conf.getHost());
        Session session = JschUtil.getSession(conf.getHost(), conf.getSshPort(), conf.getUser(), conf.getPw());
        System.out.println(
                "SSH 连接建立成功,当前代理为localhost:" + conf.getLocalPort() + "-->" + conf.getHost() + ":" + conf.getRemotePort());
        JschUtil.bindPort(session, conf.getHost(), conf.getRemotePort(), conf.getLocalPort());

    }
}
