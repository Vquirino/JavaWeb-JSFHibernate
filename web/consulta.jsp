<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<f:view>
    
    <h:outputText value="Manter dados dos Clientes"/>
    <hr size="1"/>
    
    <h:form id="formulario">
        
        <h:dataTable border="1" value="#{ManagedBean.dados}" var="c">
            
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Código"/>
                </f:facet>
                <h:outputText value="#{c.idcliente}"/>
            </h:column>
            
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Nome do Cliente"/>
                </f:facet>
                <h:inputText id="nome" value="#{c.nome}"/>
            </h:column>
            
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Email"/>
                </f:facet>
                <h:inputText id="email" value="#{c.email}"/>
            </h:column>
            
            <h:column>
                <f:facet name="header">
                    <h:outputText value="Operações"/>
                </f:facet>
                <h:commandButton value="Excluir" actionListener="#{ManagedBean.excluir}">
                    <f:param name="excluir" id="excluir" value="#{c}"/>
                </h:commandButton>
                <h:commandButton value="Atualizar" actionListener="#{ManagedBean.atualizar}">
                    <f:param name="atualizar" id="atualizar" value="#{c}"/>
                </h:commandButton>
            </h:column>
            
        </h:dataTable>
        
        <h:messages/>
        
    </h:form>
    
</f:view>
    
<a href="index.jsp">Voltar</a>