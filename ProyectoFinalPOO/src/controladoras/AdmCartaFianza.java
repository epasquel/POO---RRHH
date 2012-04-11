
package controladoras;

import appinterfaces.IDocumento;
import java.util.ArrayList;
import java.util.Calendar;
import modelos.*;

public class AdmCartaFianza extends AdmDocumentos{

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
        ArrayList<CartaFianza> listaCartaFianza = simularTabla();
        CartaFianza objCarta = null;
        for (CartaFianza cartaFianza: listaCartaFianza){
            if(cartaFianza.getNumDocumento().equals(numDocumento)){                
                objCarta = cartaFianza;
            }
        }
        return objCarta;
    }

    @Override
    public Documento editar(String numDocumento) {
        ArrayList<CartaFianza> listaCartaFianza = simularTabla();
        CartaFianza objCarta = null;
        for (CartaFianza cartaFianza: listaCartaFianza){
            if(cartaFianza.getNumDocumento().equals(numDocumento)){ 
                if (cartaFianza.getResponsable() == null){
                    objCarta = cartaFianza;
                }
            }
        }
        return objCarta;
    }

    @Override
    public String eliminar(String numDocumento) {
        String mensaje = "";
        ArrayList<CartaFianza> listaCartaFianza = simularTabla();        
        for (CartaFianza cartaFianza: listaCartaFianza){
            if(cartaFianza.getNumDocumento().equals(numDocumento)){                 
                mensaje = "Se ha eliminado la Carta Fianza " + cartaFianza.getNumDocumento();
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

   public ArrayList<CartaFianza> simularTabla(){
   
       ArrayList<CartaFianza> listCartaFianza = new ArrayList<CartaFianza>();

        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        CartaFianza objCarta = new CartaFianza("CF001", new Proveedor("ABC"));
        objCarta.setNumContrato("21245");
        objCarta.setBancoEmisor(new Banco("Banco de Crédito"));
        objCarta.setTipo("Inicio");
        objCarta.setNumProcesoSel("5646543");
        objCarta.setImporte(120.00);
        objCarta.setFechaven(fechaVencimiento);
        objCarta.setResponsable(new Responsable("Ebert", "Contador"));
        objCarta.setComentario("Comentario de prueba");
        listCartaFianza.add(objCarta);
        
        objCarta = new CartaFianza("CF002", new Proveedor("XYZ"));
        objCarta.setNumContrato("21245");
        objCarta.setBancoEmisor(new Banco("Banco Financiero"));
        objCarta.setTipo("Inicio");
        objCarta.setNumProcesoSel("5434334");
        objCarta.setImporte(310.00);
        objCarta.setFechaven(fechaVencimiento);
        objCarta.setResponsable(null);
        objCarta.setComentario("Comentario de prueba");
        listCartaFianza.add(objCarta);        
       
        return listCartaFianza;
   }
    
    public CartaFianza generarData(){
        
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        CartaFianza objCarta = new CartaFianza("CF001", new Proveedor("ABC"));
        objCarta.setNumContrato("21245");
        objCarta.setBancoEmisor(new Banco("Banco de Crédito"));
        objCarta.setTipo("Inicio");
        objCarta.setProveedor(new Proveedor("ABC"));
        objCarta.setNumProcesoSel("36423673");
        objCarta.setImporte(120.00);
        objCarta.setFechaven(fechaVencimiento);
        objCarta.setResponsable(new Responsable("Ebert", "Contador"));
        objCarta.setComentario("Comentario de prueba");
        
        return objCarta;
    }
    
    
    public CartaFianza generarDataConUsuariosAsignados(){
        
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        CartaFianza objCarta = new CartaFianza("CF001", new Proveedor("ABC"));
        objCarta.setNumContrato("21245");
        objCarta.setBancoEmisor(new Banco("Banco de Crédito"));
        objCarta.setTipo("Inicio");
        objCarta.setProveedor(new Proveedor("ABC"));
        objCarta.setNumProcesoSel("36423673");
        objCarta.setImporte(120.00);
        objCarta.setFechaven(fechaVencimiento);
        objCarta.setResponsable(new Responsable("Ebert", "Contador"));
        objCarta.setComentario("Comentario de prueba");
        
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
        
        objCarta.setListUsuario(listUsuarios);
        
        return objCarta;
    }
    
  
    
    public CartaFianza generarDataSinResponsable(){
        
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
                
        CartaFianza objCarta = new CartaFianza("CF001", new Proveedor("ABC"));
        objCarta.setNumContrato("21245");
        objCarta.setBancoEmisor(new Banco("Banco de Crédito"));
        objCarta.setTipo("Inicio");
        objCarta.setProveedor(new Proveedor("ABC"));
        objCarta.setNumProcesoSel("36423673");
        objCarta.setImporte(120.00);
        objCarta.setFechaven(fechaVencimiento);
        //objCarta.setResponsable(new Responsable("Ebert", "Contador"));
        objCarta.setComentario("Comentario de prueba");
        
        return objCarta;
    }
    
    public Boolean verificarSiCartaFianzaTieneNumeroDocumento(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getNumDocumento() != null){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarSiCartaFianzaTieneProveedor(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getProveedor() != null){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarCamposObligatoriosParaGrabarTarea(CartaFianza cartaFianza){
        Boolean succes = false;
        if ((verificarSiCartaFianzaTieneNumeroDocumento(cartaFianza) == true) & (verificarSiCartaFianzaTieneProveedor(cartaFianza) == true)){
            succes = true;
        }
        return succes;
    }    
    
    public Boolean verificarSiCartaFianzaTieneNumContrato(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getNumContrato() != null){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarSiCartaFianzaTieneUnBancoEmisor(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getBancoEmisor() != null){
            succes = true;
        }
        return succes;
    }
    
    public Boolean verificarSiCartaFianzaTieneTipo(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getTipo() != null){
            succes = true;
        }
        return succes;        
    }
    
    public Boolean verificarSiCartaFianzaTieneImporte(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getImporte() != 0.00){
            succes = true;
        }
        return succes;        
    }
    
    public Boolean verificarSiCartaFianzaTieneFechaDeVencimiento(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getFechaven() != null){
            succes = true;
        }
        return succes;            
    }
    
    public Boolean verificarSiCartaFianzaTieneUnResponsable(CartaFianza cartaFianza){
        Boolean succes = false;
        if (cartaFianza.getResponsable() != null){
            succes = true;
        }
        return succes;            
    }
    
    
    public Boolean verificarCamposObligatoriosParaAsignarLaTarea(CartaFianza cartaFianza){
        Boolean succes = false;
        if ((verificarSiCartaFianzaTieneNumeroDocumento(cartaFianza) == true) & 
            (verificarSiCartaFianzaTieneNumContrato(cartaFianza) == true) &
            (verificarSiCartaFianzaTieneUnBancoEmisor(cartaFianza) == true) &
            (verificarSiCartaFianzaTieneTipo(cartaFianza) == true) &
            (verificarSiCartaFianzaTieneProveedor(cartaFianza) == true) &
            (verificarSiCartaFianzaTieneImporte(cartaFianza) == true) &
            (verificarSiCartaFianzaTieneFechaDeVencimiento(cartaFianza) == true) &
            (verificarSiCartaFianzaTieneUnResponsable(cartaFianza) == true)){
            succes = true;
        }
        return succes;
    }
    
}
