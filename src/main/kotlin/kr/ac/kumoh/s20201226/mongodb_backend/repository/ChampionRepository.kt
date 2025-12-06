package kr.ac.kumoh.s20201226.mongodb_backend.repository

import kr.ac.kumoh.s20201226.mongodb_backend.model.Champion
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ChampionRepository : MongoRepository<Champion, String> {
    // String은 Champion의 @Id 타입입니다.
    // 이 인터페이스만으로 findById, findAll 등의 기본적인 DB 기능이 자동 생성됩니다.
}