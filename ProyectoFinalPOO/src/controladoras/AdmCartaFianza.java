
package controladoras;

import java.util.Calendar;
import modelos.*;

public class AdmCartaFianza {
    
    public CartaFianza generarData(){
        
        String numDocumento = "CF001";
        String numContrato = "21245";
        Banco bancoEmisor = new Banco("Banco de Crédito");
        String tipo = "Inicio";
        Proveedor proveedor = new Proveedor("ABC");
        String numProceso = "";
        double importe = 120.00;
        Calendar miCalendar = Calendar.getInstance();
        int diaHoy = miCalendar.get(Calendar.DAY_OF_MONTH);
        int mes = miCalendar.get(Calendar.MONTH);
        int año = miCalendar.get(Calendar.YEAR);
        String fechaVencimiento = diaHoy + "/" + mes + "/" + año;
        Responsable responsable = new Responsable("Ebert", "Contador");
        String comentario = "Comentario de prueba";
                
        CartaFianza objCarta = new CartaFianza(numDocumento, proveedor);
        
        objCarta.setNumDocumento(numDocumento);
        objCarta.setNumContrato(numContrato);
        objCarta.setBancoEmisor(bancoEmisor);
        objCarta.setTipo(tipo);
        objCarta.setProveedor(proveedor);
        objCarta.setNumProcesoSel(numProceso);
        objCarta.setImporte(importe);
        objCarta.setFechaven(fechaVencimiento);
        objCarta.setResponsable(responsable);
        objCarta.setComentario(comentario);
        
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
