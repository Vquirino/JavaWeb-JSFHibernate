package control;

import entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import persistence.GenericDao;

public class ManagedBean {
    
    private Cliente cliente;
    private List<Cliente> dados;

    public ManagedBean() {
        cliente = new Cliente();
        dados = new ArrayList<Cliente>();
    }
    
    public void cadastrar(){
        
        //No JSF todo o procedimento de requisiçõ feitas pelo usuário à
        //esta classe utiliza como meio de resposta o FacesContext.
        
        FacesContext c = FacesContext.getCurrentInstance();
        
        try{
            
            new GenericDao().salvar(cliente);
            cliente = new Cliente();
            
            FacesMessage m = new FacesMessage("Cliente cadastrado com sucesso!");
            c.addMessage("formulario", m);
            
            
        }
        catch(Exception e){
            FacesMessage m = new FacesMessage(e.getMessage());
            c.addMessage("formulario", m);
        }
        
    }
    
    public void excluir(javax.faces.event.ActionEvent ae){
        
        FacesContext c = FacesContext.getCurrentInstance();
        
        try{
            
            UIParameter p = (UIParameter) ae.getComponent().findComponent("excluir");
            new GenericDao().excluir(p.getValue());
            
            FacesMessage m = new FacesMessage("Cliente excluido com sucesso!");
            c.addMessage("formulario", m);
        }
        catch(Exception e){
            FacesMessage m =new FacesMessage(e.getMessage());
            c.addMessage("formulario", m);
        }
        
    }
    
    public void atualizar(javax.faces.event.ActionEvent ae){
        
        FacesContext c = FacesContext.getCurrentInstance();
        
        try{
            
            UIParameter p = (UIParameter) ae.getComponent().findComponent("atualizar");
            new GenericDao().atualizar(p.getValue());
            
            FacesMessage m = new FacesMessage("Cliente atualizado com sucesso!");
            c.addMessage("formulario", m);
            
        }
        catch(Exception e){
            FacesMessage m = new FacesMessage(e.getMessage());
            c.addMessage("formulario", m);
        }
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public List<Cliente> getDados() {
        
        try{
            dados.clear();
            for(Object obj : new GenericDao().listar(Cliente.class)){
                dados.add((Cliente)obj);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return dados;
    }

    public void setDados(List<Cliente> dados) {
        this.dados = dados;
    }
    
    
}
