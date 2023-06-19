package com.ivyapps.composehammer.domain.data.quickcode

import com.ivyapps.composehammer.domain.data.Enableable
import com.ivyapps.composehammer.domain.data.Reorderable
import kotlinx.serialization.Serializable

@Serializable
data class CodeGroup(
    override val name: String,
    val codeItems: List<CodeItem>,
    override val order: Double,
    override val enabled: Boolean = true,
) : Reorderable, Enableable