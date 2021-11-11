package com.test.amplitudedemo

import android.app.Application
import android.content.Context
import com.amplitude.api.Amplitude
import com.amplitude.api.Identify
import org.json.JSONException
import org.json.JSONObject


fun Context.initAmplitude(application: Application){
    Amplitude.getInstance().initialize(this, getString(R.string.AmplitudeApiKey)).enableForegroundTracking(
        application
    )
}

fun productClickLogEvent(
    itemName: String,
    itemGeneric: String,
    itemManufacturer: String,
    itemSkuType: String,
    itemType: String
){
    val productProperties = JSONObject()
    try {
        productProperties.put("item_name", itemName)
        productProperties.put("item_generic", itemGeneric)
        productProperties.put("item_manufacturer", itemManufacturer)
        productProperties.put("item_sku_type", itemSkuType)
        productProperties.put("item_type", itemType)
    } catch (exception: JSONException) {
    }
    Amplitude.getInstance().logEvent("Clicked_On_Product", productProperties)
}

fun addedToCartLogEvent(
    itemName: String,
    itemGeneric: String,
    itemManufacturer: String,
    itemSkuType: String,
    itemType: String
){
    val productProperties = JSONObject()
    try {
        productProperties.put("item_name", itemName)
        productProperties.put("item_generic", itemGeneric)
        productProperties.put("item_manufacturer", itemManufacturer)
        productProperties.put("item_sku_type", itemSkuType)
        productProperties.put("item_type", itemType)
    } catch (exception: JSONException) {
    }
    Amplitude.getInstance().logEvent("Added_to_cart", productProperties)
}

fun placeOrderLogEvent(
    itemName: String,
    itemGeneric: String,
    itemManufacturer: String,
    itemSkuType: String,
    itemType: String
){
    val productProperties = JSONObject()
    try {
        productProperties.put("item_name", itemName)
        productProperties.put("item_generic", itemGeneric)
        productProperties.put("item_manufacturer", itemManufacturer)
        productProperties.put("item_sku_type", itemSkuType)
        productProperties.put("item_type", itemType)
    } catch (exception: JSONException) {
    }
    Amplitude.getInstance().logEvent("place_order", productProperties)
}

fun identifyUser(key: String,value: String){
    val identify = Identify().set(key, value)
    Amplitude.getInstance().identify(identify)
}