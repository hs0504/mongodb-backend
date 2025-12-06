package kr.ac.kumoh.s20201226.mongodb_backend.service

import kr.ac.kumoh.s20201226.mongodb_backend.model.Champion
import kr.ac.kumoh.s20201226.mongodb_backend.repository.ChampionRepository
import org.springframework.stereotype.Service

@Service
class ChampionService(
    private val championRepository: ChampionRepository // Repository를 주입받아 사용
) {

    // 1. 모든 챔피언 목록을 가져오는 기능 (리스트 화면용)
    fun getAllChampions(): List<Champion> {
        // Repository의 findAll() 메소드를 호출하여 모든 데이터를 가져옵니다.
        // 이 findAll()은 Spring Data MongoDB가 자동으로 생성해 준 기능입니다.
        return championRepository.findAll()
    }

    // 2. 특정 챔피언의 상세 정보를 ID로 가져오는 기능 (상세 화면용)
    fun getChampionDetail(id: String): Champion? {
        // Repository의 findById(id) 메소드를 호출합니다.
        // 결과는 Optional<Champion>으로 반환되므로, orElse(null)로 처리하여 Champion 객체 또는 null을 반환합니다.
        return championRepository.findById(id).orElse(null)
    }
}