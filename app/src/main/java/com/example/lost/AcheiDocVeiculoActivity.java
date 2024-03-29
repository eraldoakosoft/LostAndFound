package com.example.lost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lostfound.R;
import com.example.lost.config.ConfiguracaoFireBase;
import com.example.lost.helper.Base64Custon;
import com.example.lost.model.DocumentoVeiculo;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AcheiDocVeiculoActivity extends AppCompatActivity {


    private EditText nome;
    private EditText cpf;
    private EditText placa;
    private EditText modelo;
    private Button adicionar;

    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference("DocVeiculo");

    private DocumentoVeiculo documentoVeiculo;

    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achei_doc_veiculo);

        nome = findViewById(R.id.editDVNomeCompleto);
        cpf = findViewById(R.id.editDVCPF);
        placa = findViewById(R.id.editPlaca);
        modelo = findViewById(R.id.editModelo);
        adicionar = findViewById(R.id.btnDVAdicionar);

        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarDV();
            }
        });





    }

    public void adicionarDV(){

        firebaseAuth = ConfiguracaoFireBase.getFirebaseAutenticacao();
        documentoVeiculo = new DocumentoVeiculo();
        documentoVeiculo.setNome(nome.getText().toString());
        documentoVeiculo.setCPF(cpf.getText().toString());
        documentoVeiculo.setModelo(modelo.getText().toString());
        documentoVeiculo.setPlaca(placa.getText().toString());
        String idUsuario = Base64Custon.codificarBase64(firebaseAuth.getCurrentUser().getEmail());
        documentoVeiculo.setQuemAchou(idUsuario);
        documentoVeiculo.setStatus(true);
        documentoVeiculo.setData_entrada(getDateTime());
        documentoVeiculo.setData_saida("");

        reference.push().setValue(documentoVeiculo);
        Toast.makeText(AcheiDocVeiculoActivity.this, "Salvo Com Sucesso!",Toast.LENGTH_SHORT).show();
        finish();




    }


    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
