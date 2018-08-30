import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList<Alumno> alumnos;
    
    public Laboratorio()
    {
        alumnos = new ArrayList<Alumno>();
    }
    
    public void inscribir(Alumno alumno)
    {
        alumnos.add(alumno);
    }
    
    public void Baja(String claveBaja)
    {
        for(int i = 0; i < alumnos.size(); i++)
        {
            Alumno aux = alumnos.get(i);
            if(aux.dimeClave() == claveBaja)
            {
                alumnos.remove(i);
            }
        }
    }
    
    public void imprimir()
    {
        for(int i = 0; i < alumnos.size(); i++)
        {
            Alumno aux = alumnos.get(i);
            System.out.println(aux.dimeNombre() + "====" + aux.dimeClave());
        }
    }
}
