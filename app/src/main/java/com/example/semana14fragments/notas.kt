package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import com.example.semana14fragments.R
import kotlinx.android.synthetic.main.fragment_notas.*


class notas : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notas, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        webiew2.webChromeClient = object : WebChromeClient(){
        }
        webiew2.webViewClient = object : WebViewClient(){
        }
        val settings = webiew2.settings
        settings.javaScriptEnabled = true
        webiew2.loadUrl("https://estudiantes.ugb.edu.sv/Notas")
    }
}