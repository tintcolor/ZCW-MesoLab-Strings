import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class testDriversLicense {
    DriversLicense driversLicense;

    @Before
    public void init() {
        driversLicense = new DriversLicense();
    }

    @Test
    public void testDeserializeFromCSV() {
        //Given
        String csvFile = "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS\n" +
                "Long,Aaron,456 Street Dr,NJ,L364856498487,06/17/1993,06/17/2014,06/30/2018,M,GRN,6'2,YES,D\n" +
                "Kim,Chris,820 District Dr,DE,L364856423452,12/11/1980,08/12/2013,12/11/2018,M,BRO,\"6'5\"\"\",NO,D\n" +
                "Stamatelos,Jarryd,123 Main St ,NJ,L363345398489,3/17/1988,3/17/2016,3/20/2020,M,BRO,7'0'',YES,D\n" +
                "Cage,Nick,362 Fancy St,CA,L809239899490,02/02/1970,02/02/2000,02/02/2006,M,BRO,6'0'',YES,D\n" +
                "Reeves,Keanu,876 Zion Dr,NY,L234252352391,6/6/1955,6/9/2005,6/9/2010,M,GRN,5'11,YES,D\n" +
                "Anderson,Neo,2959 57th St,NY,L364235898492,8/6/1980,7/7/1999,7/7/2009,M,BRO,5'11,NO,D\n" +
                "Traven,Jack,25 Speed Ln,CA,L323523423193,2/20/1994,2/20/217,2/20/2027,M,BRO,5'11,YES,D\n";

        String expected = "Long,Aaron";
        //expected.add(csvFile);


        //When
        DriversLicense.deserializeFromCSV(csvFile);
        String actual = driversLicense.getFirstName();

        //Then
        Assert.assertEquals("First Name is Aaron in the new driver's class object", expected,actual);

    }

    @Test
    public void testSerializeToCSV() {// spits out a csv aka string, after it takes in an object.
        //Given
        ArrayList arrayList = new ArrayList();
//        List expected =
                DriversLicense driversLicense = new DriversLicense();

        //When
//        String actual = driversLicense.serializeToCSV(expected);
//
//        //Then
//        Assert.assertEquals("It should say ArrayList", expected, actual);
    }

}
