import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    @DisplayName("1 + 2는 3이다.")  // 테스트 이름
    @Test  // 테스트 메서드
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(a + b, sum);  // 값이 같은지 확인
        // 첫 번째 인수는 기대하는 값
        // 두 번째 인수는 실제 검증할 값
    }

//    @DisplayName("1 + 3은 4이다.")
//    @Test
//    public void junitFailedTest() {
//        int a = 1;
//        int b = 3;
//        int sum = 3;
//
//        Assertions.assertEquals(a + b, sum);  // 실패하는 케이스
//    }
}
