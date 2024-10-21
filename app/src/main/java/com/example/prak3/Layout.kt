package com.example.prak3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Layout(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection()
        DetailMhs(
            param = "Nama",
            argum = "Aryanitha Hajrah Mawaddah"
        )
        DetailMhs(
            param = "NIM",
            argum = "20220140120"
        )
        DetailMhs(
            param = "Prodi",
            argum = "Teknolofi Informasi"
        )
        DetailMhs(
            param = "Fakultas",
            argum = "Teknik"
        )
        DetailMhs(
            param = "Universitas",
            argum = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            param = "Alamat",
            argum = "Jl.Pahlawan No.1 Samarinda"
        )
        DetailMhs(
            param = "Email",
            argum = "aanhjrh@gmail.com"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        ){
            Box(
                contentAlignment = Alignment.BottomEnd
            ){
                Image(painter = painterResource(id = R.drawable.tiumy),
                    contentDescription = null,
                    modifier = Modifier.clip(CircleShape)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp).background(color = Color.Blue)

                )
            }
            Column (
                modifier = Modifier.padding(14.dp)
            ){
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMhs(
    param: String,
    argum: String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argum,
                modifier = Modifier.weight(2f))
        }
    }
}