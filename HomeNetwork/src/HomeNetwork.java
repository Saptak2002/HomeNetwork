import java.util.HashMap;

public class HomeNetwork {
     HashMap<String, String> roomIPMap = new HashMap<>();

    public void addIPAddress(String roomName, String ipAddress) {
        roomIPMap.put(roomName, ipAddress);
    }

    public String getIPAddress(String roomName) {
        return roomIPMap.get(roomName);
    }

    public void removeIPAddress(String roomName) {
        roomIPMap.remove(roomName);
    }

    public static void main(String[] args) {
        HomeNetwork homeNetwork = new HomeNetwork();

        // Adding IP addresses for rooms
        homeNetwork.addIPAddress("Living Room", "192.168.1.10");
        homeNetwork.addIPAddress("Bedroom", "192.168.1.11");
        homeNetwork.addIPAddress("Kitchen", "192.168.1.12");
        homeNetwork.addIPAddress("Bathroom", "192.168.1.13");

        // Retrieving IP addresses
        System.out.println("IP address of Living Room: " + homeNetwork.getIPAddress("Living Room"));
        System.out.println("IP address of Kitchen: " + homeNetwork.getIPAddress("Kitchen"));
        System.out.println("IP address of Bathroom: " + homeNetwork.getIPAddress("Bathroom"));
        // Removing an IP address
        homeNetwork.removeIPAddress("Bedroom");

        // Retrieving IP address after removal
        System.out.println("IP address of Bedroom: " + homeNetwork.getIPAddress("Bedroom"));
    }
}
