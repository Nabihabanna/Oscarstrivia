package com.example.android.oscarstrivia;


public class Questions {

    public String mQuestions [] = {

            "1. Who has won the most directing Academy Awards?",
            "2. Who has won the most Acting Academy Awards?",
            "3. What year was the first Academy Awards ceremony held?",
            "4. What Film won the first Academy Award for Best Picture?",
            "5. Who is the only woman to win three competitive Oscars in one year?",
            "6. Who was the first African American to win an Academy Award?",
            "7. Which of the following 2016 films received zero nominations?",
            "8. How many wholly animated films have ever been nominated for Best Picture?",
            "9. Which country has won Best Foreign Film the most often?",
            "10.What is the only best picture winner to also to claim a clean sweep and win in every category it was nominated?",
    };

    private String mChoices [] [] = {

            {"William Wyler","Steven Spielberg","John Ford","Frank Capra"},
            {"Meryl Streep","Ingrid Bergman","Katharine Hepburn","Jack Nicholson"},
            {"1929","1910","1925","1942"},
            {"Sunrise","Wings","The Broadway Melody","All Quiet on the Western Front"},
            {"Meryl Streep","Edith Head","Sofia Coppola","Fran Walsh"},
            {"Dorothy Dandridge","Sidney Poitier","Hattie McDaniel","James Baskett"},
            {"Deadpool","Sail,Caesar","Silence","Sully"},
            {"3","1","2","4"},
            {"Japan","Sweden","France","Italy"},
            {"Titanic","Ben-Hur","Lord of the Rings: Return of the King","Gone with the Wind"}
    };

    private String mCorrectChoices [] = { "WJohn Ford","Katharine Hepburn","1929","Wings","Fran Walsh","Hattie McDaniel","Deadpool","3","Italy","Lord of the Rings: Return of the King"};

    public String getQuestion (int a) {
        String question = mQuestions [a] ;
        return question;
    }

    public String getChoice1 (int a) {
        String choice = mChoices [a] [0];
        return choice;
    }

    public String getChoice2 (int a) {
        String choice = mChoices [a] [1];
        return choice;
    }

    public String getChoice3 (int a) {
        String choice = mChoices [a] [2];
        return choice;
    }

    public String getChoice4 (int a) {
        String choice = mChoices [a] [3];
        return choice;
    }

    public String getCorrectChoice (int a) {
     String answer = mCorrectChoices [a];
     return answer;
    }

}
