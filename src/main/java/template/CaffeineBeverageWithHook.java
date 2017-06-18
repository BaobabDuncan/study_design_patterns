package template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017-06-17.
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    boolean customerWantsCondiments() {
        return true;
    }

    private void boilWater() {
    }

    private void pourInCup() {
    }

    abstract void brew();

    abstract void addCondiments();

    private String getUserInput() {
        String answer = null;
        System.out.println("커피에 우유와 설탕ㅇ르 넣어 드릴까요? (y/n) ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO 오류");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
