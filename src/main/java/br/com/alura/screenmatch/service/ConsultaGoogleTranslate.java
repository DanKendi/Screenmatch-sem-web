//package br.com.alura.screenmatch.service;
//
//import com.google.cloud.translate.Translate;
//import com.google.cloud.translate.TranslateOptions;
//import com.google.cloud.translate.Translation;
//
//public class ConsultaGoogleTranslate {
//    public static String obterTraducao(String texto){
//
//<<<<<<< HEAD
//        String apiKey = System.getenv("GOOGLE_APIKEY");
//=======
//        String apiKey = "API_KEY";
//>>>>>>> 9af86267c33d9359b6162321a42035940f2c2f5b
//
//        Translate translate = TranslateOptions.newBuilder().setApiKey(apiKey).build().getService();
//
//        // Translates some text into Portuguese
//        Translation translation = translate.translate(texto, Translate.TranslateOption.targetLanguage("pt"));
//
//        return translation.getTranslatedText();
//    }
//
//}
