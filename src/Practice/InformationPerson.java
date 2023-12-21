package Practice;
public class InformationPerson {
    static String[] info = {"idNumber: 160363311","dob: 01/01/1995","gender: M","lastNameEn: MEN","firstNameEn: CHENDA","expiredDate: 21/06/2024"};

    void display(){
        for (String newInfo : info){
            //split convert String to subString like array  //[0]index that cut [1] index that want to output
            System.out.println(newInfo.split(":")[1].trim()); //regex ":" the point that u want split=cut
            //trim() cut space
            //   System.out.println(newInfo.split(":")[0]);
                                //String idNo = " id : 001 "
            // use split it covert to substring  0   :  1  index
            //System.out.println(idNo.split(":")[1]); //show 001
        }
    }
    static String[] infoPerson = {};

    public static void main(String[] args) {
        InformationPerson informationPerson = new InformationPerson();
        //display
        informationPerson.display();
    }
}
