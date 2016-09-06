<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<f:view>
    
    <h:outputText value="Cadastro de Cliente"/>
    <hr size="1" />
    
    <h:form id="formulario">
        
        <h:outputLabel value="Nome do Cliente:" for="name"/> <br/>
        <h:inputText id="nome" value="#{ManagedBean.cliente.nome}"/>
        <br/><br/>
        
        <h:outputLabel value="Email:" for="email"/> <br/>
        <h:inputText id="email" value="#{ManagedBean.cliente.email}"/>
        <br/><br/>
        
        <h:commandButton value="Cadastrar Cliente" action="#{ManagedBean.cadastrar}"/>
        <h:messages/>
        
    </h:form>
    
</f:view>
        
<a href="index.jsp">Voltar</a>