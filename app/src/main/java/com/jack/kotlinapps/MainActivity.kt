package com.jack.kotlinapps

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log




class MainActivity : AppCompatActivity() {

    val Tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var IsName:String = "JackSparrow"

//        Log.d("name","${IsName}")

        var month = 7
//        if(month > 9) {
//            Log.d("if", "가을")
//        }else if(month > 6 && month < 9) {
//            Log.d("if","여름")
//        }else  {
//            Log.d("if", "겨울")
//        }

        //when == swtich

        when(month){
            6,7,12 -> Log.d("when","6월")
            9 -> Log.d("when","9월")
        }


       }
}

//      var 변수 -값이 변함    variable = "Global"
//      val 상수 -변하지 않음 [대문자]
//      var double:Double = 35.2
//      var charValue:Char = 'a'
//      var stringValue:String = "쌍따음표로 길이에 상관 없음"
//      var booleanValue:Boolean = true
//


