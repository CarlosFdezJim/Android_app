package pro.luisserrano.mistagram;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import pro.luisserrano.mistagram.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;
    FirebaseAuth auth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //TODO(4): COMPLETED inicializar el atributo auth a la instancia de FirebaseAuth
        auth = FirebaseAuth.getInstance();
        //TODO(5): COMPLETED a txtSignUp ponerle un listener que cuando se haga click lance la actividad RegisterActivity
        binding.txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


        binding.login.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProgressDialog pd = showProgressDialog(LoginActivity.this);

                String email = binding.username.getText().toString();
                String password = binding.password.getText().toString();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, getText(R.string.fields_required), Toast.LENGTH_SHORT).show();
                } else {
                    auth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Users")
                                                .child(auth.getCurrentUser().getUid());
                                        reference.addValueEventListener(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                //TODO(6a): COMPLETED Dejar de mostrar el progress dialog y crear un objeto intent de la clase Intent para lanzar MainActivity
                                                pd.dismiss();
                                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                                startActivity(intent);
                                                finish();
                                            }

                                            @Override
                                            public void onCancelled(@NonNull DatabaseError error) {
                                                //TODO(6b): COMPLETED Dejar de mostrar el progress dialog
                                                pd.dismiss();
                                            }
                                        });
                                    } else {
                                        //TODO(7): COMPLETED Dejar de mostrar el progress dialog y mostrar un toast con el texto authentication failed
                                        pd.dismiss();
                                        Toast.makeText(LoginActivity.this, getText(R.string.no_register), Toast.LENGTH_SHORT).show();
                                    }

                                }
                            });
                }
            }
        });
    }

    ProgressDialog showProgressDialog(Context context) {
        final ProgressDialog pd = new ProgressDialog(LoginActivity.this);
        pd.setMessage(context.getString(R.string.wait));
        pd.show();
        return pd;
    }
}
