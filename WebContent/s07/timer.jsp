<%@ page import="java.time.LocalTime"%> <!-- questo mi crea un servlet come nella timer.java in s.07, è un modo alternativo per crearsi un servlet, guarda index opzione /edwpot/s07/timer.jsp -->
<!DOCTYPE html>	<!-- devo fare l import perche LocalTime non fa parte della libreria standard di java -->
<html>
<head>
<meta charset="utf-8">
<title>Hello JSP</title>
</head>
<body>
    <h1>
        <%
            out.print(LocalTime.now());
        %>
    </h1>
</body>
</html>