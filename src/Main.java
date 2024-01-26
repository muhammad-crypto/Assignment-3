// SmartDevice Interface
interface SmartDevice {
    void turnOn();

    void turnOff();

    void connectToInternet();

    void connectToDevice(SmartDevice anotherDevice);
}

// Abstract Class Gadget
abstract class Gadget implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Device is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Device is connected to the internet.");
    }

    abstract void receiveNotification(String message);

    abstract void batteryStatus();
}

// SmartPhone Class
class SmartPhone extends Gadget {
    @Override
    void receiveNotification(String message) {
        System.out.println("SmartPhone Notification: " + message);
    }

    @Override
    void batteryStatus() {
        System.out.println("SmartPhone Battery: 90%");
    }

    void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    @Override
    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartPhone is connected to another device.");
    }
}

// SmartWatch Class
class SmartWatch extends Gadget {
    @Override
    void receiveNotification(String message) {
        System.out.println("SmartWatch Notification: " + message);
    }

    @Override
    void batteryStatus() {
        System.out.println("SmartWatch Battery: 73%");
    }

    void trackHeartRate() {
        System.out.println("Tracking heart rate.");
    }

    void showTime() {
        System.out.println("Displaying current time.");
    }

    @Override
    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartWatch is connected to another device.");
    }
}

// SmartTV Class
class SmartTV extends Gadget {
    @Override
    void receiveNotification(String message) {
        System.out.println("SmartTV Notification: " + message);
    }

    @Override
    void batteryStatus() {
        System.out.println("SmartTV does not have a battery.");
    }

    void streamVideo(String url) {
        System.out.println("Streaming video from " + url);
    }

    void changeChannel(int channel) {
        System.out.println("Changing channel to " + channel);
    }

    @Override
    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartTV is connected to another device.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.turnOn();
        smartphone.connectToInternet();
        smartphone.makeCall("+77761081376");
        smartphone.sendSMS("Whats up!");

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.turnOn();
        smartWatch.connectToInternet();
        smartWatch.trackHeartRate();
        smartWatch.showTime();

        SmartTV smartTV = new SmartTV();
        smartTV.turnOn();
        smartTV.connectToInternet();
        smartTV.streamVideo("https://www.youtube.com/watch?v=tp29U3dZdj0");
        smartTV.changeChannel(5);

        // Inter-Device Communication
        smartphone.connectToDevice(smartTV);
        smartWatch.connectToDevice(smartphone);
    }
}
