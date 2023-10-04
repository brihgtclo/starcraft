package com.nhnacademy.starcraft.game;

import com.nhnacademy.starcraft.player.Com;
import com.nhnacademy.starcraft.player.User;
import com.nhnacademy.starcraft.unit.Unit;
import java.util.Scanner;

public class Game {
    private User player1;
    private Com player2;
    private int winner;
    Scanner sc = new Scanner(System.in);

    public Game(User player1, Com player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void gameStart() {
        while (winner == 0) {
            print();
            player1.strike(input("공격할 유닛 선택 : "), input("수비할 유닛 선택 : "), player2.getUnitList());
            if(winnerCheck()) break;
            player2.randomAttack(player1.getUnitList());
            if(winnerCheck()) break;
        }
        if (winner == 1) System.out.print("승리");
        if (winner == 2) System.out.print("패배");
    }

    private boolean winnerCheck() {
        if (player1.getUnitList().isEmpty()){
            this.winner = 2;
            return true;
        }
        if (player2.getUnitList().isEmpty()){
            this.winner = 1;
            return true;
        }
        return false;
    }

    private void print() {
        int index = 0;
        System.out.println("아군 : " + player1.getRace().getRaceName());
        for (Unit unit : player1.getUnitList()) {
            System.out.println(index++ + ". " + unit.toString());
        }
        index = 0;
        System.out.println("적군 : " + player2.getRace().getRaceName());
        for (Unit unit : player2.getUnitList()) {
            System.out.println(index++ + ". " + unit.toString());
        }
    }

    private int input(String s) {
        System.out.print(s);
        return sc.nextInt();
    }
}
