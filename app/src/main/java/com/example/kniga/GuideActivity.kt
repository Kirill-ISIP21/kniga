package com.example.kniga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.text.FieldPosition

class GuideActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    lateinit var tab:TabLayout
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
        viewPager=findViewById(R.id.vpag2)
        tab=findViewById(R.id.tab_lay)
        button=findViewById(R.id.buttonext)

        viewPager.adapter = VpAdapter(this,List.List)
        TabLayoutMediator(tab,viewPager){_,_->}.attach()

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int){
                when(position){
                    2->{
                        button.text="Начать"
                    }
                    else->{
                        button.text="Далее"
                    }
                }
            }
        })


    }
    fun guide(view:View){
        when(viewPager.currentItem){
            2->startActivity(Intent(this,SignInActivity::class.java))
            else->viewPager.currentItem++
        }
    }

}