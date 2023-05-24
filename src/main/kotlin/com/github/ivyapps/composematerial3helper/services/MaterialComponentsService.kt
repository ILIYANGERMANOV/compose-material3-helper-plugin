package com.github.ivyapps.composematerial3helper.services

import com.github.ivyapps.composematerial3helper.data.MaterialComponent
import com.github.ivyapps.composematerial3helper.data.MaterialComponentsGroup
import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project

@Service(Service.Level.PROJECT)
class MaterialComponentsService(project: Project) {

    val content by lazy {
        buildList {
            buttons()

            fab()

            group("Navigation") {

            }
        }
    }
}

private fun MutableList<MaterialComponentsGroup>.buttons() = group("Buttons") {
    component {
        name = "Elevated Button"
        specUrl = "https://m3.material.io/components/buttons/specs#2a19e853-d5dc-46a2-8ef4-1d954c9dcefa"
        guidelinesUrl = "https://m3.material.io/components/buttons/guidelines#4e89da4d-a8fa-4e20-bb8d-b8a93eff3e3e"
        docsUrl =
            "https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#ElevatedButton(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)"
        description = """
            Elevated buttons are essentially filled tonal buttons with a shadow. 
            To prevent shadow creep, only use them when absolutely necessary, 
            such as when the button requires visual separation from a patterned background.
        """.trimIndent()
        screenshot = "btn_elevated"
        import = "androidx.compose.material3.ElevatedButton"
        code = """
        ElevatedButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Text(text = "Text")
        }
        """.trimIndent()
        customCode = """
        ElevatedButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.elevatedButtonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer
            ),
            elevation = ButtonDefaults.elevatedButtonElevation(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(text = "Text")
        }
        """.trimIndent()
    }

    component {
        name = "Filled Button"
        specUrl = "https://m3.material.io/components/buttons/specs#0b1b7bd2-3de8-431a-afa1-d692e2e18b0d"
        guidelinesUrl = "https://m3.material.io/components/buttons/guidelines#9ecffdb3-ef29-47e7-8d5d-f78b404fcafe"
        docsUrl =
            "https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#Button(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)"
        description = """
            Filled buttons have the most visual impact after the FAB,
            and should be used for important, final actions
            that complete a flow, like Save, Join now, or Confirm.
        """.trimIndent()
        screenshot = "btn_filled"
        import = "androidx.compose.material3.Button"
        code = """
        Button(
            onClick = {
                /* Do something! */
            }
        ) {
            Text("Text")
        }
        """.trimIndent()
        customCode = """
        Button(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                disabledContainerColor = MaterialTheme.colorScheme.secondaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onSecondaryContainer
            ),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text("Text")
        }
        """.trimIndent()
    }

    component {
        name = "Filled Tonal Button"
        specUrl = "https://m3.material.io/components/buttons/specs#158f0a18-67fb-4ac4-9d22-cc4d1adc4579"
        guidelinesUrl = "https://m3.material.io/components/buttons/guidelines#07a1577b-aaf5-4824-a698-03526421058b"
        docsUrl =
            "https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#FilledTonalButton(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)"
        description = """
            A filled tonal button is an alternative middle ground between filled and outlined buttons.
            They’re useful in contexts where a lower-priority button requires slightly more emphasis
            than an outline would give, such as "Next" in an onboarding flow.
            Tonal buttons use the secondary color mapping.
        """.trimIndent()
        screenshot = "btn_filled_tonal"
        import = "androidx.compose.material3.FilledTonalButton"
        code = """
        FilledTonalButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Text("Text")
        }
        """.trimIndent()
        customCode = """
        FilledTonalButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer
            ),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text("Text")
        }
        """.trimIndent()
    }

    component {
        name = "Outlined Button"
        specUrl = "https://m3.material.io/components/buttons/specs#de72d8b1-ba16-4cd7-989e-e2ad3293cf63"
        guidelinesUrl = "https://m3.material.io/components/buttons/guidelines#3742b09f-c224-43e0-a83e-541bd29d0f05"
        docsUrl =
            "https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#OutlinedButton(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)"
        description = """
            Outlined buttons are medium-emphasis buttons. They contain actions that are important,
            but aren’t the primary action in an app.

            Outlined buttons pair well with filled buttons to indicate an alternative, secondary action.
        """.trimIndent()
        screenshot = "btn_outlined"
        import = "androidx.compose.material3.OutlinedButton"
        code = """
        OutlinedButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Text("Text")
        }
        """.trimIndent()
        customCode = """
        OutlinedButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                disabledContainerColor = MaterialTheme.colorScheme.tertiaryContainer,
                disabledContentColor = MaterialTheme.colorScheme.onTertiaryContainer
            ),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.secondary),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text("Text")
        }
        """.trimIndent()
    }

    component {
        name = "Text Button"
        specUrl = "https://m3.material.io/components/buttons/specs#899b9107-0127-4a01-8f4c-87f19323a1b4"
        guidelinesUrl = "https://m3.material.io/components/buttons/guidelines#c9bcbc0b-ee05-45ad-8e80-e814ae919fbb"
        docsUrl =
            "https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#TextButton(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.ui.graphics.Shape,androidx.compose.material3.ButtonColors,androidx.compose.material3.ButtonElevation,androidx.compose.foundation.BorderStroke,androidx.compose.foundation.layout.PaddingValues,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function1)"
        description = """
            Text buttons are used for the lowest priority actions, especially when presenting multiple options.

            Text buttons can be placed on a variety of backgrounds.
            Until the button is interacted with, its container isn’t visible.
        """.trimIndent()
        screenshot = "btn_text"
        import = "androidx.compose.material3.TextButton"
        code = """
        TextButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Text("Text")
        }
        """.trimIndent()
        customCode = """
        TextButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            enabled = true,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.textButtonColors(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text("Text")
        }
        """.trimIndent()
    }
}

private fun MutableList<MaterialComponentsGroup>.fab() = group("Floating Action Buttons") {
    component {
        name = "Floating Action Button"
        specUrl = "https://m3.material.io/components/floating-action-button/specs#71504201-7bd1-423d-8bb7-07e0291743e5"
        guidelinesUrl =
            "https://m3.material.io/components/floating-action-button/guidelines#dbfbab5d-c3e2-47a4-be6e-c566e9125443"
        docsUrl =
            "https://developer.android.com/reference/kotlin/androidx/compose/material3/package-summary#FloatingActionButton(kotlin.Function0,androidx.compose.ui.Modifier,androidx.compose.ui.graphics.Shape,androidx.compose.ui.graphics.Color,androidx.compose.ui.graphics.Color,androidx.compose.material3.FloatingActionButtonElevation,androidx.compose.foundation.interaction.MutableInteractionSource,kotlin.Function0)"
        description = """
            Use a FAB to represent the screen’s primary action.
        """.trimIndent()
        screenshot = "fab"
        import = "androidx.compose.material3.FloatingActionButton"
        code = """
        FloatingActionButton(
            onClick = {
                /* Do something! */
            }
        ) {
            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Create"
            )
        }
        """.trimIndent()
        customCode = """
        FloatingActionButton(
            onClick = {
                /* Do something! */
            },
            modifier = Modifier,
            shape = FloatingActionButtonDefaults.shape,
            containerColor = FloatingActionButtonDefaults.containerColor,
            contentColor = contentColorFor(FloatingActionButtonDefaults.containerColor),
            elevation = FloatingActionButtonDefaults.elevation(4.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Create,
                contentDescription = "Create"
            )
        }
        """.trimIndent()
    }
}


// region DSL
@DslMarker
annotation class MaterialComponentDsl

@MaterialComponentDsl
fun MutableList<MaterialComponentsGroup>.group(
    title: String,
    components: MutableList<MaterialComponent>.() -> Unit
) {
    add(
        MaterialComponentsGroup(
            title = title,
            components = buildList { components() }
        )
    )
}

class ComponentScope {
    var name: String? = null
    var description: String? = null
    var specUrl: String? = null
    var guidelinesUrl: String? = null
    var docsUrl: String? = null
    var screenshot: String? = null
    var code: String? = null
    var codeTip: String? = null
    var customCode: String? = null
    var customCodeTip: String? = null
    var import: String? = null
    var imports: List<String> = emptyList()

    fun build(): MaterialComponent {
        return MaterialComponent(
            name = name.required(),
            description = description.required(),
            specUrl = specUrl.required(),
            guidelinesUrl = guidelinesUrl.required(),
            docsUrl = docsUrl.required(),
            menuScreenshot = screenshot.required(),
            detailsScreenshot = screenshot.required(),
            imports = import?.let(::listOf) ?: imports.takeIf { it.isNotEmpty() }.required(),
            defaultImplementation = code.required(),
            defaultImplementationTip = codeTip,
            customImplementation = customCode,
            customImplementationTip = customCodeTip,
        )
    }

    private fun <T> T?.required(): T {
        return requireNotNull(this) { "Invalid component: ${this@ComponentScope}" }
    }
}

@MaterialComponentDsl
fun MutableList<MaterialComponent>.component(
    init: ComponentScope.() -> Unit
) {
    add(ComponentScope().apply(init).build())
}
// endregion