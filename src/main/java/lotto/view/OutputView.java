package lotto.view;

import lotto.util.Message;

public class OutputView {
    public static OutputView getInstance() {

        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final OutputView INSTANCE = new OutputView();
    }

    public void printMessage(Message message) {
        println(message.getMessage());
    }

    private void println(String output) {
        System.out.println(output);
    }
}
