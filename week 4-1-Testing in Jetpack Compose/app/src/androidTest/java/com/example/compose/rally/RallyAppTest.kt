package com.example.compose.rally

import android.util.Log
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.compose.rally.ui.theme.RallyTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * 7. Optional exercise
 *
 *   In this step, you'll use an action (see the Testing Cheat Sheet) to verify
 *   that clicking on the different tabs of the RallyTopAppBar changes the selection.
 *
 *   Hints:
 *   The scope of the test needs to include the state, which is owned by RallyApp.
 *   Verify state, not behavior. Use assertions on the state of the UI instead of
 *   relying on which objects have been called and how.
 */
class RallyAppTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            RallyTheme {
                RallyApp()
            }
        }
    }

    @Test
    fun rallyAppTest_changeScreen() {
        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Overview.name)
            .assertIsDisplayed()

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .performClick()

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsDisplayed()

        composeTestRule
            .onRoot(useUnmergedTree = true)
            .printToLog("changeScreen")

        composeTestRule
            .onNode(SemanticsMatcher.expectValue(CurrentScreenKey, RallyScreen.Accounts))
            .assertExists()
    }
}