package com.example.questbasiccomposable_164

import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_164.ui.theme.QuestBasicComposable_164Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_164Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Dimas(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Dimas (modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement =Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)) {
        Text("Login",
            fontSize = 100.sp,
            fontWeight = FontWeight.Bold
        )

        Text("Ini Adalah Halaman Login",
            fontSize = 30.sp,
            fontWeight = FontWeight.Medium)

        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape)
        )

        Text("Nama",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Medium)
        Text("Dimas Luthfi Islamy",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium)
        Text("20220140164",
            fontSize = 45.sp,
            fontWeight = FontWeight.Medium)
        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = "",
            modifier = Modifier.clip(RectangleShape)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_164Theme {
        Greeting("Android")
    }
}