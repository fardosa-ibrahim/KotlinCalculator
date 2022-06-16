package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumOne:TextInputLayout
    lateinit var tilNumTwo:TextInputLayout
    lateinit var etNumOne:TextInputEditText
    lateinit var etNumTwo:TextInputEditText
    lateinit var tvResult:TextView
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumOne=findViewById(R.id.tilNumOne)
        tilNumTwo=findViewById(R.id.tilNumTwo)
        etNumOne=findViewById(R.id.etNumOne)
        etNumTwo=findViewById(R.id.etNumTwo)
        tvResult=findViewById(R.id.tvResult)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        btnDivision=findViewById(R.id.btnDivision)
        tvResult.setOnClickListener {
            validate()
        }
        btnAdd.setOnClickListener {
            val num1=etNumOne.text.toString().toInt()
            val num2=etNumTwo.text.toString().toInt()
            calcSum(num1,num2)
        }
        btnSubtract.setOnClickListener {
            val num1=etNumOne.text.toString().toInt()
            val num2=etNumTwo.text.toString().toInt()
            calcSubtraction(num1,num2)
        }
        btnModulus.setOnClickListener {
            val num1=etNumOne.text.toString().toInt()
            val num2=etNumTwo.text.toString().toInt()
            calcModulus(num1,num2)
        }
        btnDivision.setOnClickListener {
            val num1=etNumOne.text.toString().toInt()
            val num2=etNumTwo.text.toString().toInt()
            calcDivision(num1,num2)
        }
    }

    fun calcDivision(num1: Int, num2: Int) {
        val division=num1/num2
        tvResult.text=division.toString()
    }

    fun calcModulus(num1: Int, num2: Int) {
        val modulus=num1%num2
        tvResult.text=modulus.toString()
    }

    fun calcSubtraction(num1: Int, num2: Int) {
       val subtraction=num1-num2
        tvResult.text=subtraction.toString()
    }

    fun calcSum(num1: Int, num2: Int) {
        val sum=num1+num2
        tvResult.text=sum.toString()

    }
   fun validate(){
       tilNumOne.error=null
       tilNumTwo.error=null
       val num1=etNumOne.text
       if (num1 != null) {
           if (num1.isBlank()){
               tvResult.error="Enter a num1"
           }
       }
       val num2=etNumTwo.text
       if (num2!=null){
           if (num2.isBlank()){
               tvResult.error="enter num2"
           }
       }

   }
}




