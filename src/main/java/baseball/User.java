package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class User {

    /** userInput : 사용자가 숫자를 입력
     *  사용자가 1~9까지의 숫자를 입력
     */
    public List<Integer> userInput() {

        List<Integer> userAnswers = new ArrayList<>();

        String input = Console.readLine();

        validateInputLength(input);

        for (int i = 0; i < input.length(); i++) {

            int number = Character.getNumericValue(input.charAt(i));

            userAnswers.add(number);

        }

        return userAnswers;
    }

    // 사용자가 입력한 숫자가 3자리인지 확인
    private void validateInputLength(String input) {

        if (input.length() != 3) {

            throw new IllegalArgumentException("입력 값이 3자리가 아닙니다.");

        }

    }
}
