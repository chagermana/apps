package com.example.midcalcintentandweb_manvin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {

    lateinit var Tv_answer:TextView
    lateinit var Edt_firstnumber:EditText
    lateinit var Edt_secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonsubtract:Button
    lateinit var buttondivide:Button
    lateinit var buttonmultiply:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Tv_answer=findViewById(R.id.Txt_answer)
        Edt_firstnumber=findViewById(R.id.Edt_Fnum)
        Edt_secondnumber=findViewById(R.id.Edt_Snum)
        buttonadd=findViewById(R.id.Btn_Add)
        buttonsubtract=findViewById(R.id.Btn_subtract)
        buttondivide=findViewById(R.id.Btn_divide)
        buttonmultiply=findViewById(R.id.Btn_multiply)

        buttonadd.setOnClickListener {
            var myfirstnumber=Edt_firstnumber.text.toString()
            var mysecondnumber=Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() + mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }

        buttonsubtract.setOnClickListener {
            var myfirstnumber=Edt_firstnumber.text.toString()
            var mysecondnumber=Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() - mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }

        buttonmultiply.setOnClickListener {
            var myfirstnumber=Edt_firstnumber.text.toString()
            var mysecondnumber=Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() * mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }

        buttondivide.setOnClickListener {
            var myfirstnumber=Edt_firstnumber.text.toString()
            var mysecondnumber=Edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&&mysecondnumber.isEmpty()){
                Tv_answer.text="Please fill all the inputs"
            }else{
                var answer=myfirstnumber.toDouble() / mysecondnumber.toDouble()
                Tv_answer.text=answer.toString()
            }
        }


    }
}
