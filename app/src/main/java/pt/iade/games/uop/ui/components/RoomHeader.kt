package pt.iade.games.uop.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pt.iade.games.uop.ui.theme.UopTheme

@Composable
fun RoomHeader(
    rooms: List<String>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(
                state = ScrollState(0),
                enabled = true
            )
    ) {
        for (room in rooms) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(7.dp, 7.dp, 7.dp, 7.dp),
                modifier = Modifier.padding(end = 10.dp)
            ) {
                Text(room)
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun RoomHeaderPreview() {
    UopTheme {
        RoomHeader(
            rooms = listOf("Living Room", "Bathroom", "Kitchen")
        )
    }
}
