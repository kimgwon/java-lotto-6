package lotto.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RandomValues {
    public static List<Integer> getRandomValues() {
        return Randoms.pickUniqueNumbersInRange(Constant.MIN_LOTTO_VALUE, Constant.MAX_LOTTO_VALUE, Constant.LOTTO_NUMBER);
    }
}