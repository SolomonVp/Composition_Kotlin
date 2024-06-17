package r.d.composition.domain.repository

import r.d.composition.domain.entity.GameSettings
import r.d.composition.domain.entity.Level
import r.d.composition.domain.entity.Question

interface GameRepository {

    fun generatedQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}