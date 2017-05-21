import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by anthonyjones on 5/20/17.
 */
public class DriversLicense {

    private static String firstName, lastName, address, state, sex, eyes, organDonor, drivingclass, licenseNumber, dob, issuedDate, height;

    DriversLicense() {
    }

    DriversLicense(String firstName, String lastName, String address, String state, String sex, String eyes, String organDonor, String drivingclass, String licenseNumber, String dob, String issuedDate, String height) {

        this.firstName = firstName;
    }

    public static List<Object> deserializeFromCSV(String elements) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]\\w+");
        Matcher matcher = pattern.matcher(elements);


//        firstName = elements.split("^[A-Z][a-z]\\w+");

        String[] separatedByCommas = elements.split(",");

        ArrayList<DriversLicense> newDriversLicense = new ArrayList<>();
        for (int i = 0; i <= 7; i++) {


            lastName = separatedByCommas[0];
            firstName = separatedByCommas[1];
            address = separatedByCommas[2];
            state = separatedByCommas[3];
            sex = separatedByCommas[4];
            eyes = separatedByCommas[5];
            organDonor = separatedByCommas[6];
            drivingclass = separatedByCommas[7];
            licenseNumber = separatedByCommas[8];
            dob = separatedByCommas[9];
            issuedDate = separatedByCommas[10];
            height = separatedByCommas[11];

            newDriversLicense.add(new DriversLicense(firstName, lastName, address, state, sex, eyes, organDonor, drivingclass, licenseNumber, dob, issuedDate, height));
        }

        while (matcher.find()) {
            System.out.print(matcher.group());
        }

        return null;
    }


    public static List<Object> getCSVHeader(String elements) {

        return null;
    }

    public String serializeToCSV(List<Object> list) {


        return "";
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getSex() {
        return sex;
    }

    public String getEyes() {
        return eyes;
    }

    public String getOrganDonor() {
        return organDonor;
    }

    public String getDrivingclass() {
        return drivingclass;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getDob() {
        return dob;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public String getHeight() {
        return height;
    }


}


