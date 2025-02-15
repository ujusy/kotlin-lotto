package lotto.view

class InputView {

    fun payment(): String {
        println("구입금액을 입력해 주세요.")
        return readlnOrNull() ?: throw IllegalArgumentException()
    }

    fun manualLottoCount(): String {
        println("수동으로 구매할 로또 수를 입력해 주세요.")
        return readlnOrNull() ?: throw IllegalArgumentException()
    }

    fun manualLottoNumberTitle() {
        println("수동으로 구매할 번호를 입력해 주세요.")
    }

    fun manualLottoNumberNumber(): List<String> {
        val lastWeekWinningNumber = readlnOrNull() ?: throw IllegalArgumentException()
        return lastWeekWinningNumber.replace(" ", "").split(',')
    }

    fun winningNumber(): List<String> {
        println("지난 주 당첨 번호를 입력해 주세요.")
        val lastWeekWinningNumber = readlnOrNull() ?: throw IllegalArgumentException()
        return lastWeekWinningNumber.replace(" ", "").split(',')
    }

    fun bonusBall(): String {
        println("보너스 볼을 입력해 주세요.")
        return readlnOrNull() ?: throw IllegalArgumentException()
    }
}
