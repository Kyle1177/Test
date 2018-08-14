/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcs3166_project;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Kyle1
 */
public class Router {

    private Map<String, String> table;
    private String ipAddress;
    private String subnetMask;

    public Router() {
        table = new HashMap<>();
        table.put("135.46.56.0/22", "Interface 0");
        table.put("135.46.60.0/22", "Interface 1");
        table.put("192.53.40.0/23", "Router 1");
        table.put("default", "Router 2");

    }

    public String getSubnetMask(String ip) {
        subnetMask = ip.substring(ip.length() - 2);
        return subnetMask;
    }

    public String getIPAddress(String ip) {
        ipAddress = ip.substring(0, ip.length() - 3);
        return ipAddress;
    }

    private String getBinary(String part) {
        return String.format("%8s", Integer.toBinaryString(Integer.parseInt(part))).replace(' ', '0');
    }

    public String getAsBinary(String ipAddress) {
        String[] parts = ipAddress.split("\\.");
        StringBuilder sb = new StringBuilder();

        sb.append(getBinary(parts[0]));
        sb.append(getBinary(parts[1]));
        sb.append(getBinary(parts[2]));
        sb.append(getBinary(parts[3]));

        return sb.toString();
    }

    public String getSubnetMask(int subnet) {

        StringBuilder sb = new StringBuilder("00000000000000000000000000000000");
        for (int i = 0; i < subnet; i++) {
            sb.replace(i, i + 1, "1");
        }

        return sb.toString();
    }

    public String checkRouting(String ip) {
        String destination;

        if (table.containsKey(ip)) {
            destination = table.get(ip);
        } else {
            destination = table.get("default");
        }

        return destination;
    }

}
