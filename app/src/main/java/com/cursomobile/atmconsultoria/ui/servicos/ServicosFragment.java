package com.cursomobile.atmconsultoria.ui.servicos;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cursomobile.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class ServicosFragment extends Fragment {



    public ServicosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        String descricao = "Descubra uma experiência gastronômica excepcional no restaurante \"Deleia Marmitas\"! Com uma culinária cuidadosamente preparada, ingredientes frescos e um ambiente acolhedor, estamos prontos para encantar o seu paladar.\n" +
                "\n" +
                "Nosso cardápio diversificado oferece uma variedade de pratos deliciosos, desde os clássicos favoritos até criações únicas do chef. Venha saborear o sabor da comida feita com paixão e dedicação.\n" +
                "\n" +
                "Além da nossa incrível comida, oferecemos um serviço impecável para tornar a sua refeição ainda mais especial. Seja para um jantar romântico, um encontro com amigos ou uma ocasião especial, o \"Deleia Marmitas\" está aqui para atender às suas necessidades. \n" +
                "\n" +
                "Faça sua reserva hoje e desfrute de uma experiência gastronômica memorável no \"Deleia Marmitas\". Esperamos recebê-lo em breve!";

        return new AboutPage(getActivity())
                .isRTL(false)
                .setDescription(descricao)

                .create();
    }
}