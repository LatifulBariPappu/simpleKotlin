package com.example.kotlinapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener(this)
        binding.btnSub.setOnClickListener(this)
        binding.btnMul.setOnClickListener(this)
        binding.btnDiv.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        var a=binding.et1.text.toString().toDouble()
        var b=binding.et2.text.toString().toDouble()

        var result=0.0
        when(v?.id){
            R.id.btn_add->{
                result=a+b
            }
            R.id.btn_sub->{
                result=a-b
            }
            R.id.btn_mul->{
                result=a*b
            }
            R.id.btn_div->{
                result=a/b
            }
        }
        binding.resultTv.text="Result is $result"
    }
}