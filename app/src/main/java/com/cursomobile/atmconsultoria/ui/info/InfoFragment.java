package com.cursomobile.atmconsultoria.ui.info;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cursomobile.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class InfoFragment extends Fragment {

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // return inflater.inflate(R.layout.fragment_info, container, false);
        String descricao = "Bem-vindo ao Deleia Marmitas, o seu " +
                "refúgio gastronômico para uma experiência culinária verdadeiramente excepcional. Localizado no coração da cidade, o nosso restaurante combina a elegância do ambiente com a riqueza dos sabores que oferecemos em cada prato. Nossa equipe de chefs talentosos e dedicados trabalha incansavelmente para criar pratos que despertam os sentidos e satisfazem os paladares mais exigentes. Com uma carta de vinhos selecionada cuidadosamente para complementar cada refeição, além de um serviço impecável, estamos comprometidos em proporcionar a você momentos memoráveis. Seja para uma ocasião especial, um encontro romântico ou uma refeição casual entre amigos, o &quot;Deleia Marmitas&quot; é o lugar onde os sabores se encontram e as histórias são criadas. Estamos ansiosos " +
                "para recebê-lo em nossa casa e compartilhar nossa paixão pela culinária com você.";

        return new AboutPage(getActivity())
                .isRTL(false)
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .create();
    }
}