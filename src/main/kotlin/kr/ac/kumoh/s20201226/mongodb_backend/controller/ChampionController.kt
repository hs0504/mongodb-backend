package kr.ac.kumoh.s20201226.mongodb_backend.controller

import kr.ac.kumoh.s20201226.mongodb_backend.model.Champion
import kr.ac.kumoh.s20201226.mongodb_backend.service.ChampionService
import org.springframework.web.bind.annotation.*

@RestController // RESTful API Controller임을 명시
@RequestMapping("/api/champions") // 이 Controller의 기본 URL 경로
@CrossOrigin(origins = ["http://localhost:3000"])
class ChampionController(
    private val championService: ChampionService // Service를 주입받아 사용
) {

    // 1. 모든 챔피언 목록 조회 API
    // GET 요청: /api/champions
    @GetMapping
    fun getAllChampions(): List<Champion> {
        // Service를 호출하여 모든 챔피언 목록을 가져와 JSON으로 자동 반환
        return championService.getAllChampions()
    }

    // 2. 특정 챔피언 상세 정보 조회 API
    // GET 요청: /api/champions/{id} (예: /api/champions/Galio)
    @GetMapping("/{id}")
    fun getChampionDetail(@PathVariable id: String): Champion? {
        // Service를 호출하여 해당 ID의 챔피언 상세 정보를 가져와 반환
        return championService.getChampionDetail(id)
    }

    // 💡 참고: Frontend에서 요청 시 CORS(Cross-Origin Resource Sharing) 문제가 발생할 수 있습니다.
    // 임시 방편으로 클래스 위에 @CrossOrigin("*")을 추가하면 대부분 해결됩니다.
    // @CrossOrigin(origins = ["http://localhost:3000"]) 와 같이 Frontend 포트를 지정하는 것이 더 좋습니다.
}