package com.example.copypasteapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.copypasteapplication.ui.theme.CopyPasteApplicationTheme
import com.example.copypasteapplication.Message

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    messageCard(Message("Muah","Jetpack Compose"))
            }
        }
    }

data class Message(val author : String, val body: String)

@Composable
fun messageCard(msg: Message){
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = R.drawable.my_image),
            contentDescription = "icon",
            modifier = Modifier
                .size(60.dp)
                .clip(RectangleShape)
        )

        Column(modifier = Modifier.padding(all = 8.dp)) {
            Text(text = msg.author,color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = msg.body, color = Color.White)
        }
    }
}

@Preview
@Composable
fun show(){
    messageCard(
        msg = Message("Muath","I'm working on a project right now")
    )
}

