package com.example.cryptocurrencyapp.domain.model

import com.example.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptocurrencyapp.data.remote.dto.Tag
import com.example.cryptocurrencyapp.data.remote.dto.TeamMember
import com.example.cryptocurrencyapp.data.remote.dto.Whitepaper

data class CoinDetail(
    val coinId: String,
    val name : String,
    val description: String,
    val symbol: String,
    val rank : Int,
    val isActive: Boolean,
    val tags : List<String>,
    val team : List<TeamMember>,

)


