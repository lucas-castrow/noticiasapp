package com.example.noticiasapp

import android.content.Intent
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.noticiasapp.ui.theme.NoticiasappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Scaffold(modifier = Modifier
                .background(colorResource(id = R.color.background_page))
            ) {
                MainPage()
            }
        }
    }
}

@Preview
@Composable
fun MainPage() {
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(colorResource(id = R.color.background_page)),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Box(
            Modifier
                .absolutePadding(left = 50.dp, top = 150.dp, right = 50.dp, bottom = 30.dp)
                .fillMaxWidth(  )
        ){
            Text(text = "Pesquise e descubra o nível de  confiabilidade da noticia",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = 0.2.em,
                ))
        }
        Box(
            Modifier
                .absolutePadding(left = 20.dp, top = 160.dp, right = 20.dp)
                .fillMaxWidth()
        ){
            SearchViewPreview()
        }

        Box(Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(colorResource(id = R.color.background_page))
        , contentAlignment = Alignment.Center)
            {
                Text("ConfNews", color = Color.Black)
            }
        }
}


@Composable
fun SearchView(state: MutableState<TextFieldValue>) {
    val mContext = LocalContext.current
    OutlinedTextField(
        value = state.value,
        label = {Text("Inserir Link")},
        onValueChange = { value ->
            state.value = value
        },
        modifier = Modifier
            .fillMaxWidth(),
        textStyle = TextStyle(color     = Color.Black, fontSize = 18.sp),
        trailingIcon = {
            if (state.value != TextFieldValue("")) {
                IconButton(
                    onClick = {
                        mContext.startActivity(Intent(mContext, ResultActivity::class.java))

                    }
                ) {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(15.dp)
                            .size(24.dp)
                    )
                }
            }
        },
        singleLine = true,
        shape = RectangleShape, // The TextFiled has rounded corners top left and right by default
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.Black,
            cursorColor = Color.Black,
            leadingIconColor = Color.DarkGray,
            trailingIconColor = Color.Blue,
            backgroundColor = colorResource(id = R.color.white),
            focusedBorderColor = colorResource(id = R.color.teal_700),
            unfocusedBorderColor = colorResource(id = R.color.teal_200),
        )
    )
}

@Preview(showBackground = true)
@Composable
fun SearchViewPreview() {
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    SearchView(textState)
}