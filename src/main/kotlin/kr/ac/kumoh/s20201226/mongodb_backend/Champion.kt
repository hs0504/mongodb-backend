package com.example.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "champions")
data class Champion(
    @Id
    val id: String, // DB의 _id (챔피언 영문 이름)
    val nameKo: String,
    val role: String,
    val faction: String,
    val squareImagePath: String,
    val splashImagePath: String,
    val background: String,
    val stats: Stats // 내장 문서 Stats 사용
)