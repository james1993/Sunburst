package com.example.sunburst.data

import com.example.sunburst.R
import com.example.sunburst.model.Sunburst

class Datasource {

    fun loadStrings(): List<Sunburst>{
        return listOf<Sunburst>(
                Sunburst(R.string.being1, R.drawable.image1),
                Sunburst(R.string.being2, R.drawable.image2),
                Sunburst(R.string.being3, R.drawable.image3),
                Sunburst(R.string.transcendentals1, R.drawable.image4),
                Sunburst(R.string.transcendentals2, R.drawable.image5),
                Sunburst(R.string.transcendentals3, R.drawable.image6),
                Sunburst(R.string.transcendentals4, R.drawable.image7),
                Sunburst(R.string.transcendentals5, R.drawable.image8),
                Sunburst(R.string.transcendentals6, R.drawable.image9),
        )
    }
}