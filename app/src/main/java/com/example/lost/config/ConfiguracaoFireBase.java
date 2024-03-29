package com.example.lost.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ConfiguracaoFireBase {
    private static FirebaseAuth autenticacao;
    private static DatabaseReference firebase;

    //RETORNA A ISNTANCIA DO FIREBASEDATABASE
    public static DatabaseReference getFirebase(){
        if(firebase == null){
            firebase = FirebaseDatabase.getInstance().getReference();
        }
        return firebase;
    }

    // RETORNA A INSTANCIA DO FIREBASE
    public static FirebaseAuth getFirebaseAutenticacao(){
        if(autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }

        return autenticacao;


    }



}
