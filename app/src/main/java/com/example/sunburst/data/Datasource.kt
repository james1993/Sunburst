package com.example.sunburst.data

import com.example.sunburst.R
import com.example.sunburst.model.Sunburst

class Datasource {

    fun loadStrings(): List<Sunburst>{
        return listOf<Sunburst>(
                Sunburst(R.string.being1),
                Sunburst(R.string.being2),
                Sunburst(R.string.being3),
                Sunburst(R.string.transcendentals1),
                Sunburst(R.string.transcendentals2),
                Sunburst(R.string.transcendentals3),
                Sunburst(R.string.transcendentals4),
                Sunburst(R.string.transcendentals5),
                Sunburst(R.string.transcendentals6),
        )
    }
}