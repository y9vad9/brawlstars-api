package com.y9vad9.bsapi.types.brawler

import com.y9vad9.bsapi.types.brawler.value.BrawlerId
import com.y9vad9.bsapi.types.brawler.value.BrawlerName
import com.y9vad9.bsapi.types.brawler.value.BrawlerRank
import com.y9vad9.bsapi.types.brawler.value.PowerLevel
import com.y9vad9.bsapi.types.club.Club
import com.y9vad9.bsapi.types.event.value.RankingPosition
import com.y9vad9.bsapi.types.event.value.Trophies
import com.y9vad9.bsapi.types.player.PlayerIcon
import com.y9vad9.bsapi.types.player.value.PlayerName
import com.y9vad9.bsapi.types.player.value.PlayerTag
import kotlinx.serialization.Serializable


@Serializable
public data class Brawler(
    val id: BrawlerId,
    val name: BrawlerName,
    val power: PowerLevel,
    val rank: BrawlerRank,
    val trophies: Trophies,
    val highestTrophies: Trophies,
    val gears: List<Gear>,
    val starPowers: List<StarPower>,
    val gadgets: List<Gadget>,
) {
    @Serializable
    public data class View(
        val id: BrawlerId,
        val name: BrawlerName,
        val starPowers: List<StarPower>,
        val gadgets: List<Gadget>,
    )

    @Serializable
    public data class Ranking(
        val name: PlayerName,
        val tag: PlayerTag,
        val icon: PlayerIcon,
        val trophies: Trophies,
        val club: Club.View? = null,
        val rank: RankingPosition,
    )
}

public val Brawler.isMaxRanked: Boolean get() = rank == BrawlerRank.MAX

