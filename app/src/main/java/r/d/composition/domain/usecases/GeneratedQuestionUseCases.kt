package r.d.composition.domain.usecases

import r.d.composition.domain.entity.Question
import r.d.composition.domain.repository.GameRepository

class GeneratedQuestionUseCases(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generatedQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }

}