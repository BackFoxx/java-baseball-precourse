package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class QuestionVO {
	int[] question;

	private static final int startInclusive = 1;
	private static final int endInclusive = 10;

	public QuestionVO() {
		question = new int[3];
		question[0] = Randoms.pickNumberInRange(startInclusive, endInclusive);
		question[1] = Randoms.pickNumberInRange(startInclusive, endInclusive);
		question[2] = Randoms.pickNumberInRange(startInclusive, endInclusive);
	}

	public int[] getQuestionVO() {
		return question;
	}
}
