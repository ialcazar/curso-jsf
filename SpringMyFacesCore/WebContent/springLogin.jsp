<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="functions" %>

<%@ taglib uri="http://java.sun.com/jsf/html" prefix="jsf-html" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="jsf-core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h1>Login Usuario. Utilizacion de Beans de Spring en Jsf</h1>
	<jsf-core:view>
		<jsf-html:form>
			<jsf-html:panelGrid columns="2">
				<jsf-html:outputText value="Username"></jsf-html:outputText>
				<jsf-html:inputText id="username" value="#{springLogin.username}"></jsf-html:inputText>
				<jsf-html:outputText value="Password"></jsf-html:outputText>
				<jsf-html:inputSecret id="password" value="#{springLogin.password}"></jsf-html:inputSecret>
				<jsf-html:commandButton action="#{springLogin.action}" value="Aceptar"></jsf-html:commandButton>
			</jsf-html:panelGrid>
		</jsf-html:form>
	</jsf-core:view>
</body>
</html>