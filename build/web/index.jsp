<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<f:view>
    
    <h:form id="formulario">
        
        <ul>
            <li> <h:commandLink value="Cadastrar Cliente" action="cadastrar"/> </li>
            <li> <h:commandLink value="Manter dados de Cliente" action="consultar"/> </li>
        </ul>
        
    </h:form>
    
</f:view>