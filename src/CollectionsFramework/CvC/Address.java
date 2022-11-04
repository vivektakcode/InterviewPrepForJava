package CollectionsFramework.CvC;

public class Address implements Comparable<Address>{
    String streetName;
    int streetNum;

    int pincode;

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNum=" + streetNum +
                ", pincode=" + pincode +
                '}';
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address(String streetName, int streetNum, int pincode) {
        this.streetName = streetName;
        this.streetNum = streetNum;
        this.pincode = pincode;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public int compareTo(Address o) {
        return  this.pincode - o.pincode;

    }
}
