import model.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoGameTest {

    @Test
    @DisplayName("로또 숫자가 Lotto.Size 개 생성된다")
    fun `createLottoNumber`() {
        val lotto = Lotto.make()
        assertThat(lotto.number.size).isEqualTo(Lotto.SIZE)
    }

    @Test
    @DisplayName("구매 금액을 입력 받으면 구매 금액 / 로또 금액만큼 로또 목록이 생성된다")
    fun `createLottoList`() {
        val inputMoney = 14_000
        val lottoGame = LottoGame()
        val lottosGeneratorAuto = LottosGeneratorAuto()
        val list = lottoGame.buy(Money(inputMoney), lottosGeneratorAuto)
        assertThat(list.size).isEqualTo(inputMoney / Money.LOTTO_PRICE)
    }

    @Test
    @DisplayName("자동 생성 수를 반환한다")
    fun `autoMakeCount`() {
        val inputMoney = 14_000
        val lottoGame = LottoGame()
        val manual = LottoManual(3)
        val listManual = mutableListOf<Lotto>()
        val lottosGeneratorManual = LottosGeneratorManual(manual, listManual)
        lottoGame.buy(Money(inputMoney), lottosGeneratorManual)
        assertThat(lottosGeneratorManual.lottoAutoCount(Money(inputMoney))).isEqualTo(11)
    }
}
