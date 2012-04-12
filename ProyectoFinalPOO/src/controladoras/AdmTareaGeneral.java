package controladoras;

/*import java.util.Calendar;*/
import java.util.ArrayList;
import java.util.Calendar;
import modelos.*;

public class AdmTareaGeneral extends AdmDocumentos{

    @Override
    public String adicionar() {
        return "Nuevo documento";
    }

    @Override
    public String adicionarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios) {
        String usuariosAsignados = "";
        documento.setListUsuario(listaUsuarios);
        for (Usuario usuario : documento.getListUsuario()){
            usuariosAsignados = usuariosAsignados + ((usuariosAsignados == "") ? "" : ",") + usuario.getNombre();
        }
        return usuariosAsignados;
    }

    @Override
    public Documento asignarTarea(Documento documento, Responsable responsable) {
        if (responsable != null){
            documento.setResponsable(responsable);
        }
      return documento;
    }

    @Override
    public Documento buscar(String numDocumento) {
        ArrayList<TareaGeneral> listaTareaGeneral = simularTabla();
        TareaGeneral objTareaGeneral = null;
        for (TareaGeneral tareaGeneral: listaTareaGeneral){
            if(tareaGeneral.getNumDocumento().equals(numDocumento)){                
                objTareaGeneral = tareaGeneral;
            }
        }
        return objTareaGeneral;
    }

    @Override
    public Documento editar(String numDocumento) {
        ArrayList<TareaGeneral> listaTareaGeneral = simularTabla();
        TareaGeneral objTareaGeneral = null;
        for (TareaGeneral tareaGeneral: listaTareaGeneral){
            if(tareaGeneral.getNumDocumento().equals(numDocumento)){ 
                if (tareaGeneral.getResponsable() == null){
                    objTareaGeneral = tareaGeneral;
                }
            }
        }
        return objTareaGeneral;
    }

    @Override
    public String eliminar(String numDocumento) {
        String mensaje = "";
       ArrayList<TareaGeneral> listaTareaGeneral = simularTabla();     
        for (TareaGeneral tareaGeneral: listaTareaGeneral){
            if(tareaGeneral.getNumDocumento().equals(numDocumento)){                 
                mensaje = "Se ha eliminado la Tarea General " + tareaGeneral.getNumDocumento();
            }
        }
        return mensaje;
    }

    @Override
    public String eliminarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios) {
        String usuariosEliminados = "";
        //documento.setListUsuario(listaUsuarios);
        for (Usuario usuario : documento.getListUsuario()){
            usuariosEliminados = usuariosEliminados + ((usuariosEliminados == "") ? "" : ",") + usuario.getNombre();
        }        
        
        documento.getListUsuario().removeAll(listaUsuarios);            
        return usuariosEliminados;
    }

    
    public ArrayList<TareaGeneral> simularTabla(){
   
       ArrayList<TareaGeneral> listTareaGeneral = new ArrayList<TareaGeneral>();

        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        TareaGeneral objTareaGeneral = new TareaGeneral("Primera tarea",fechaVencimiento, new Responsable("Agustin", "Contador"));
        objTareaGeneral.setNumDocumento("T001");
        objTareaGeneral.setComentario("Comentario Tarea General de prueba");
        listTareaGeneral.add(objTareaGeneral);
        
        objTareaGeneral = new TareaGeneral("Segunda tarea",fechaVencimiento, new Responsable("Miguel", "Contador"));
        objTareaGeneral.setNumDocumento("T002");
        objTareaGeneral.setComentario("Comentario de prueba");        
        listTareaGeneral.add(objTareaGeneral);        
       
        return listTareaGeneral;
   }
    
   
    public TareaGeneral generarData(){
        
        Responsable responsable = new Responsable("Agustin", "Administrador");
        String asunto = "Asunto Tarea General";
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
        
        TareaGeneral objTarea = new TareaGeneral(asunto, fechaVencimiento, responsable);
        
        String comentario = "Comentario de prueba";
        String numDocumento = "T003";
        
        objTarea.setNumDocumento(numDocumento);
        objTarea.setComentario(comentario);
        
        return objTarea;
    }
    
    /////////////////////////////////////////////////////////
    
    public TareaGeneral generarDataConUsuariosAsignados(){
        
        Responsable responsable = new Responsable("Agustin", "Administrador");
        String asunto = "Asunto Tareas Generales";
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;  
        
        TareaGeneral objTarea = new TareaGeneral(asunto, fechaVencimiento, responsable);
        
        String numDocumento = "T004";
        String comentario = "Comentario de prueba";
        objTarea.setNumDocumento(numDocumento);
        objTarea.setComentario(comentario);           
        
        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("epasquel");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("crengifo");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        objTarea.setListUsuario(listUsuarios);
        
        return objTarea;
    }    
    
    public TareaGeneral generarDataSinResponsable(){
        
        //Responsable responsable = new Responsable("Ebert", "Administrador");
        String asunto = "Nueva tarea general";
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;   
        
        TareaGeneral objTarea = new TareaGeneral(asunto, fechaVencimiento, null);
        
        String numDocumento = "T005";
        String comentario = "Comentario de prueba";
        
        objTarea.setNumDocumento(numDocumento);
        objTarea.setComentario(comentario);             
        
        return objTarea;
    }    
    
    public Boolean verificarSiTareaGeneralTieneResponsable(TareaGeneral tareaGeneral){
        Boolean succes = false;
        if (tareaGeneral.getResponsable() != null){
            succes = true;
        }
        return succes;
    }
    
    
    public Boolean verificarSiTareaGeneralTieneAsunto(TareaGeneral tareaGeneral){
        Boolean succes = false;
        if (tareaGeneral.getAsunto() != null){
            succes = true;
        }
        return succes;
    }
        
    public Boolean verificarSiTareaGeneralTieneFechaDeVencimiento(TareaGeneral tareaGeneral){
        Boolean succes = false;
        if (tareaGeneral.getFechaven() != null){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarCamposObligatoriosParaGrabarTarea(TareaGeneral tareaGeneral){
        Boolean succes = false;
        if ((verificarSiTareaGeneralTieneFechaDeVencimiento(tareaGeneral) == true) & (verificarSiTareaGeneralTieneResponsable(tareaGeneral) == true) & (verificarSiTareaGeneralTieneAsunto(tareaGeneral) == true)){
            succes = true;
        }
        return succes;
    }
    
    public String verificarListaDeUsuarios(TareaGeneral tareaGeneral){
        
        String listaUsuarios = "";
        for (Usuario usuario: tareaGeneral.getListUsuario()){
            listaUsuarios = listaUsuarios + ((listaUsuarios == "")? "" : ",") +  usuario.getNombre();
        }
        return listaUsuarios;
    }
    
}
