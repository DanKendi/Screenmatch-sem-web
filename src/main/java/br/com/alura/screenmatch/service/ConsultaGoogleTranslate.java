package br.com.alura.screenmatch.service;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class ConsultaGoogleTranslate {
    public static String obterTraducao(String texto){

        String apiKey = System.getenv("GOOGLE_APIKEY");

        Translate translate = TranslateOptions.newBuilder().setApiKey(apiKey).build().getService();

        // Translates some text into Portuguese
        Translation translation = translate.translate(texto, Translate.TranslateOption.targetLanguage("pt"));

        return translation.getTranslatedText();
    }

}
