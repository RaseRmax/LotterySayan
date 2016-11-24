/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2lotto;



/**
 *
 * @author Camelia Farcas, Conor Clarke, Sana Diwan, Daniel Pasinski.
 */
public class Lotto2 {

    private int userGuess[];
    private String name;
    private int lottoNum[];
    private int plus1[];
    private int plus2[];
    private int winNum;
    private int winNum1;
    private int winNum2;



    public Lotto2() {
        lottoNum = new int[5];
        for (int i = 0; i < 5; i++) {
            lottoNum[i] = (int) (Math.random() * 48) + 1;
        }

        plus1 = new int[5];
        for (int i = 0; i < 5; i++) {
            plus1[i] = (int) (Math.random() * 50) + 1;
        }
        plus2 = new int[5];
        for (int i = 0; i < 5; i++) {
            plus2[i] = (int) (Math.random() * 50) + 1;
        }
        userGuess = new int[5];
        name = new String();
    }

    // compute
    public void compute() {


        for (int i = 0; i < 5; i++) {
            if (lottoNum[i] == userGuess[0] || lottoNum[i] == userGuess[1] || lottoNum[i] == userGuess[2] || lottoNum[i] == userGuess[3] || lottoNum[i] == userGuess[4]) {
                winNum++;
            }
        }

        for (int j = 0; j < 5; j++) {
            if (plus1[j] == userGuess[0] || plus1[j] == userGuess[1] || plus1[j] == userGuess[2] || plus1[j] == userGuess[3] || plus1[j] == userGuess[4]) {
                winNum1++;
            }
        }

        for (int k = 0; k < 5; k++) {
            if (plus2[k] == userGuess[0] || plus2[k] == userGuess[1] || plus2[k] == userGuess[2] || plus2[k] == userGuess[3] || plus2[k] == userGuess[4]) {
                winNum2++;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int[] userGuess) {
        this.userGuess = userGuess;
    }

    public int[] getLottoNum() {
        return lottoNum;
    }

    public void setLottoNum(int[] lottoNum) {
        this.lottoNum = lottoNum;
    }

    public int[] getPlus1() {
        return plus1;
    }

    public void setPlus1(int[] plus1) {
        this.plus1 = plus1;
    }

    public int[] getPlus2() {
        return plus2;
    }

    public void setPlus2(int[] plus2) {
        this.plus2 = plus2;
    }

    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    public int getWinNum1() {
        return winNum1;
    }

    public void setWinNum1(int winNum1) {
        this.winNum1 = winNum1;
    }

    public int getWinNum2() {
        return winNum2;
    }

    public void setWinNum2(int winNum2) {
        this.winNum2 = winNum2;
    }

}
