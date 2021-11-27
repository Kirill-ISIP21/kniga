package com.example.kniga

import android.icu.text.CaseMap

data class guide(val title:String,val descr:String,val image:Int)
data class login(val id:String,
                 val phone:String,
                 val Name:String,
                 val avatar:String,
                 val token:String)
data class feelings(val success:Boolean, val data: ArrayList<data_feelings>)
data class data_feelings(val id:Int, val title:String, val image:String, val position: Int, val from:String,val to:String)
object List {
    val List = arrayListOf(
        guide(
            title = "Быстрая доставка!",
            descr = "Ппыапавпаыпаыв ываывлалывавыа аываыва ываываыва цууцуцц уцацуацу ацуацуацуацу фыывфвыффы ыфвфыв adfsafas asfasf fasfasfa afsfasf fasfasf asfas\n"
                    + "dasdasdasd adssadasdas",
            R.drawable.fast1
        ),
        guide (title = "Быстрая доставка!",
        descr = "Ппыапавпаыпаыв ываывлалывавыа аываыва ываываыва цууцуцц уцацуацу ацуацуацуацу фыывфвыффы ыфвфыв adfsafas asfasf fasfasfa afsfasf fasfasf asfas\n"
                + "dasdasdasd adssadasdas",
        R.drawable.fast2),
        guide (title = "Быстрая доставка!",
            descr = "Ппыапавпаыпаыв ываывлалывавыа аываыва ываываыва цууцуцц уцацуацу ацуацуацуацу фыывфвыффы ыфвфыв adfsafas asfasf fasfasfa afsfasf fasfasf asfas\n"
                    + "dasdasdasd adssadasdas",
            R.drawable.fast3)
    )
}



