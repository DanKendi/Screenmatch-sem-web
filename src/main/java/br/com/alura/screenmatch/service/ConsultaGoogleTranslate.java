package br.com.alura.screenmatch.service;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class ConsultaGoogleTranslate {
    public static String obterTraducao(String texto){

        String apiKey = "AIzaSyAUH0lq2_dn4DjnmlMGkaEE0jkC4yH5A5o";

        Translate translate = TranslateOptions.newBuilder().setApiKey(apiKey).build().getService();

        // Translates some text into Portuguese
        Translation translation = translate.translate(texto, Translate.TranslateOption.targetLanguage("pt"));

        return translation.getTranslatedText();
    }

}
