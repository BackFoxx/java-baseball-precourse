package baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AnswerVO {
	private final ArrayList<Integer> answerArray;

	public AnswerVO(String answer) {
		this.answerArray = Arrays.stream(answer.split(""))
			.mapToInt(Integer::parseInt)
			.boxed().collect(Collectors.toCollection(ArrayList::new));
		wrongDigitException();
		containsZeroException();
	}

	//answer 크기 반환
	public int getAnswerDigits() {
		return answerArray.size();
	}

	//answer 인덱스에 따른 값 반환
	public int getAnswerDigitAt(int index) {
		if (index < 0 || index >= answerArray.size()) {
			throw new IndexOutOfBoundsException("유효하지 않은 인덱스입니다.");
		}
		return answerArray.get(index);
	}

	//3자리가 아닌 수를 입력하면 예외 발생
	private void wrongDigitException() {
		if (answerArray.size() !=3) {
			throw new IllegalArgumentException("3자리 수를 입력해주세요.");
		}
	}

	//답변에 0이 포함되면 예외 발생
	private void containsZeroException() {
		if (answerArray.contains(0)) {
			throw new IllegalArgumentException("답변은 0을 포함할 수 없습니다.");
		}
	}
}
