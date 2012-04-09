
package controladoras;

/*import java.util.Calendar;*/
import java.util.Calendar;
import modelos.DeclaracionJurada;
import modelos.Responsable;
import modelos.Usuario;

public class AdmDeclaracionJurada {
    
   
    public DeclaracionJurada generarData(){
        
        Responsable responsable = new Responsable("Ebert", "Administrador");
        String tipo = "Inicio";
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;        
        DeclaracionJurada objDec = new DeclaracionJurada(tipo, fechaVencimiento, responsable);
        String fechaReferencia = diaHoy + "/" + mes + "/" + año;
        String fechaAsumpcion = diaHoy + "/" + mes + "/" + año;
        String comentario = "Comentario de prueba";
        String fechaPublicacion = diaHoy + "/" + mes + "/" + año;
        String fechaDocumento = diaHoy + "/" + mes + "/" + año;
        String numDocumento = "DC001";
        objDec.setFechaReferencia(fechaReferencia);
        objDec.setFechaAsumpcion(fechaAsumpcion);
        objDec.setComentario(comentario);
        objDec.setFechaPublicacion(fechaPublicacion);
        objDec.setFechaDocumento(fechaDocumento);
        objDec.setNumDocumento(numDocumento);       
        
        return objDec;
    }
    
    
    
    public Boolean verificarSiDeclaracionJuradaTieneResponsable(DeclaracionJurada declaracionJurada){
        Boolean succes = false;
        if (declaracionJurada.getResponsable() != null){
            succes = true;
        }
        return succes;
    }
    
    
    public Boolean verificarSiDeclaracionJuradaTieneTipo(DeclaracionJurada declaracionJurada){
        Boolean succes = false;
        if (declaracionJurada.getTipo() != null){
            succes = true;
        }
        return succes;
    }
        
    public Boolean verificarSiDeclaracionJuradaTieneFechaDeVencimiento(DeclaracionJurada declaracionJurada){
        Boolean succes = false;
        if (declaracionJurada.getFechaven() != null){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarCamposObligatoriosParaGrabarTarea(DeclaracionJurada declaracionJurada){
        Boolean succes = false;
        if ((verificarSiDeclaracionJuradaTieneFechaDeVencimiento(declaracionJurada) == true) & (verificarSiDeclaracionJuradaTieneResponsable(declaracionJurada) == true) & (verificarSiDeclaracionJuradaTieneTipo(declaracionJurada) == true)){
            succes = true;
        }
        return succes;
    }
    
    public String verificarListaDeUsuarios(DeclaracionJurada declaracionJurada){
        
        String listaUsuarios = "";
        for (Usuario usuario: declaracionJurada.getListUsuario()){
            listaUsuarios = listaUsuarios + ((listaUsuarios == "")? "" : ",") +  usuario.getNombre();
        }
        return listaUsuarios;
    }
    
    
}
