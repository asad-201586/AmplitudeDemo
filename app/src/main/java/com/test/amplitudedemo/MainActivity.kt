package com.test.amplitudedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amplitude.api.Amplitude
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var data: ItemDataClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data = ItemDataClass()
        initAmplitude(application)
        identifyUser("Gender","Female")
        clickEvents()

    }

    private fun clickEvents() {
        button_create_event.setOnClickListener {
            Amplitude.getInstance().logEvent("Clicked_On_Product")
            toast("Event created")
        }

        button_product_event.setOnClickListener {

            setData()

            productClickLogEvent(
                itemName = "Acical-D",
                itemGeneric = "Paracetamol 500mg",
                itemManufacturer = "ACI Limited",
                itemSkuType = "Tablet",
                itemType = "Medicine"
            )
        }

        button_added_to_cart_event.setOnClickListener {
            addedToCartLogEvent(
                itemName = "Losectil 20",
                itemGeneric = "Azithromycin 500mg",
                itemManufacturer = "Sandoz Bangladesh Limited.",
                itemSkuType = "Tablet",
                itemType = "Medicine"
            )
        }

        button_place_order_event.setOnClickListener {
            placeOrderLogEvent(
                itemName = "Losectil 20",
                itemGeneric = "Azithromycin 500mg",
                itemManufacturer = "Sandoz Bangladesh Limited.",
                itemSkuType = "Tablet",
                itemType = "Medicine"
            )
        }

    }

    private fun setData() {
        data.itemName = "Acical D"
        data.itemGeneric = "Paracetamol 500mg"
        data.itemManufacturer = "ACI Limited"
        data.itemSkuType = "Tablet"
        data.itemType = "Medicine"
    }


}