package com.example.noticiasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.noticiasapp.ui.theme.NoticiasappTheme

class InfoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Scaffold(modifier = Modifier
                .background(colorResource(id = R.color.background_page))
            ) {
                InfoNoticia()
            }
        }
    }
}


@Composable
fun ColumnContents(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(colorResource(id = R.color.background_page)),

        ){
        //box nivel de confiabilidade
        Box(
            Modifier
                .background(Color(0xFFAFFAA3))
                .fillMaxWidth()
                .padding(vertical = 60.dp),
            contentAlignment = Alignment.Center
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "96%",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 35.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,

                        )
                )
                Text(
                    text = "Nível de Confiabilidade",
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.SemiBold,

                        )
                )
            }

        }// box nivel de confiabilidade

        //BOX DADOS ANALISADOS
        Box(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 30.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Column(
                Modifier
                    .absolutePadding(left = 25.dp),
              ) {
                Text(
                    text = "Dados analisados",
                    style = TextStyle(
                        color = Color(0xFF511CA3),
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        )
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "Dados X: 67/89",
                    style = TextStyle(
                        color = Color(0xFF555555),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Medium,

                        )
                )
                Text(
                    text = "Dados Y: 22/25",
                    style = TextStyle(
                        color = Color(0xFF555555),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Medium,

                        )
                )
                Text(
                    text = "Dados Z: 145/146",
                    style = TextStyle(
                        color = Color(0xFF555555),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Medium,

                        )
                )
            }

        }//BOX DADOS ANALISADOS

        Box(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 80.dp),
            contentAlignment = Alignment.Center
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Total de dados com cruzamento válido",
                    style = TextStyle(
                        color = Color(0xFF555555),
                        fontSize = 21.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,

                        )
                )
                Text(
                    text = "1209/1322",
                    style = TextStyle(
                        color = Color(0xFF1E800E),
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,

                        )
                )
            }

        }//total de dados com cruzamento

        Box(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background( Color(0xFF90CAF9)),
            contentAlignment = Alignment.Center
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Esse nível de confiabilidade é",
                    style = TextStyle(
                        color = Color(0xFF555555),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,

                        )
                )
                Text(
                    text = "baseado no cruzamento de dados",
                    style = TextStyle(
                        color =Color(0xFF555555),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,

                        )
                )
                Text(
                    text = "provenientes de sites confiáveis",
                    style = TextStyle(
                        color = Color(0xFF555555),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,

                        )
                )
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun InfoNoticia() {
    ColumnContents()
}