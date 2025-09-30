package pt.iade.games.uop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pt.iade.games.uop.ui.components.Character
import pt.iade.games.uop.ui.components.RoomHeader
import pt.iade.games.uop.ui.components.StatsCard
import pt.iade.games.uop.ui.theme.UopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UopTheme {
                MainView()
            }
        }
    }
}

@Composable
fun MainView() {
    Column {
        RoomHeader(
            rooms = listOf("Living Room", "Bathroom", "Kitchen")
        )
        StatsCard()
        Character(state = "hungry")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UopTheme {
        MainView()
    }
}

fun Add(x: Int, y: Int): Int {
    return x + y
}