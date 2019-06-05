package com.example.listaasistencia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.listaasistencia.modelo.Cursos;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorCursp extends RecyclerView.Adapter<AdaptadorCursp.ViewHolderCursos>
{

    private final Context context;
    private List<Cursos> lista;

    public AdaptadorCursp(Context context, List<Cursos> a) {
        this.context=context;
        this.lista=a;
    }

    @NonNull
    @Override
    public ViewHolderCursos onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_curso,
                viewGroup,false);
        return new ViewHolderCursos(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCursos viewHolderCursos, int i) {
        Cursos curso = lista.get(1);
        viewHolderCursos.txtNombreCurso.setText(curso.getNombre());
        viewHolderCursos.txtPorcentajeCurso.setText("Asistencia: "+curso.getPorcentaje());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolderCursos
    extends RecyclerView.ViewHolder{
        TextView txtNombreCurso;
        TextView txtPorcentajeCurso;
        CircleImageView imagen;

        public ViewHolderCursos(@NonNull View itemView) {
            super(itemView);
            txtNombreCurso=(TextView)itemView.findViewById(R.id.txtNombreCurso);
            txtPorcentajeCurso=(TextView)itemView.findViewById(R.id.txtPorcentajeCurso);
            imagen=(CircleImageView)itemView.findViewById(R.id.imgCurso);
        }
    }
}
