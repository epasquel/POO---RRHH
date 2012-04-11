
package controladoras;

/*import java.util.Calendar;*/
import appinterfaces.IDocumento;
import java.util.ArrayList;
import java.util.Calendar;
import modelos.*;

public class AdmDeclaracionJurada extends AdmDocumentos{

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
        ArrayList<DeclaracionJurada> listaDeclaracionJurada = simularTabla();
        DeclaracionJurada objDeclaracion = null;
        for (DeclaracionJurada declaracionJurada: listaDeclaracionJurada){
            if(declaracionJurada.getNumDocumento().equals(numDocumento)){                
                objDeclaracion = declaracionJurada;
            }
        }
        return objDeclaracion;
    }

    @Override
    public Documento editar(String numDocumento) {
        ArrayList<DeclaracionJurada> listaDeclaracionJurada = simularTabla();
        DeclaracionJurada objDeclaracion = null;
        for (DeclaracionJurada declaracionJurada: listaDeclaracionJurada){
            if(declaracionJurada.getNumDocumento().equals(numDocumento)){ 
                if (declaracionJurada.getResponsable() == null){
                    objDeclaracion = declaracionJurada;
                }
            }
        }
        return objDeclaracion;
    }

    @Override
    public String eliminar(String numDocumento) {
        String mensaje = "";
       ArrayList<DeclaracionJurada> listaDeclaracionJurada = simularTabla();     
        for (DeclaracionJurada declaracionJurada: listaDeclaracionJurada){
            if(declaracionJurada.getNumDocumento().equals(numDocumento)){                 
                mensaje = "Se ha eliminado la Carta Fianza " + declaracionJurada.getNumDocumento();
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

    
    public ArrayList<DeclaracionJurada> simularTabla(){
   
       ArrayList<DeclaracionJurada> listDeclaracionJurada = new ArrayList<DeclaracionJurada>();

        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        DeclaracionJurada objDeclaracion = new DeclaracionJurada("Inicio",fechaVencimiento, new Responsable("Ebert", "Contador"));
        objDeclaracion.setFechaReferencia(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setFechaAsumpcion(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setComentario("Comentario de prueba");
        objDeclaracion.setFechaPublicacion(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setFechaDocumento(diaHoy + "/" + mes + "/" + año); 
        objDeclaracion.setNumDocumento("DC001");
        listDeclaracionJurada.add(objDeclaracion);
        
        objDeclaracion = new DeclaracionJurada("Inicio",fechaVencimiento, new Responsable("Carlos", "Contador"));
        objDeclaracion.setFechaReferencia(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setFechaAsumpcion(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setComentario("Comentario de prueba");
        objDeclaracion.setFechaPublicacion(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setFechaDocumento(diaHoy + "/" + mes + "/" + año);
        objDeclaracion.setNumDocumento("DC002");
        listDeclaracionJurada.add(objDeclaracion);        
       
        return listDeclaracionJurada;
   }
    
   
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
    
    
    public DeclaracionJurada generarDataConUsuariosAsignados(){
        
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
        
        AdmUsuario admUsuario = new AdmUsuario();
        ArrayList<Usuario> listUsuarios = new ArrayList<Usuario>();
        Usuario usuario = admUsuario.existeUsuario("sklante");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        usuario = admUsuario.existeUsuario("acuru");
        if (usuario != null){
        listUsuarios.add(usuario);
        }
        objDec.setListUsuario(listUsuarios);
        
        return objDec;
    }    
    
    public DeclaracionJurada generarDataSinResponsable(){
        
        //Responsable responsable = new Responsable("Ebert", "Administrador");
        String tipo = "Inicio";
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;        
        DeclaracionJurada objDec = new DeclaracionJurada(tipo, fechaVencimiento, null);
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
