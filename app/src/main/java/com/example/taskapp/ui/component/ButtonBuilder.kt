package com.example.taskapp.ui.component

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.material.Button
import androidx.ui.unit.dp
import com.example.taskapp.ui.base.teal200


@Composable
fun SimpleButton(
    text: String,
    onClick: (() -> Unit),
    modifier: Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(4.dp),
        backgroundColor = teal200,
        contentColor = Color.White,
        text = {
            Text(text = text)
        },
        modifier = modifier
    )
}