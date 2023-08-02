package baseball;

public class AnswerVO {
	private final String[] answerStrings;

	public AnswerVO(String answer) {
		this.answerStrings = answer.split("");
		wrongDigitException();
		containsZeroException();
	}

	//문자배열 answerStrings을 숫자배열 answerArray로 변환
	public int[] answerToAnswerArray() {
		int[] answerArray = new int[answerStrings.length];
		for (int i = 0; i < answerStrings.length; i++) {
			answerArray[i] = Integer.parseInt(answerStrings[i]);
		}
		return answerArray;
	}

	//3자리가 아닌 수를 입력하면 예외 발생
	private void wrongDigitException() {
		if (answerStrings.length !=3) {
			throw new IllegalArgumentException("3자리 수를 입력해주세요.");
		}
	}

	//답변에 0이 포함되면 예외 발생
	private void containsZeroException() {
		for (String answer : answerStrings) {
			if (answer.contains("0")) {
				throw new IllegalArgumentException("답변은 0을 포함할 수 없습니다.");
			}
		}
	}
}
