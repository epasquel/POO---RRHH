package controladoras;

import java.util.ArrayList;
import java.util.Calendar;
import modelos.*;

public class AdmRecordatorio extends AdmDocumentos {

    @Override
    public String adicionar() {
        return "Nuevo documento";
    }
    
    @Override
    public String adicionarUsuarioYNotificar(Documento documento, ArrayList<Usuario> listaUsuarios) {
        String usuariosAsignados = "";
        documento.setListUsuario(listaUsuarios);
        for (Usuario usuario : documento.getListUsuario()){
            usuariosAsignados = usuariosAsignados + ((usuariosAsignados.equals("")) ? "" : ",") + usuario.getNombre();
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
        ArrayList<Recordatorio> listaRecordatorio = simularTabla();
        Recordatorio objRecordatorio = null;
        for (Recordatorio recordatorio: listaRecordatorio){
            if(recordatorio.getNumDocumento().equals(numDocumento)){                
                objRecordatorio = recordatorio;
            }
        }
        return objRecordatorio;
    }
    

    @Override
    public Documento editar(String numDocumento) {
        ArrayList<Recordatorio> listaRecordatorio = simularTabla();
        Recordatorio objRecordatorio = null;
        for (Recordatorio recordatorio: listaRecordatorio){
            if(recordatorio.getNumDocumento().equals(numDocumento)){ 
                if (recordatorio.getResponsable() == null){
                    objRecordatorio = recordatorio;
                }
            }
        }
        return objRecordatorio;
    }

    @Override
    public String eliminar(String numDocumento) {
        String mensaje = "";
        ArrayList<Recordatorio> listaRecordatorio = simularTabla();        
        for (Recordatorio recordatorio: listaRecordatorio){
            if(recordatorio.getNumDocumento().equals(numDocumento)){                 
                mensaje = "Se ha eliminado el Recordatorio " + recordatorio.getNumDocumento();
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

   public ArrayList<Recordatorio> simularTabla(){
   
       ArrayList<Recordatorio> listRecordatorio = new ArrayList<Recordatorio>();

        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        Recordatorio objRecordatorio = new Recordatorio(new TareaGeneral("Limpieza de aulas", fechaVencimiento, new Responsable("Miguel", "Conserje")),fechaVencimiento, new Responsable("Miguel", "Conserje"));
        objRecordatorio.setNumDocumento("R001");
        objRecordatorio.setEstado("No iniciado");
        objRecordatorio.setFechaven(fechaVencimiento);
        listRecordatorio.add(objRecordatorio);
        
        objRecordatorio = new Recordatorio(new TareaGeneral("Construccion de pared frontal", fechaVencimiento, new Responsable("Joaquin", "Albanil")),fechaVencimiento, new Responsable("Joaquin", "Albanil"));
        objRecordatorio.setNumDocumento("R002");
        objRecordatorio.setEstado("No iniciado");
        objRecordatorio.setFechaven(fechaVencimiento);
        listRecordatorio.add(objRecordatorio);      
       
        return listRecordatorio;
   }
    
    public Recordatorio generarData(){
        
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        Recordatorio objRecordatorio = new Recordatorio(new TareaGeneral("Trabajo en jardineria", fechaVencimiento, new Responsable("Floresmilo", "Jardinero")),fechaVencimiento, new Responsable("Miguel", "Conserje"));
        objRecordatorio.setNumDocumento("R003");
        objRecordatorio.setEstado("No iniciado");
        objRecordatorio.setFechaven(fechaVencimiento);
        
        return objRecordatorio;
    }
       
    public Boolean verificarCamposObligatoriosParaGrabarRecordatorio(Recordatorio recordatorio){
        Boolean succes = false;
        if ((verificarSiRecordatorioTieneTarea(recordatorio) == true) &
            (verificarSiRecordatorioTieneFechaDeVencimiento(recordatorio) == true) &
            (verificarSiRecordatorioTieneUnResponsable(recordatorio) == true)){
            succes = true;
        }
        return succes;
    } 
    
    public Boolean verificarSiRecordatorioTieneNumeroDocumento(Recordatorio recordatorio){
        Boolean succes = false;
        if (recordatorio.getNumDocumento() != null){
            succes = true;
        }
        return succes;
    }
     
    public Boolean verificarSiRecordatorioTieneTarea(Recordatorio recordatorio){
        Boolean succes = false;
        if (recordatorio.getTarea() != null){
            succes = true;
        }
        return succes;        
    }
    
    public Boolean verificarSiRecordatorioTieneFechaDeVencimiento(Recordatorio recordatorio){
        Boolean succes = false;
        if (recordatorio.getFechaven() != null){
            succes = true;
        }
        return succes;            
    }
    
    public Boolean verificarSiRecordatorioTieneUnResponsable(Recordatorio recordatorio){
        Boolean succes = false;
        if (recordatorio.getResponsable() != null){
            succes = true;
        }
        return succes;            
    }
    
    public Boolean verificarSiRecordatorioTieneUnEstado(Recordatorio recordatorio){
        Boolean succes = false;
        if (recordatorio.getEstado() != null){
            succes = true;
        }
        return succes;            
    }
    
    public String verificarListaDeUsuarios(Recordatorio recordatorio){
        
        String listaUsuarios = "";
        for (Usuario usuario: recordatorio.getListUsuario()){
            listaUsuarios = listaUsuarios + ((listaUsuarios == "")? "" : ",") +  usuario.getNombre();
        }
        return listaUsuarios;
    }
    
        public Recordatorio generarDataSinResponsable(){
        
        //Responsable responsable = new Responsable("Ebert", "Administrador");
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;   
        
        Recordatorio objRecordatorio = new Recordatorio(new TareaGeneral("Trabajo en jardineria", fechaVencimiento, new Responsable("Floresmilo", "Jardinero")), fechaVencimiento, null);
        
        String numDocumento = "R005";
        String estado = "No iniciado";
        
        objRecordatorio.setNumDocumento(numDocumento);
        objRecordatorio.setEstado(estado);             
        
        return objRecordatorio;
    } 
        
    public Recordatorio generarDataConUsuariosAsignados(){
        
        Responsable responsable = new Responsable("Panchita", "Cocinera");
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;  
        
        Recordatorio objRecordatorio = new Recordatorio(new TareaGeneral("Trabajo en comedor", fechaVencimiento, new Responsable("Panchita", "Cocinera")), fechaVencimiento, responsable);
        
        String numDocumento = "T004";
        String estado = "No iniciado";
        objRecordatorio.setNumDocumento(numDocumento);
        objRecordatorio.setEstado(estado);           
        
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
        objRecordatorio.setListUsuario(listUsuarios);
        
        return objRecordatorio;
    }
        
}
