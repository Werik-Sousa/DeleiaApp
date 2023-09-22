package com.cursomobile.atmconsultoria.ui.contato;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursomobile.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;


public class ContatoFragment extends Fragment {

    public ContatoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "Pedidos, orçamentos e duvidas, estamos disponiveis nos seguintes canais.";

        return new AboutPage(getActivity())
                .isRTL(false)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("deleiamarmitas@email.com", "Envie um e-mail")
                .addWebsite("https://www.linkedin.com/in/werik-sousa/", "Acesso nosso site")

                .addGroup("Redes Sociais")

                .addFacebook("https://facebook.com/")
                .addTwitter("https://twitter.com/")
                .addInstagram("medyo80")

                .addGroup("Desenvolvimento")
                .addGitHub("Werik-Sousa","Meu GitHub")

                .create();
    }
}