package lotto

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import lotto.domin.LottoNumberSet
import lotto.dto.InputLottoMachineRequestDto
import lotto.dto.InputLottoMachineRequestDto.Companion.CANNOT_CONVERT_INT
import lotto.dto.InputLottoMachineRequestDto.Companion.NEGATIVE_ERROR

class LottoMachineRequestDtoTest : FreeSpec({

    "of" - {

        "입력값이 LottoMachineRequestDto 로 변환되어야한다." {
            val inputPayment = "1000"
            val inputManualLotto = listOf(LottoNumberSet(listOf(1, 2, 3, 4, 5, 6)))

            val lottoMachineRequest = InputLottoMachineRequestDto.of(inputPayment, inputManualLotto)
            lottoMachineRequest.payment shouldBe 1000
            lottoMachineRequest.manualLotto.size shouldBe 1
        }

        "정수로 변환되지 못한 경우 IllegalArgumentException" {
            val inputPayment = "test"
            val inputManualLotto = listOf(LottoNumberSet(listOf(1, 2, 3, 4, 5, 6)))

            val exception = shouldThrow<IllegalArgumentException> {
                InputLottoMachineRequestDto.of(inputPayment, inputManualLotto)
            }
            exception.message shouldBe CANNOT_CONVERT_INT
        }

        "음수인 경우 IllegalArgumentException" {
            val inputPayment = "-1000"
            val inputManualLotto = listOf(LottoNumberSet(listOf(1, 2, 3, 4, 5, 6)))

            val exception = shouldThrow<IllegalArgumentException> {
                InputLottoMachineRequestDto.of(inputPayment, inputManualLotto)
            }
            exception.message shouldBe NEGATIVE_ERROR
        }
    }

    "convertToCount" - {

        "정수형으로 변환되어야한다." {
            val inputManualLottoCount = "1"

            InputLottoMachineRequestDto.convertToCount(inputManualLottoCount) shouldBe 1
        }

        "음수인 경우 IllegalArgumentException" {
            val inputManualLottoCount = "-1"

            val exception = shouldThrow<IllegalArgumentException> {
                InputLottoMachineRequestDto.convertToCount(inputManualLottoCount)
            }
            exception.message shouldBe NEGATIVE_ERROR
        }
    }
})
