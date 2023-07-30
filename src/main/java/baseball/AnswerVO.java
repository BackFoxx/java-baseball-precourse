package baseball;

import camp.nextstep.edu.missionutils.Console;

public class AnswerVO {
	String answer;

	public AnswerVO() {
		this.answer = Console.readLine();
		wrongDigitException();
		containsZeroException();
	}

	public String getAnswer() {
		return answer;
	}

	//3자리가 아닌 수를 입력하면 예외 발생
	private void wrongDigitException() {
		if (answer.length() !=3) {
			throw new IllegalArgumentException("3자리 수를 입력해주세요.");
		}
	}

	//답변에 0이 포함되면 예외 발생
	private void containsZeroException() {
		if (answer.contains("0")) {
			throw new IllegalArgumentException("답변은 0을 포함할 수 없습니다.");
		}
	}
}
