package com.example.noticiasapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.noticiasapp.ui.theme.NoticiasappTheme

class ResultActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Scaffold(modifier = Modifier
                .background(colorResource(id = R.color.background_page))
            ) {
                ResultPage()
            }
        }
    }
}


@Composable
fun ResultPage() {
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(colorResource(id = R.color.background_page)),

        ) {
        Box(
            Modifier
                .background(Color(0xFFAFFAA3))
                .fillMaxWidth()
                .padding(vertical = 100.dp),
            contentAlignment = Alignment.Center
        ){

                Text(
                    text = "Muito Confiável",
                    style = TextStyle(
                        color = colorResource(id = R.color.purple_500),
                        fontSize = 35.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        letterSpacing = 0.2.em,
                    )
                )


        }
        //mais informacoes
        Row(Modifier
            .background(Color(0xFFAFFAA3))
            .fillMaxWidth()
            , verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier
                    .absolutePadding(left = 5.dp)
                  ,

                contentAlignment = Alignment.BottomStart
            ) {
                Button(
                    onClick = {   mContext.startActivity(Intent(mContext, InfoActivity::class.java)) },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFF2574EB),
                        contentColor = Color.White),
                    modifier = Modifier.width(48.dp).height(48.dp),
                    shape = CircleShape

                ) {
                    Icon(Icons.Filled.Add, "", modifier = Modifier.width(28.dp).height(28.dp))
                }
            }

            Box(Modifier .absolutePadding(left = 5.dp)){
                Text("Mais informações", color = Color(0xFF2574EB), style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Normal,
                    letterSpacing = 0.1.em)
                )
            }
        }
        //mais informacoes

        //box fontes

        Box(Modifier
            .absolutePadding(left = 95.dp, bottom = 15.dp)
            .height(70.dp),
            contentAlignment = Alignment.BottomCenter){
            Text("FONTES ENCONTRADAS", color = Color.Black, style = TextStyle(
                fontSize = 15.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.1.em,
                textAlign = TextAlign.Center
            )
            )
        }
        //box fontes

        Row(Modifier
            .background(Color(0xFFA8A9AC))
            .fillMaxWidth()
            .height(70.dp)
            .drawBehind {
                val strokeWidth = 1 * density
                val y = size.height - strokeWidth / 2

                drawLine(
                    Color(0xFF673AB7),
                    Offset(0f, y),
                    Offset(size.width, y),
                    strokeWidth
                )
            }
            , verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier
                    .absolutePadding(left = 55.dp)
                ,

                contentAlignment = Alignment.BottomStart
            ) {
                Button(
                    onClick = { /* Do something! */ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFFFFC107),
                        contentColor = Color.White),
                    modifier = Modifier.width(42.dp).height(42.dp),
                    shape = CircleShape

                ){

                }
            }

            Box(Modifier .absolutePadding(left = 15.dp)){
                Text("WWW.R7.COM.BR/NOTICIA", color = Color(0xFF525355), style = TextStyle(
                    //fontSize = 15.sp,
                    //fontFamily = FontFamily.SansSerif,
                    //fontWeight = FontWeight.Normal,
                    //letterSpacing = 0.1.em
                )
                )
            }
        }



        //mensagem barra noticia com bolinha
        Row(Modifier
            .background(Color(0xFFA8A9AC))
            .fillMaxWidth()
            .height(70.dp)
            , verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier
                    .absolutePadding(left = 55.dp, bottom = 10.dp)
                    .height(70.dp)

                ,

                contentAlignment = Alignment.BottomStart
            ) {
                Button(
                    onClick = { /* Do something! */ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color(0xFFFFC107),
                        contentColor = Color.White),
                    modifier = Modifier.width(42.dp).height(42.dp),
                    shape = CircleShape

                ){

                }
            }

            Box(Modifier .absolutePadding(left = 15.dp)){
                Text("WWW.R7.COM.BR/NOTICIA", color =  Color(0xFF525355), style = TextStyle(
                    //fontSize = 15.sp,
                    //fontFamily = FontFamily.SansSerif,
                    //fontWeight = FontWeight.Normal,
                    //letterSpacing = 0.1.em
                    )
                )
            }
        }

    }
}