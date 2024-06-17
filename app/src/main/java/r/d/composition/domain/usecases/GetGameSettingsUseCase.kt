package r.d.composition.domain.usecases

import r.d.composition.domain.entity.GameSettings
import r.d.composition.domain.entity.Level
import r.d.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}