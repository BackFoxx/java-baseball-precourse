package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        //게임 전체 진행
        while (true) {
            //랜덤한 수 생성
            QuestionVO questionVO = new QuestionVO();

            //문제와 답변의 일치 여부 판단
            while (true) {
                //답변 제시
                System.out.print("숫자를 입력해주세요 : ");
                String answer = Console.readLine();
                AnswerVO answerVO = new AnswerVO(answer);

                //문제와 답변의 일치 정에에 따른 힌트 출력
                int[] result = questionVO.compareCorrectAnswer(answerVO.answerToAnswerArray());
                int strike = result[0];
                int ball = result[1];

                //일치 여부에 따른 결과 출력
                if (strike != 0 && ball == 0) {
                    System.out.println(strike + "스트라이크");
                } else if (strike != 0 && ball != 0) {
                    System.out.print(ball + "볼 ");
                    System.out.println(strike + "스트라이크");
                } else if (strike == 0 && ball != 0) {
                    System.out.println(ball + "볼 ");
                } else if (strike == 0 && ball == 0) {
                    System.out.println("낫싱");
                }

                if (strike == 3) {
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    break;
                }
            }

            //게임 재실행 여부 판단
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            int num = Integer.parseInt(Console.readLine());
            if (num == 1) {

            } else if (num == 2) {
                break;
            }
        }
    }
}
