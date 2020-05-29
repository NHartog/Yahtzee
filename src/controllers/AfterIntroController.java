package controllers;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.Timer;


public class AfterIntroController {

    // @FXML instance variables
    @FXML public GridPane DiceGrid;
    @FXML public GridPane PlayerDice;

    @FXML public Text Ones;
    @FXML public Text Twos;
    @FXML public Text Threes;
    @FXML public Text Fours;
    @FXML public Text Fives;
    @FXML public Text Sixes;
    @FXML public Text toak;
    @FXML public Text foak;
    @FXML public Text fh;
    @FXML public Text ss;
    @FXML public Text ls;
    @FXML public Text Chance;
    @FXML public Text Oneb;
    @FXML public Text Twob;
    @FXML public Text Threeb;
    @FXML public Text Fourb;
    @FXML public Text Fiveb;
    @FXML public Text Sixb;
    @FXML public Text toakb;
    @FXML public Text foakb;
    @FXML public Text fhb;
    @FXML public Text ssb;
    @FXML public Text lsb;
    @FXML public Text cb;


    @FXML public Button RollButt;
    @FXML public Button one;
    @FXML public Button two;
    @FXML public Button three;
    @FXML public Button four;
    @FXML public Button five;
    @FXML public Button ply1;
    @FXML public Button ply2;
    @FXML public Button ply3;
    @FXML public Button ply4;
    @FXML public Button ply5;
    @FXML public Button ply6;
    @FXML public Button ply3oak;
    @FXML public Button plyfoak;
    @FXML public Button plyfh;
    @FXML public Button plyss;
    @FXML public Button plyls;
    @FXML public Button plyc;

    //instance variables
    private int _num1s;
    private int _num2s;
    private int _num3s;
    private int _num4s;
    private int _num5s;
    private int _num6s;
    private int _diceToRoll = 5;
    private int _clicks = 0;
    private int _totalScore = 0;

    Font red = new Font("Times new Roman",10.0);


    ArrayList<Integer> num = new ArrayList<Integer>();
    ArrayList<Integer> play = new ArrayList<Integer>();
    ArrayList<ImageView> img = new ArrayList<ImageView>();
    ArrayList<ImageView> obj = new ArrayList<ImageView>();
    ImageView view = new ImageView();

    int dices = 0;
    int rolls = 0;

    //"Constructor" initializes this pages

    public void initialize(){

        img.add(new ImageView(new Image("/pictures/Dice 1.png")));
        img.add(new ImageView(new Image("/pictures/Dice 2.png")));
        img.add(new ImageView(new Image("/pictures/Dice 3.png")));
        img.add(new ImageView(new Image("/pictures/Dice 4.png")));
        img.add(new ImageView(new Image("/pictures/Dice 5.png")));
        img.add(new ImageView(new Image("/pictures/Dice 6.png")));

    }



    //rolls the dice when you click the roll button and chooses what dice to show
    public void Roll(MouseEvent mouseEvent) {
       DiceGrid.getChildren().clear();
       num.clear();
        obj.clear();
        for(int i = 0; i<_diceToRoll;i++){
            int rand = (int)((Math.random()*6));
            System.out.println(rand);
            if(rand == 0){
               view =  new ImageView(new Image("/pictures/Dice 1.png"));
                DiceGrid.add(view,i,0);
                obj.add(view);
                num.add(1);
            }
           if(rand == 1){
                view =  new ImageView(new Image("/pictures/Dice 2.png"));
                DiceGrid.add(view,i,0);
                obj.add(view);
                num.add(2);
            }
            if(rand == 2){
                view =  new ImageView(new Image("/pictures/Dice 3.png"));
                DiceGrid.add(view,i,0);
                obj.add(view);
                num.add(3);
            }
            if(rand == 3){
                view =  new ImageView(new Image("/pictures/Dice 4.png"));
                DiceGrid.add(view,i,0);
                obj.add(view);
                num.add(4);
            }
            if(rand == 4){
                view =  new ImageView(new Image("/pictures/Dice 5.png"));
                DiceGrid.add(view,i,0);
                obj.add(view);
                num.add(5);
            }
            if(rand == 5){
                view =  new ImageView(new Image("/pictures/Dice 6.png"));
                DiceGrid.add(view,i,0);
                obj.add(view);
                num.add(6);
            }
        }
        rolls++;
        check();
    }


    //chooses your first dice
    public void take1(MouseEvent Event) {
        System.out.println("take1");
        PlayerDice.add(obj.get(0),dices,0);
        play.add(num.get(0));
        DiceGrid.getChildren().remove(obj.get(0));
        _diceToRoll--;
        dices++;
        System.out.println(play);
        check();
    }
    //chooses your 2nd dice
    public void take2(MouseEvent mouseEvent) {
        System.out.println("take2");
        PlayerDice.add(obj.get(1),dices,0);
        play.add(num.get(1));
        DiceGrid.getChildren().remove(obj.get(1));
        _diceToRoll--;
        dices++;
        System.out.println(play);
        check();
    }
    //chooses your 5th dice
    public void take5(MouseEvent mouseEvent) {
        System.out.println("take5");
        PlayerDice.add(obj.get(4),dices,0);
        play.add(num.get(4));
        DiceGrid.getChildren().remove(obj.get(4));
        _diceToRoll--;
        dices++;
        System.out.println(play);
        check();
    }
    //chooses your 4th dice
    public void take4(MouseEvent mouseEvent) {
        System.out.println("take4");
        PlayerDice.add(obj.get(3),dices,0);
        play.add(num.get(3));
        DiceGrid.getChildren().remove(obj.get(3));
        _diceToRoll--;
        dices++;
        System.out.println(play);
        check();
    }
    //chooses your 3rd dice
    public void take3(MouseEvent mouseEvent) {
        System.out.println("take3");
        PlayerDice.add(obj.get(2),dices,0);
        play.add(num.get(2));
        DiceGrid.getChildren().remove(obj.get(2));
        _diceToRoll--;
        dices++;
        System.out.println(play);
        check();
    }

    //checks if you have rolled your dices
    public void check(){
        if(rolls == 3 || play.size() == 5){
            RollButt.setDisable(true);
        }
        if(play.size() == 5){
            one.setDisable(true);
            two.setDisable(true);
            three.setDisable(true);
            four.setDisable(true);
            five.setDisable(true);
        }
        /*checkOnes();
        checkTwos();
        checkThree();
        checkFours();
        checkFives();
        checkSixes();
        checktoak();
        checkfoak();
        checkSmallStraight();
        checkFullHouse();
        checkLargeStraight();*/
    }
    //checks for ones and returns the sum of ones
    public int checkOnes(){
        int oneSum = 0;
        for (int i = 0; i< play.size(); i++){
            if(play.get(i) == 1){
                oneSum += 1;
            }
        }

        return oneSum;
    }

    //checks for twos and returns sum of twos
    public int checkTwos(){
        int twoSum = 0;
        for (int i = 0; i< play.size(); i++){
            if(play.get(i) == 2){
                twoSum += 2;
            }
        }

        return twoSum;
    }

    //checks for threes and returns the sum of threes
    public int checkThree(){
        int threeSum = 0;
        for (int i = 0; i< play.size(); i++){
            if(play.get(i) == 3){
                threeSum += 3;
            }
        }

        return threeSum;
    }

    //checks for fours and returns the sum of fours
    public int checkFours(){
        int fourSum = 0;
        for (int i = 0; i< play.size(); i++){
            if(play.get(i) == 4){
                fourSum += 4;
            }
        }

        return fourSum;
    }

    //checks for fives and returns the sum of fives
    public int checkFives(){
        int fiveSum = 0;
        for (int i = 0; i< play.size(); i++){
            if(play.get(i) == 5){
                fiveSum += 5;
            }
        }

        return fiveSum;
    }

    //checks for sixes and returns the sum of sixes
    public int checkSixes(){
        int sixSum = 0;
        for (int i = 0; i< play.size(); i++){
            if(play.get(i) == 6){
                sixSum += 6;
            }
        }


        return sixSum;
    }

    //checks for 3 of a kind and returns its value
    public int checktoak() {
        int Sum = 0;

        boolean ThreeOfAKind = false;

        for( int i = 1; i <= 6; i++ ) {
            int Count = 0;
            for( int j = 0; j < play.size(); j++ ) {
                if( play.get(j)== i )
                    Count++;

                if( Count > 2 )
                    ThreeOfAKind = true;
            }
        }

        if( ThreeOfAKind ) {
            for( int k = 0; k < play.size(); k++ ) {
                Sum += play.get(k);
            }
        }



        return Sum;
    }

    //checks 4 of a kind and returns its value
    public int checkfoak()
    {
        int Sum = 0;

        boolean FourOfAKind = false;

        for( int i = 1; i <= 6; i++ ) {
            int Count = 0;
            for( int j = 0; j < play.size(); j++ ) {
                if( play.get(j)== i )
                    Count++;

                if( Count > 3 )
                    FourOfAKind = true;
            }
        }

        if( FourOfAKind ) {
            for( int k = 0; k < play.size(); k++ ) {
                Sum += play.get(k);
            }
        }

        return Sum;
    }



    //checks for fullhouse and returns its value
    public int checkFullHouse(){
        int[] counts = new int[6];
        for (int i=0; i<play.size(); i++){
            //increase the relevant counter
            counts[play.get(i)-1]++;
         }
        //now check we've got a 2 and a 3
        boolean check2 = false;
        boolean check3 = false;
        for (int i: counts) {
            check2 |= (i==2); //found 2 of some number
            check3 |= (i==3); //found 3 of some number
        }

        if(check2 && check3){

            return 25;
        }
        else{
            return 0;
        }
    }

    //checks small straight and returns its value
    public int checkSmallStraight(){
        int counter = 0;
        int score = 0;
        boolean found = false;
        Collections.sort(play);

        for (int i = 0; i < play.size() - 1; i++)
        {

            if (play.get(i+1) == play.get(i)+ 1)
            {
                counter++;
            }
            else if ((play.get(i+1) == play.get(i)))
            {
                continue;
            }
            else
            {
                counter = 0;
            }
            if (counter == 3) {
                found = true;
                break;
            }
        }

        if (found)
        {

            score = 30;
        }
        else
        {
            score = 0;
        }
        return score;
    }

    //checks for large staright and returns its value
    public int checkLargeStraight(){
       Collections.sort(play);
        if(play.size() != 5){
            return 0;
        }
       if (play != null &&
                play.get(0)== 1 &&
                play.get(1)== 2 &&
                play.get(2) == 3 &&
                play.get(3)== 4 &&
                play.get(4) == 5) {


            return 40;
        }
        else if(play != null &&
                play.get(0)== 2 &&
                play.get(1)== 3 &&
                play.get(2) == 4 &&
                play.get(3)== 5 &&
                play.get(4) == 6) {
            return 40;
        }
        else{
            return 0;
        }
    }

    //gets the total selected for score
    public int checkC(){
       int sum = 0;
        for(int i = 0; i< play.size(); i++){
            sum += play.get(i);
        }
        return sum;
    }

    //adds score based on which move you made (selected ones, twos, full house ,etc)
    public void addOnes(MouseEvent mouseEvent) {
       _totalScore += checkOnes();
        Oneb.setFill(Color.BLACK);
       Oneb.setText(""+ checkOnes());
        ply1.setVisible(false);
        _clicks++;
        next();
    }
    public void addTwos(MouseEvent mouseEvent) {
        _totalScore += checkTwos();
        Twob.setFill(Color.BLACK);
        Twob.setText(""+ checkTwos());
        ply2.setVisible(false);
        _clicks++;
        next();
    }

    public void addThrees(MouseEvent mouseEvent) {
        _totalScore += checkThree();
        Threeb.setFill(Color.BLACK);
        Threeb.setText(""+ checkThree());
        ply3.setVisible(false);
        _clicks++;
        next();
    }

    public void addFours(MouseEvent mouseEvent) {
        _totalScore += checkFours();
        Fourb.setFill(Color.BLACK);
        Fourb.setText(""+ checkFours());
        ply4.setVisible(false);
        _clicks++;
        next();
    }

    public void addFives(MouseEvent mouseEvent) {
        _totalScore += checkFives();
        Fiveb.setFill(Color.BLACK);
        Fiveb.setText(""+ checkFives());
        ply5.setVisible(false);
        _clicks++;
        next();
    }

    public void addSixes(MouseEvent mouseEvent) {
        _totalScore += checkSixes();
        Sixb.setFill(Color.BLACK);
        Sixb.setText(""+ checkSixes());
        ply6.setVisible(false);
        _clicks++;
        next();
    }

    public void toak(){
        _totalScore += checktoak();
        toakb.setFill(Color.BLACK);
        toakb.setText(""+ checktoak());
        ply3oak.setVisible(false);
        _clicks++;
        next();
    }

    public void foak(){
        _totalScore += checkfoak();
        foakb.setFill(Color.BLACK);
        foakb.setText(""+ checkfoak());
        plyfoak.setVisible(false);
        _clicks++;
        next();
    }

    public void FullHouse(MouseEvent mouseEvent) {
        _totalScore +=  checkFullHouse();
        fhb.setFill(Color.BLACK);
        fhb.setText(""+ checkFullHouse());
        plyfh.setVisible(false);
        _clicks++;
        next();
    }

    public void smallStraight(){
        _totalScore += checkSmallStraight();
        fhb.setFill(Color.BLACK);
        ssb.setText(""+ checkSmallStraight());
        plyss.setVisible(false);
        _clicks++;
        next();
    }

    public void largeStraight(){
        _totalScore += checkLargeStraight();
        lsb.setFill(Color.BLACK);
        lsb.setText(""+ checkLargeStraight());
        plyls.setVisible(false);
        _clicks++;
        next();
    }

    public void chance(){
        _totalScore += checkC();
        cb.setFill(Color.BLACK);
        cb.setText(""+ checkC());
        plyc.setVisible(false);
        _clicks++;
        next();
    }


    //checks if you finsished the game
    public void next(){
        play.clear();
        DiceGrid.getChildren().clear();
        PlayerDice.getChildren().clear();





        dices = 0;
        rolls = 0;
        _diceToRoll = 5;
        RollButt.setDisable(false);
        one.setDisable(false);
        two.setDisable(false);
        three.setDisable(false);
        four.setDisable(false);
        five.setDisable(false);

        if(_clicks == 12){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("You finished the game!");
            alert.setContentText("Good job, you completed Yatzhee with a score of " + _totalScore);
            ButtonType buttonTypeOne = new ButtonType("Play again");
            ButtonType buttonTypeCancel = new ButtonType("Exit", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(buttonTypeOne, buttonTypeCancel);

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == buttonTypeOne){
                // ... user chose "One"
                System.out.println("kept playing");
                restart();
            } else {
                System.out.println("closed");
                System.exit(0);
                // ... user chose CANCEL or closed the dialog
            }
        }
    }



    int d1 = 0;
    int d2 = 0;
    int d3 = 0;
    int d4 = 0;
    int d5 = 0;
    int d6 = 0;

    private void evaluate(int die) {
        if (die == 1) d1++;
        if (die == 2) d2++;
        if (die == 3) d3++;
        if (die == 4) d4++;
        if (die == 5) d5++;
        if (die == 6) d6++;
    }

    public void restart(){
        play.clear();
        DiceGrid.getChildren().clear();
        PlayerDice.getChildren().clear();

        dices = 0;
        rolls = 0;
        _diceToRoll = 5;
        _clicks = 0;
        _totalScore = 0;

        ply1.setVisible(true);
        ply2.setVisible(true);
        ply3.setVisible(true);
        ply4.setVisible(true);
        ply5.setVisible(true);
        ply6.setVisible(true);
        ply3oak.setVisible(true);
        plyfoak.setVisible(true);
        plyss.setVisible(true);
        plyls.setVisible(true);
        plyfh.setVisible(true);
        plyc.setVisible(true);
        RollButt.setVisible(true);

        Oneb.setText("");
        Twob.setText("");
        Threeb.setText("");
        Fourb.setText("");
        Fiveb.setText("");
        Sixb.setText("");
        toakb.setText("");
        foakb.setText("");
        lsb.setText("");
        ssb.setText("");
        fhb.setText("");
        cb.setText("");
    }
}
