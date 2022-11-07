package baseball.game;

import baseball.Input.Input;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Integer> computers;
    private Boolean correct;
    private final Input user;

    public Game(Input user) {
        this.user = user;
        this.computers = new ArrayList<>();
        this.correct = false;
    }

    public List<Integer> getComputers(){
        return computers;
    }

    public List<Integer> getUserNumbers(){
        return user.getNumbers();
    }

    public void answerIsCorrect(){
        this.correct = true;
    }

    private void pickNumbers(){
        computers = new ArrayList<>();

        while (computers.size() < 3){
            int num = Randoms.pickNumberInRange(1, 9);
            if (!computers.contains(num)){
                computers.add(num);
            }
        }
    }
}
