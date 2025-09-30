package pt.iade.games.uop.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import pt.iade.games.uop.R

@Composable
fun Character(state: String) {
    val mood: Int
    if (state == "hungry") {
        mood = R.drawable.uop_hungry
    } else if (state == "hurt") {
        mood = R.drawable.uop_hurt
    } else if (state == "sad") {
        mood = R.drawable.uop_sad
    } else if (state == "dirty") {
        mood = R.drawable.uop_dirty
    } else if (state == "idle") {
        mood = R.drawable.uop_idle
    } else {
        mood = R.drawable.ic_launcher_background
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Uop is $state")
        Image(
            painter = painterResource(mood),
            contentDescription = "Uop is $state"
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CharacterPreview() {
    Column {
        Character("hungry")
        Character("hurt")
        Character("sad")
        Character("dirty")
        Character("idle")
    }
}

@Composable
@Preview(showBackground = true)
fun BadCharacterPreview() {
    Column {
        Character("whatever")
    }
}
