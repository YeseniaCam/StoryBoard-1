import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.ArrayList;


public class Storyboardsprof extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        String ruta = request.getSession().getServletContext().getRealPath("./icons");
        Images imagenes =  new Images(ruta,"icons");
        List<Listas> totalimag = imagenes.generateLists();
        String nombre = request.getParameter("nombre_story");
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es' class=''>");
        out.println("<head>");
        out.println("<title>Administrador</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' crossorigin='anonymous'>");
        out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
        out.println("<script src='./jss/readXML.js'></script>");
        out.println("<link rel='stylesheet' href='./css/login.css' type='text/css'>");
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.0.12/css/all.css' integrity='sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9' crossorigin='anonymous'>");  
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/fabric.js/1.1.0/fabric.all.min.js' ></script>");
        out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js'></script>");
        out.println("<script src='./jss/canvas.js'></script>");
        out.println("<script src='./jss/jscolor.js'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
        out.println("<script src='https://code.jquery.com/jquery-3.2.1.min.js'></script>");
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q' crossorigin='anonymous'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js' integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl' crossorigin='anonymous'></script>");
        out.println("<link rel='stylesheet' href='./css/css1.css'>");   
        
        
        
        
        out.println("<meta http-equiv='X-UA-Compatible' content='ie=edge'>");
        out.println("<title>Document</title>");
        out.println("</head>");
        out.println("<body class=''>");
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
        out.println("<div class='container-fluid '>");
        out.println("<div class='row justify-content-center '>");
        out.println("<div class='col-2 ' id = 'scroll' style='background: rgb(33, 37, 41)'>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='pb-2 mt-4 mb-2 border-bottom' style='font-family: Snell Roundhand, cursive;' align='center'>");
        out.println("<h3><b>StoryOnline</b></h3>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='pb-2 mt-4 mb-2' >");
        out.println("<div class='container'>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='row justify-content-center'>");
        out.println("<div class='pb-2 mt-4 mb-2' >");
        out.println("<div class='container'>");
        out.println("<ul class='nav flex-column'>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='MainStoryBoards'>Storyboards</a>");
        out.println("</li>");
        out.println("</ul>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='col-10 ' style='background: rgb(255, 255, 255)'>");
        out.println("<div class='container '>");
        out.println("<br/>");
        
        
        out.println("<div class='container-fluid'>");
        out.println("<div class='page-header'>");
        out.println("<h1>"+nombre+"</h1>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='container-fluid'>");
        out.println("<div class='text-center'>");
        out.println("<div class='row'>");
        out.println("<div class='col-sm-1 my-auto'>");
        out.println("<button id='bprev' class='btn btn-info'>");
        out.println("<i class='fas fa-arrow-left'></i>");
        out.println("</button>");
        out.println("</div>");
        out.println("<div class='col-sm-10 my-auto'>");
        out.println("<canvas id='canvas'style='border:1px solid black;' width='820' height='550'></canvas>");
        out.println("</div>");
        out.println("<div class='col-sm-1 my-auto'>");
        out.println("<button id='bsig' class='btn btn-info'>");
        out.println("<i class='fas fa-arrow-right'></i>");
        out.println("</button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='container-fluid'>");
        out.println("<div class='text-center'>");
        out.println("<p id ='numpa'>Página: 1<p>");
        out.println("</div>");
        out.println("</div>");
        out.println("<br/>");
        out.println("Color de la Figura: <input id='shapecolor' class='jscolor' val ='ff0000' size ='2'>");
        out.println("<button id='clearboard' class='btn btn-danger' ><i class='fas fa-trash-alt'></i></button>");
        out.println("<button id='delete' class='btn btn-danger'><i class='fas fa-eraser'></i></button>");
        out.println("<br/>");
        out.println("<br/>");
        out.println("<div class='container-fluid'>");
        out.println("<div class='text-center'>");
        
        

        for (int i = 0; i < totalimag.size(); i++) {
            Listas l = totalimag.get(i);
            System.out.println(l.name);
            out.println("<div class='row'>");
            out.println("<div class='dropdown'>");
            out.println("<button class='btn btn-secondary showicons btn-categories' name='"+l.name+"'>");
            out.println(l.name);
            out.println("</button>");
            List<String> pnglist = (List<String>)l.PNGlList;
            List<String> svglist = (List<String>)l.SVGList;
            out.println("<div  class = 'containertohide' name = '"+l.name+"'>");
            out.println("<div>");
            out.println("<div class='btn-group container-fluid'>");
            for (int j = 0; j < pnglist.size(); j++) {
                String r = pnglist.get(j);
                String ruta2 = svglist.get(j);
                out.println("<div id ='1' class='btn btn-info iconos' name='"+r+"'><img src='"+r+"' alt='' class='img-responsive' width='60' height='60' draggable='true' /></div>");
                if ((j+1)%8==0) {
                    out.println("</div>");
                    out.println("</div>");
                    out.println("<div>");
                    out.println("<div class='btn-group container-fluid'>");  
                }
            }
            if((pnglist.size()+1)%8 != 0){
                out.println("</div>");
                out.println("</div>");
            }
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");

        
        }
        out.println("</div>");
        out.println("</div>");
        out.println("<form action=./SaveStoryBoard method ='post'>");
        out.println("<input hidden id='slides' type='text' name='slides' size='10'/>");
        out.println("<button id='save' type='submit' class ='btn btn-success'>Save</button>");
        out.println("</form>");

        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");        
    }
}
