package baseball;

import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;

public class QuestionVO {
	private final ArrayList<Integer> question = new ArrayList<>();

	private static final int startInclusive = 1;
	private static final int endInclusive = 9;

	public QuestionVO() {
		question.add(Randoms.pickNumberInRange(startInclusive, endInclusive));
		question.add(Randoms.pickNumberInRange(startInclusive, endInclusive));
		question.add(Randoms.pickNumberInRange(startInclusive, endInclusive));
	}

	//문제와 답변의 일치 정도에 따른 힌트 출력
	public int[] compareTo(AnswerVO answerVO) {
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < question.size(); i++) {
			int j = (i + 1) % answerVO.getAnswerDigits();
			int k = (i + 2) % answerVO.getAnswerDigits();

			if (question.get(i).equals(answerVO.getAnswerDigitAt(i))) {
				strike++;
			} else if (question.get(i).equals(answerVO.getAnswerDigitAt(j)) || question.get(i).equals(answerVO.getAnswerDigitAt(k))) {
				ball++;
			}
		}

		return new int[] {strike, ball};
	}

}
