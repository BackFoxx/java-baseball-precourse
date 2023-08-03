package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class QuestionVO {
	private final int[] question;

	private static final int startInclusive = 1;
	private static final int endInclusive = 9;

	public QuestionVO() {
		question = new int[3];
		question[0] = Randoms.pickNumberInRange(startInclusive, endInclusive);
		question[1] = Randoms.pickNumberInRange(startInclusive, endInclusive);
		question[2] = Randoms.pickNumberInRange(startInclusive, endInclusive);
	}

	//문제와 답변의 일치 정도에 따른 힌트 출력
	public int[] compareTo(AnswerVO answerVO) {
		int[] answerArray = answerVO.answerToAnswerArray();
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < question.length; i++) {
			int j = (i + 1) % answerArray.length;
			int k = (i + 2) % answerArray.length;

			if (question[i] == answerArray[i]) {
				strike++;
			} else if (question[i] == answerArray[j] || question[i] == answerArray[k]) {
				ball++;
			}
		}

		return new int[] {strike, ball};
	}

}
