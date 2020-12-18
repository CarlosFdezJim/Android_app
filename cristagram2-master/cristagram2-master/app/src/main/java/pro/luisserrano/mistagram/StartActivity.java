package pro.luisserrano.mistagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import pro.luisserrano.mistagram.databinding.ActivityStartBinding;

public class StartActivity extends AppCompatActivity {

    Button login, register;
    FirebaseUser firebaseUser;
    private ActivityStartBinding binding;

    @Override
    protected void onStart() {
        super.onStart();

        //TODO(31) COMPLETED Inicializar firebaseUser al actual usuario de Firebase, si el usuario está autenticado (no es null) lanzar la actividad MainActivity y finalizar la actividad actual.
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if(firebaseUser != null){
            Intent intent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intent);
            this.finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        binding = ActivityStartBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //TODO(32): COMPLETED Crear dos listener para el evento click para login y register que lleven a LoginActivity y RegisterActivity respectivamente
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,LoginActivity.class);
                startActivity(intent);
            }

        });
        binding.register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}