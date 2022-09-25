package me.mikusugar.easyagent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mikusugar
 * @version 1.0, 2022/9/23 16:49
 */
public class Conf
{
    private String host;

    private String pw;

    private String user;

    private String sshPort;

    private String localPort;

    private String remotePort;

    public int getSshPort()
    {
        return Integer.parseInt(sshPort);
    }

    public void setSshPort(String sshPort)
    {
        this.sshPort = sshPort;
    }

    public static Conf parse(String[] args) throws Exception
    {
        Map<String, String> map = new HashMap<>();
        for (String s : args)
        {
            final String[] strs = s.split("=");
            if (strs.length != 2)
            {
                throw new Exception("参数必须为 a=b ,当前为 " + s);
            }
            map.put(strs[0], strs[1]);
        }

        final Conf res = new Conf();

        if (!map.containsKey("host"))
        {
            throw new Exception("参数必须包含 host");
        }
        res.setHost(map.get("host"));

        if (!map.containsKey("user"))
        {
            throw new Exception("参数必须包含 user");
        }
        res.setUser(map.get("user"));

        if (!map.containsKey("pw"))
        {
            throw new Exception("参数必须包含 pw");
        }
        res.setPw(map.get("pw"));

        if (!map.containsKey("localPort"))
        {
            throw new Exception("参数必须包含 localPort");
        }
        res.setLocalPort(map.get("localPort"));

        if (!map.containsKey("remotePort"))
        {
            throw new Exception("参数必须包含 remotePort");
        }
        res.setRemotePort(map.get("remotePort"));

        if (!map.containsKey("sshPort"))
        {
            throw new Exception("参数必须包含 sshPort");
        }
        res.setSshPort(map.get("sshPort"));

        return res;

    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public String getPw()
    {
        return pw;
    }

    public void setPw(String pw)
    {
        this.pw = pw;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public int getLocalPort()
    {
        return Integer.parseInt(localPort);
    }

    public void setLocalPort(String localPort)
    {
        this.localPort = localPort;
    }

    public int getRemotePort()
    {
        return Integer.parseInt(remotePort);
    }

    public void setRemotePort(String remotePort)
    {
        this.remotePort = remotePort;
    }
}
