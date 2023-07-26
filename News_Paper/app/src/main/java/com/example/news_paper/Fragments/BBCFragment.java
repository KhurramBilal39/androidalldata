package com.example.news_paper.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.news_paper.R;


public class BBCFragment extends Fragment {



    public BBCFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  =  inflater.inflate(R.layout.fragment_b_b_c, container, false);

        WebView webView = view.findViewById(R.id.webViewbbc);
        webView.loadUrl("https://www.bbc.com/news");
        webView.setWebViewClient(new WebViewClient());

        return view;
    }
}