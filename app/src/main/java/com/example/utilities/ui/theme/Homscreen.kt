package com.example.utilities.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utilities.R

@Composable 
fun Homescreen(fontFamily: FontFamily) {
    Column {
        Box(modifier = Modifier.padding(20.dp)) {
            Box(modifier = Modifier.padding(top = 40.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painterResource(id = R.drawable.back_arrow),
                        contentDescription = "arrow",
                        modifier = Modifier.size(20.dp)
                    )
                    Text(text = "Go back", modifier = Modifier.padding(start=5.dp),fontFamily=fontFamily, fontWeight = FontWeight.Bold)
                }
                Column(
                    modifier = Modifier
                        .padding(top = 60.dp)
                ) {
                    Text(text = "Recent top ups", fontSize = 20.sp,fontFamily=fontFamily, fontWeight = FontWeight.ExtraBold)
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 40.dp)
                    ) {
                        Box(modifier = Modifier.clip(RoundedCornerShape(30))) {
                            Box(
                                modifier = Modifier
                                    .background(PowerBg)
                                    .padding(10.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Image(
                                        painterResource(id = R.drawable.ic_power_24px),
                                        contentDescription = "Switch",
                                        modifier = Modifier.size(15.dp)
                                    )
                                    Text(
                                        text = "Mum's Meter",color= MeterColor,fontFamily=fontFamily,fontSize=15.sp,fontWeight=FontWeight.Bold,
                                        modifier = Modifier.padding(start = 5.dp)
                                    )
                                }
                            }
                        }

                        Box(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(30))
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(PostBg)
                                    .padding(10.dp)
                                    .clip(
                                        RoundedCornerShape(30)
                                    )
                            ) {
                                Text(
                                    text = "Postpaid",color= PostColor,fontFamily=fontFamily,fontSize=15.sp,fontWeight=FontWeight.Bold)
                            }
                        }

                        Box(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .clip(RoundedCornerShape(30))
                        ) {
                            Box(
                                modifier = Modifier
                                    .background(LocationBg)
                                    .padding(10.dp)
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Image(
                                        painterResource(id = R.drawable.ic_location_on_24px),
                                        contentDescription = "map_pin",
                                        modifier = Modifier
                                            .size(15.dp)
                                    )
                                    Text(
                                        text = "Accra",color= AccraColor, fontFamily=fontFamily,fontSize=15.sp,fontWeight=FontWeight.Bold,modifier=Modifier.padding(start = 5.dp))
                                }

                            }

                        }
                    }
                    Spacer(modifier = Modifier.height(45.dp))
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(
                        GreyColor)) {
                        Box(modifier = Modifier.clip(RoundedCornerShape(30))) {
                            Box(
                                modifier = Modifier
                                    .background(firstPill)
                                    .padding(10.dp)
                            ) {
                                Text(text = "Last 10 days",fontSize=14.sp,fontFamily=fontFamily, fontWeight = FontWeight.ExtraBold)
                            }
                        }
                        Box(modifier = Modifier.padding(start = 20.dp)) {
                            Box {
                                Text(text = "Last 30 days",color = GreyText,fontFamily=fontFamily,fontSize=14.sp,fontWeight=FontWeight.Bold)
                            }
                        }
                        Box(modifier = Modifier.padding(start = 20.dp)) {
                            Box {
                                Text(text = "Custom",color = GreyText,fontFamily=fontFamily,fontSize=14.sp, fontWeight = FontWeight.Bold)
                            }
                        }

                    }
                }
            }
        }
        for (i in 0..3){
            Card(fontFamily)
            Divider(
                color = Col, modifier = Modifier
                    .padding(start= 30.dp,end=30.dp),
                thickness = 1.dp,
            )
        }
    }
}
@Composable
fun Card(fontFamily: FontFamily) {
    Box(modifier = Modifier.background(Back)) {
        Box(modifier = Modifier.padding(20.dp)) {
            Row(modifier=Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.background(Back)) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.group_14342),
                            contentDescription = "switch"
                        )
                        Column(modifier=Modifier.padding(start = 10.dp)) {
                            Text(text = "GHS 430.00",fontFamily=fontFamily, fontSize = 14.sp, fontWeight = FontWeight.ExtraBold)
                            Text(text = "340kWh",fontFamily=fontFamily,fontSize = 14.sp)
                        }

                    }
                }
                Box {
                    Text(text = "20/04/22", color = GreyText,fontFamily=fontFamily,fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
                }
            }
        }
    }
}