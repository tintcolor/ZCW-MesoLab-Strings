import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by anthonyjones on 5/20/17.
 */
public class DriversLicense {

    private  String firstName, lastName, address, state, sex, eyes, organDonor, drivingclass, licenseNumber, dob, issuedDate, height, expirationDate;

    DriversLicense() {
    }

    public DriversLicense(String firstName, String lastName, String address, String state, String sex, String eyes, String organDonor, String drivingclass, String licenseNumber, String dob, String issuedDate, String height, String expirationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.sex = sex;
        this.eyes = eyes;
        this.organDonor = organDonor;
        this.drivingclass = drivingclass;
        this.licenseNumber = licenseNumber;
        this.dob = dob;
        this.issuedDate = issuedDate;
        this.height = height;
        this.expirationDate = expirationDate;
    }



    public static List<DriversLicense> deserializeFromCSV(String elements) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]\\w+");
        Matcher matcher = pattern.matcher(elements);
        ArrayList<DriversLicense> newDriversLicense = new ArrayList<>();


        while (matcher.find()) {
            System.out.print(matcher.group());
        }

        String[] separatedByLine = elements.split("\n");
        for (int i = 0; i < separatedByLine.length; i++) {
            String[] separatedByCommas = separatedByLine[i].split(",");
                newDriversLicense.add(new DriversLicense(separatedByCommas[0], separatedByCommas[1], separatedByCommas[2], separatedByCommas[3],separatedByCommas[4], separatedByCommas[5], separatedByCommas[6], separatedByCommas[7],separatedByCommas[8], separatedByCommas[9], separatedByCommas[10], separatedByCommas[11], separatedByCommas[12]));
        }
        return newDriversLicense;
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


/*
firstName=separatedByCommas[j];
        address=separatedByCommas[j];
        state=separatedByCommas[j];
        sex=separatedByCommas[j];
        eyes=separatedByCommas[j];
        organDonor=separatedByCommas[j];
        drivingclass=separatedByCommas[j];
        licenseNumber=separatedByCommas[j];
        dob=separatedByCommas[j];
        issuedDate=separatedByCommas[j];
        height=separatedByCommas[j];

*/
