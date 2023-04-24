package com.chobo.selectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.chobo.selectimage.databinding.ActivityMapsBinding
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Google Maps Android API 초기화
        MapsInitializer.initialize(this, MapsInitializer.Renderer.LATEST) {
            //println(it.name)
        }
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        settingButton()
//        mMap.setOnMarkerClickListener {marker ->
//            val data = marker.tag as Data
//            true
//        }
        // Add a marker in Sydney and move the camera
        val pohang = LatLng(36.0863, 129.3492)

        val postech = LatLng(36.0139, 129.3232)
        mMap.addMarker(MarkerOptions()
            .position(postech)
            .title("포항공대")
            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(postech))

        val jaeil = LatLng(35.99089228, 129.3537129)
        mMap.addMarker(MarkerOptions()
            .position(jaeil)
            .title("(주)신제일종합정비")
            .snippet("거리 : 10km"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jaeil))

        val youngsin = LatLng(36.06157867, 129.4015838)
        mMap.addMarker(MarkerOptions()
            .position(youngsin)
            .title("신영신종합자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(youngsin))

        val koreawide = LatLng(36.07792744, 129.3589324)
        mMap.addMarker(MarkerOptions()
            .position(koreawide)
            .title("주식회사 코리아와이드포항"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(koreawide))

        val samil = LatLng(35.98867941, 129.3849146)
        mMap.addMarker(MarkerOptions()
            .position(samil)
            .title("(주)삼일이알씨"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(samil))

        val pojung = LatLng(35.99000707, 129.3849146)
        mMap.addMarker(MarkerOptions()
            .position(pojung)
            .title("(주)포항정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pojung))

        val hyundai = LatLng(35.99927974, 129.3539305)
        mMap.addMarker(MarkerOptions()
            .position(hyundai)
            .title("현대자동차(주)포항서비스센터"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hyundai))

        val yangduk = LatLng(36.10302445, 129.3715941)
        mMap.addMarker(MarkerOptions()
            .position(yangduk)
            .title("양덕종합모터스"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yangduk))

        val credit = LatLng(35.94851848, 129.402774)
        mMap.addMarker(MarkerOptions()
            .position(credit)
            .title("(주)크레딧모터스"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(credit))

        val kia = LatLng(36.02964285, 129.3663965)
        mMap.addMarker(MarkerOptions()
            .position(kia)
            .title("기아자동차(주)포항서비스센터"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kia))

        val duma = LatLng(36.07759841, 129.3794249)
        mMap.addMarker(MarkerOptions()
            .position(duma)
            .title("두마자동차종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(duma))

        val jail = LatLng(35.98964456, 129.3558525)
        mMap.addMarker(MarkerOptions()
            .position(jail)
            .title("자일포항서비스(주)"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(jail))

        val terminal = LatLng(36.01226435, 129.3482617)
        mMap.addMarker(MarkerOptions()
            .position(terminal)
            .title("터미널자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(terminal))

        val sindong = LatLng(36.10816893, 129.3569061)
        mMap.addMarker(MarkerOptions()
            .position(sindong)
            .title("신동아정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sindong))

        val hanjin = LatLng(36.00414136, 129.3711293)
        mMap.addMarker(MarkerOptions()
            .position(hanjin)
            .title("(주)한진포항자동차정비공장"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hanjin))

        val chunglim = LatLng(35.99380213, 129.4034999)
        mMap.addMarker(MarkerOptions()
            .position(chunglim)
            .title("청림종합정비(주)"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chunglim))

        val hana = LatLng(35.99713476, 129.3585457)
        mMap.addMarker(MarkerOptions()
            .position(hana)
            .title("(주)하나모터스"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hana))

        val cj = LatLng(35.99805259, 129.3657402)
        mMap.addMarker(MarkerOptions()
            .position(cj)
            .title("씨제이대한통운(주)포항지점정비공장"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cj))

        val asung = LatLng(36.04556331, 129.3196729)
        mMap.addMarker(MarkerOptions()
            .position(asung)
            .title("아성자동차정비공장"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(asung))

        val dongbu = LatLng(35.99968332, 129.361265)
        mMap.addMarker(MarkerOptions()
            .position(dongbu)
            .title("(주)신동부종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dongbu))

        val taeguk = LatLng(36.12255909, 129.3413092)
        mMap.addMarker(MarkerOptions()
            .position(taeguk)
            .title("태극종합자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(taeguk))

        val gwangmyung = LatLng(35.99376437, 129.3561968)
        mMap.addMarker(MarkerOptions()
            .position(gwangmyung)
            .title("광명종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gwangmyung))

        val bukpohang = LatLng(36.17957645, 129.3402183)
        mMap.addMarker(MarkerOptions()
            .position(bukpohang)
            .title("북포항현대자동차서비스(주)"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bukpohang))

        val hyeondai = LatLng(36.05908221, 129.3461241)
        mMap.addMarker(MarkerOptions()
            .position(hyeondai)
            .title("현대오토종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hyeondai))

        val kyungbuk = LatLng(35.99372573, 129.4029965)
        mMap.addMarker(MarkerOptions()
            .position(kyungbuk)
            .title("(주)경북정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kyungbuk))

        val lnsamsung = LatLng(35.99779524, 129.3529949)
        mMap.addMarker(MarkerOptions()
            .position(lnsamsung)
            .title("르노삼성자동차포항정비사업소(주)"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lnsamsung))

        val indong = LatLng(35.95440433, 129.3686793)
        mMap.addMarker(MarkerOptions()
            .position(indong)
            .title("(주)인동티에스"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(indong))

        val deokwu = LatLng(36.04966099, 129.3337818)
        mMap.addMarker(MarkerOptions()
            .position(deokwu)
            .title("덕우종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(deokwu))

        val bukjong = LatLng(36.06302798, 129.3529527)
        mMap.addMarker(MarkerOptions()
            .position(bukjong)
            .title("북포항종합자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bukjong))

        val erc = LatLng(35.99763186, 129.4078738)
        mMap.addMarker(MarkerOptions()
            .position(erc)
            .title("(주)인동이알씨"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(erc))

        val younghwa = LatLng(35.98991856, 129.3525436)
        mMap.addMarker(MarkerOptions()
            .position(younghwa)
            .title("(주)영화정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(younghwa))

        val geumsung = LatLng(35.99507747, 129.3552159)
        mMap.addMarker(MarkerOptions()
            .position(geumsung)
            .title("금성자동차종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(geumsung))

        val donga = LatLng(36.08395079, 129.3312923)
        mMap.addMarker(MarkerOptions()
            .position(donga)
            .title("동아종합자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(donga))

        val myungsung = LatLng(35.99998532, 129.360387)
        mMap.addMarker(MarkerOptions()
            .position(myungsung)
            .title("명성자동차검사정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(myungsung))

        val donghae = LatLng(36.03154826, 129.3587731)
        mMap.addMarker(MarkerOptions()
            .position(donghae)
            .title("동해자동차공업(주)"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(donghae))

        val geosung = LatLng(36.10266955, 129.3707707)
        mMap.addMarker(MarkerOptions()
            .position(geosung)
            .title("거성자동차종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(geosung))

        val poja = LatLng(36.04292478, 129.3474549)
        mMap.addMarker(MarkerOptions()
            .position(poja)
            .title("포항자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(poja))

        val hajong = LatLng(35.96338185, 129.4215597)
        mMap.addMarker(MarkerOptions()
            .position(hajong)
            .title("하나종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hajong))

        val gangwon = LatLng(35.998469, 129.353371)
        mMap.addMarker(MarkerOptions()
            .position(gangwon)
            .title("강원자동차공업사"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gangwon))

        val hanil = LatLng(35.99593194, 129.3652688)
        mMap.addMarker(MarkerOptions()
            .position(hanil)
            .title("(주)한일공업"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hanil))

        val wonil = LatLng(36.0639253, 129.3525888)
        mMap.addMarker(MarkerOptions()
            .position(wonil)
            .title("원일종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wonil))

        val youngpo = LatLng(35.99293248, 129.3570812)
        mMap.addMarker(MarkerOptions()
            .position(youngpo)
            .title("영포자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(youngpo))

        val edong = LatLng(35.99088877, 129.3552598)
        mMap.addMarker(MarkerOptions()
            .position(edong)
            .title("이동종합정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(edong))

        val gm = LatLng(36.06063731, 129.3539334)
        mMap.addMarker(MarkerOptions()
            .position(gm)
            .title("한국지엠북포항서비스센터"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gm))

        val daemyung = LatLng(36.05759289, 129.3481926)
        mMap.addMarker(MarkerOptions()
            .position(daemyung)
            .title("대명종합자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(daemyung))

        val yn = LatLng(35.99682944, 129.4137257)
        mMap.addMarker(MarkerOptions()
            .position(yn)
            .title("(주)영남정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yn))

        val tw = LatLng(35.99686753, 129.3543555)
        mMap.addMarker(MarkerOptions()
            .position(tw)
            .title("(주)태원자동차정비"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tw))




        val cameraPosition = CameraPosition.Builder()
            .target(pohang)
            .zoom(11f)
            .build()
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))


    }

    private fun settingButton() {
        val btnNext2 = findViewById<Button>(R.id.btnNext2)
        btnNext2.setOnClickListener {
            //subactivity3 로 이동.
            //intent : 의지, 지황, 의도
            val intent = Intent(this, SubActivity3::class.java)
            startActivity(intent)
        }
    }
}