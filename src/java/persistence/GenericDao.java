package persistence;

import java.util.*;
import org.hibernate.*;

public class GenericDao {
    
    protected Session s;
    protected Transaction t;
    protected Criteria c;
    
    public void salvar(Object obj)throws Exception{
        s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
        s.save(obj);
        t.commit();
    }
    
    public void excluir(Object obj)throws Exception{
        s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
        s.delete(obj);
        t.commit();
    }
    
    public void atualizar(Object obj)throws Exception{
        s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
        s.update(obj);
        t.commit();
    }
    
    public List<Object> listar(Class tipo)throws Exception{
        s = HibernateUtil.getSessionFactory().openSession();
        c = s.createCriteria(tipo);
        return c.list();
    }
}
