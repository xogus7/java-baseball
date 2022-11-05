package baseball.view;

public class OutputView {
    private static final String STRIKE_MESSAGE = "%d스트라이크";
    private static final String BALL_MESSAGE = "%d볼";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String SUCCESS_MESSAGE = "3개의 숫자를모두 맞히셨습니다! 게임 종료";

    public static void printStrikeCount(int strike) {
        System.out.printf(STRIKE_MESSAGE + "\n", strike);
    }

    public static void printBallCount(int ball) {
        System.out.printf(BALL_MESSAGE + "\n", ball);
    }

    public static void printStrikeAndBallCount(int strike, int ball) {
        System.out.printf(BALL_MESSAGE + " " + STRIKE_MESSAGE + "\n", ball, strike);
    }

    public static void printNothing() {
        System.out.printf(NOTHING_MESSAGE + "\n");
    }

    public static void printSuccess() {
        System.out.printf(SUCCESS_MESSAGE + "\n");
    }
}
