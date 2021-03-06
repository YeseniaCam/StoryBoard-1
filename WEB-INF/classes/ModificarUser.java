import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ModificarUser extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        String ruta = request.getSession().getServletContext().getRealPath("/xml/Usuarios.xml");
        ListUsers users = new ListUsers(ruta);
        User usertomodify = users.getOneUser(user);
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es' class='h-100'>");
        out.println("<head>");
        out.println("<title>Administrador</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' crossorigin='anonymous'>");
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/fabric.js/1.1.0/fabric.all.min.js' ></script>");
        out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
        out.println("<script src='./jss/validatemodification.js'></script>");
        out.println("<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>");
        out.println("<link rel='stylesheet' href='//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css'>");
        out.println("<link rel='stylesheet' href='./css/login.css' type='text/css'>");
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.0.12/css/all.css' integrity='sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9' crossorigin='anonymous'>");
        out.println("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");
        out.println("<title>Document</title>");
        out.println("</head>");
        out.println("<body class='h-100'>");
        out.println("<nav class='navbar navbar-expand-lg navbar-dark' style='background: #3E6DB1'>");
        out.println("<a class='navbar-brand' href='#'>Navbar</a>");
        out.println("<ul class='navbar-nav mr-auto'>");
        out.println("<li class='nav-item active'>");
        out.println("<a class='nav-link'>Inicio</a>");
        out.println("</li>");
  
        out.println("</ul>");
        out.println("<ul class='navbar-nav ml-auto'>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='login.html'><i class='fas fa-sign-out-alt'></i></a>");
        out.println("</li>");
        out.println("</ul>");
        out.println("</nav>");
        out.println("<div class='container-fluid h-100'>");
        out.println("<div class='row justify-content-center h-100'>");
        out.println("<div class='col-2' style='background: rgb(33, 37, 41)'>");
        
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='pb-2 mt-4 mb-2 border-bottom' style='font-family: Snell Roundhand, cursive;' align='center'>");
        out.println("<h3><b>StoryOnline</b></h3>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='pb-2 mt-4 mb-2' >");
        out.println("<div class='container'>");
        out.println("<ul class='nav flex-column'>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='AltasBajasCambios'>Altas, Bajas y Cambios</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='#'>Agregar Grupos</a>");
        out.println("</li>");
        out.println("</ul>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='col-10' style='background: rgb(255, 255, 255)'>");
        out.println("<div class='container'>");
        out.println("<br/>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='col-4'>");
        out.println("<h1>Modificar Usuario</h1>");
        
        out.println("<form action = './UpdateModify' method = 'get' id='form1'>");
        out.println("<div class='form-group'>");
        out.println("<label for='inputName'>Nombre</label>");
        out.println("<input type='text' name='nombre' class='form-control' id='inputName' value ='"+usertomodify.name+"'>");
        out.println("<label for='inputCorreo'>Correo</label>");
        out.println("<input type='text' name='correo' class='form-control' id='inputCorreo' value ='"+usertomodify.correo+"'>");
        out.println("<input type='text' name='usuario' class='form-control' id='inputUser' value ='"+usertomodify.username+"'>");
        out.println("<label for='inputUser2'>Usuario</label>");
        out.println("<input type='text' name='seconduser' class='form-control' id='inputUser2' value ='"+usertomodify.username+"'>");
        out.println("<label for='inputPass'>Contraseña</label>");
        out.println("<input type='password' name='contrasena1' class='form-control' id='inputPass' value ='"+usertomodify.password+"'>");
        out.println("<label for='inputPass2'>Reingresa la Contraseña</label>");
        out.println("<input type='password' name='contrasena2' class='form-control' id='inputPass2' >");
        out.println("<label for='inputType'>Tipo de Usuario</label>");
        out.println("<div class='input-group'>");
        out.println("<select class='form-control' name='tipo' value = '"+usertomodify.tipo+"'>");
        out.println("<option value='Estudiante'>Estudiante</option>");
        out.println("<option value='Profesor'>Profesor</option>");
        out.println("<option value='Administrador'>Administrador</option>");
        out.println("</select>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='row justify-content-center'>");
        out.println("<button class='btn buttonregister' type='submit'><i class='fas fa-save'></i></button>");
        out.println("</div>");
        out.println("</form>");

        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div id='dialog-message' title='Error'>");
        out.println("<p id ='dialogmessage'></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");     
        request.setAttribute("XML",users);   
    }
}
