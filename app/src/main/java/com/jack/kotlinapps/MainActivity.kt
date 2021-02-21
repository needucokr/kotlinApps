package com.jack.kotlinapps

import android.app.Activity
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    val Tag = "MyTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//test


    }
}













//        var child = Child()
//        child.showMoney()
//open class Parent {
//    var money:String = "100,000,000,000"
//    var house = "APT"
//}
//
//class Child : Parent(){
//
//    fun showMoney(){
//        Log.d("클래스","${money}")
//    }
//
//
//}

//class Log{
//
//    fun d(par:String, par2:String){
//
//    }
//}
//
////변수 함수 모음
//class ClassName{
//    init{
//        //class 초기화 후 호출된다
//    }
//
//    var variable:String = "" //변수 프로퍼티
//
//    fun function(){ //함수 메소드
//        var variablelocal:String = ""
//    }
//
//}






//      var 변수 -값이 변함    variable = "Global"
//      val 상수 -변하지 않음 [대문자]
//      var double:Double = 35.2
//      var charValue:Char = 'a'
//      var stringValue:String = "쌍따음표로 길이에 상관 없음"
//      var booleanValue:Boolean = true
//

//       var IsName:String = "JackSparrow"

//        Log.d("name","${IsName}")

//        var month = 7
//        if(month > 9) {
//            Log.d("if", "가을")
//        }else if(month > 6 && month < 9) {
//            Log.d("if","여름")
//        }else  {
//            Log.d("if", "겨울")
//        }

//when == swtich

//        when(month){
//            6,7,12 -> Log.d("when","6월")
//            1,19 -> Log.d("when","9월")
//        }

//        var intArr:IntArray = IntArray(10)
//
//        intArr[0] = 10
//        intArr[1] = 20
//
//        intArr[9] = 110
//
//        Log.d("arr","${intArr[9]}")
//

//         var mutableList = mutableListOf<Int>()
//        mutableList.add(4)
//
//        Log.d("컬렉션","값=${mutableList.get(0)}")
//        var mutableMap = mutableMapOf<String,String>()
//            mutableMap.put("변수","값1")
//
//            Log.d("컬렉셔","맵 변수1 값 = ${mutableMap.get("값1")}")
//
//

//        var intA = IntArray(10)
//
//        var intArray = intArrayOf(0,1,2,3,4,5,6,7)
//
//        for ( value in intArray  )
//            Log.d("for문","index=${value}")
//        var out = 0
//
//
////        while( out < 3) {
////            Log.d("out","${out}")
////            out += 1
////
////        }
//
//        for(index in 0 .. 10){
//            if(index > 5 ) break
//            Log.d("brea","${index}")
//        }
//functionName()
//functionParam("값")
//        var pi  =   getPi()
//        Log.d("파이","${pi}")

//    fun functionName(){}
//
//    fun functionParam(param1:String){}
//
//    fun getPi() :Double{
//        return 3.141592
//    }