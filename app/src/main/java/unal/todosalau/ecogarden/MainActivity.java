package unal.todosalau.ecogarden;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import unal.todosalau.ecogarden.clases.Jardin;
import unal.todosalau.ecogarden.clases.Planta;
import unal.todosalau.ecogarden.clases.Usuario;
import unal.todosalau.ecogarden.enumeraciones.TipoPlanta;

public class MainActivity extends AppCompatActivity {

    private TextView answer;

    // Ejemplo de datos de prueba
    private List<Usuario> usuarios;
    private List<Planta> catalogoPlantas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.answer);

        // Inicializar los datos de prueba
        usuarios = new ArrayList<>();
        catalogoPlantas = new ArrayList<>();

        // Crear algunas plantas de ejemplo
        Planta planta1 = new Planta("Orquídea", TipoPlanta.ARBUSTIVA, "Moderado", "Alta", "Alta");
        Planta planta2 = new Planta("Rosa", TipoPlanta.ARBUSTIVA, "Moderado", "Alta", "Media");
        Planta planta3 = new Planta("Tomate", TipoPlanta.HERBACEA, "Alto", "Alta", "Baja");

        // Agregar las plantas al catálogo de plantas
        catalogoPlantas.add(planta1);
        catalogoPlantas.add(planta2);
        catalogoPlantas.add(planta3);

        // Crear un usuario de ejemplo con un jardín
        Jardin jardin1 = new Jardin(new ArrayList<>(), "Diseño 1");
        jardin1.getPlantas().add(planta1);
        jardin1.getPlantas().add(planta2);

        Usuario usuario1 = new Usuario("Juan", new ArrayList<>(), "Logros 1");
        usuario1.getPlantas().add(planta1);

        // Agregar el usuario a la lista de usuarios
        usuarios.add(usuario1);

        Button registroCuidadoPlantasButton = findViewById(R.id.registroCuidadoPlantasButton);
        registroCuidadoPlantasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes realizar las operaciones relacionadas con el registro de cuidado de plantas
                answer.setText("Registro de cuidado de plantas: Aquí podrás mantener un registro de tus plantas y recibir recordatorios personalizados para regar, fertilizar y podar.");
            }
        });

        Button informacionSostenibilidadButton = findViewById(R.id.informacionSostenibilidadButton);
        informacionSostenibilidadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes obtener información sobre sostenibilidad
                answer.setText("Información sobre sostenibilidad: Aquí podrás aprender sobre prácticas sostenibles, como el compostaje, la captación de agua de lluvia y el uso de energías renovables en el jardín.");
            }
        });

        Button catalogoPlantasButton = findViewById(R.id.catalogoPlantasButton);
        catalogoPlantasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes mostrar el catálogo de plantas
                StringBuilder plantasText = new StringBuilder("Catálogo de plantas:\n\n");
                for (Planta planta : catalogoPlantas) {
                    plantasText.append("- Nombre: ").append(planta.getNombre()).append("\n");
                    plantasText.append("  Tipo: ").append(planta.getTipo()).append("\n");
                    plantasText.append("  Necesidades de agua: ").append(planta.getNecesidadesAgua()).append("\n");
                    plantasText.append("  Necesidades de luz: ").append(planta.getNecesidadesLuz()).append("\n");
                    plantasText.append("  Contribución a la biodiversidad: ").append(planta.getContribucionBiodiversidad()).append("\n\n");
                }
                answer.setText(plantasText.toString());
            }
        });

        Button planificadorJardinesButton = findViewById(R.id.planificadorJardinesButton);
        planificadorJardinesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes implementar el planificador de jardines
                answer.setText("Planificador de jardines: Aquí podrás diseñar tu propio jardín virtual y visualizar cómo se vería antes de implementarlo en la vida real.");
            }
        });

        Button estadisticasLogrosButton = findViewById(R.id.estadisticasLogrosButton);
        estadisticasLogrosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes mostrar las estadísticas y logros del usuario
                StringBuilder estadisticasText = new StringBuilder("Estadísticas y logros:\n\n");
                for (Usuario usuario : usuarios) {
                    estadisticasText.append("- Usuario: ").append(usuario.getNombre()).append("\n");
                    estadisticasText.append("  Diseños: ").append(usuario.getJardines()).append("\n\n");
                }
                answer.setText(estadisticasText.toString());
            }
        });
    }
}