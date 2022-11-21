package com.example.kotlincompose

import android.graphics.Paint
import android.graphics.Paint.Align
import android.os.Bundle
import android.text.style.AlignmentSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlincompose.ui.theme.KotlinComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    HomeCard(
        title = stringResource(R.string.title_text),
        desc1 = stringResource(R.string.desc1_text),
        desc2 = stringResource(R.string.desc2_text),
        img = painterResource(id = R.drawable.bg_compose_background)
    )

}

@Composable
fun HomeCard(
    title: String,
    desc1: String,
    desc2: String,
    img: Painter,
    modifier: Modifier = Modifier
){
    Column(modifier = modifier) {
        Image(painter = img, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = desc1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = desc2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KotlinComposeTheme {
        HomeScreen()
    }
}