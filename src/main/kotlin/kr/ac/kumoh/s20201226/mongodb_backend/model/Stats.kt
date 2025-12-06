package kr.ac.kumoh.s20201226.mongodb_backend.model

data class Stats(
    val hp: Double,
    val hpRegen: Double,
    val mana: Double,
    val manaRegen: Double,
    val attackDamage: Double,
    val attackSpeed: Double,
    val armor: Double,
    val magicResist: Double,
    val range: Int,
    val moveSpeed: Int
)