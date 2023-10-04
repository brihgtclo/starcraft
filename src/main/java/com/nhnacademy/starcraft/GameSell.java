package com.nhnacademy.starcraft;

import com.nhnacademy.starcraft.game.Game;
import com.nhnacademy.starcraft.player.*;
import com.nhnacademy.starcraft.race.*;
import java.util.Scanner;

public class GameSell {
    public static void main(String[] args) {
        User bh = inputRace();
        Com com = Com.creatCom();
        Game game = new Game(bh, com);
        game.gameStart();
    }

    private static User inputRace() {
        System.out.print("종족을 선택해 주세요(1|T 2|P 3|Z) : ");
        Scanner scanner = new Scanner(System.in);
        int race = scanner.nextInt();
        if(race == 1) return new User(new Terran());
        if(race == 2) return new User(new Protoss());
        if(race == 3) return new User(new Zerg());
        throw new IllegalArgumentException("잘못된 입력값 입니다");
    }
}
