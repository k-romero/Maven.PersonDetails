package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter <= personArray.length -1){
            Person currentPerson = personArray[counter];
            result += currentPerson.toString();
            counter ++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";

        for (int counter = 0; counter <= personArray.length - 1; counter++){
            Person currentPerson = personArray[counter];
            result += currentPerson.toString();
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for(Person currentPerson : personArray){
            result += currentPerson.toString();
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
