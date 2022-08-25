package JavaString;

import java.util.Arrays;

public class BuilderString {
    public static void main(String[] args) {

    String fullName = "Hari Khadka";
    String invitation = "https://www.wedding.ceromony.com/";
    String combinedString = "Hello! " + fullName + "," + " You are cordially invited to join the wedding ceremony of Ram and Sita." + " Please click the link " + invitation + " if you would like to join this party.";

    System.out.println(combinedString);

    //This is to split the sentence.
    String[] splitSent = combinedString.split(" ");
    System.out.println(Arrays.toString(splitSent));
    System.out.println(splitSent[10]);


    //We can also do this another way to reduce the memory space. in this way no any objects will
        //be created between builder and builderCombinedString.
        StringBuilder builder = new StringBuilder();
        builder.append("Hello! ");
        builder.append(fullName);
        builder.append(",");
        builder.append(" You are cordially invited to join the wedding ceremony of Ram and Sita.");
        builder.append(" Please click the link ");
        builder.append(invitation);
        builder.append(" if you would like to join this party.");

        String builderCombinedString = builder.toString();
        System.out.println(builderCombinedString);



    }
}
