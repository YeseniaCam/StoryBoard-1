import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class StoryBoard extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");        
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'/>");
        out.println("<title>Storyboard</title>");
        out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' integrity='sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm' crossorigin='anonymous'>");
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/fabric.js/1.1.0/fabric.all.min.js' ></script>");
        out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js'></script>");
        out.println("<script src='./jss/canvas.js'></script>");
        out.println("<script src='./jss/jscolor.js'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
        out.println("<script src='https://code.jquery.com/jquery-3.2.1.min.js'></script>");
        out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js' integrity='sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q' crossorigin='anonymous'></script>");
        out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js' integrity='sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl' crossorigin='anonymous'></script>");
        out.println("<link rel='stylesheet' href='./css/css1.css'>");   
        out.println("<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.0.12/css/all.css' integrity='sha384-G0fIWCsCzJIMAVNQPfjH08cyYaUtMwjJwqiRKxxE/rx96Uroj1BtIQ6MLJuheaO9' crossorigin='anonymous'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container-fluid'>");
        out.println("<div class='page-header'>");
        out.println("<h1>Historia</h1>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='container-fluid'>");
        out.println("<div class='text-center'>");
        out.println("<div class='row'>");
        out.println("<div class='col-sm-1 my-auto'>");
        out.println("<button id='bprev' class='btn btn-info'>");
        out.println("<span class='glyphicon glyphicon-chevron-left'>Prev</span>");
        out.println("</button>");
        out.println("</div>");
        out.println("<div class='col-sm-10 my-auto'>");
        out.println("<canvas id='canvas'style='border:1px solid black;' width='1040' height='550'></canvas>");
        out.println("</div>");
        out.println("<div class='col-sm-1 my-auto'>");
        out.println("<button id='bsig' class='btn btn-info'>");
        out.println("<span class='glyphicon glyphicon-chevron-right'>Next</span>");
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
        out.println("<div class='row'>");
        out.println("<div class='dropdown'>");
        out.println("<button class='btn btn-secondary dropdown-toggle' type='button' id='dropdownMenu2' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>");
        out.println("Jardineria");
        out.println("</button>");
        out.println("<div class='dropdown-menu' aria-labelledby='dropdownMenu2'>");
        out.println("<div class='btn-group container-fluid'>");
        out.println("<button id='button1' class='btn btn-info'>Circulo</button>");
        out.println("<button id='button2' class='btn btn-info'>Rectangulo</button>");
        out.println("<button id='button3' class='btn btn-info'>Linea</button>");
        out.println("<button id='button4' class='btn btn-info'><img src='png/002-bee.png' alt='' class='img-responsive' width='60' height='60'/></button>");
        out.println("<button id='button5' class='btn btn-info'><img src='png/001-gloves.png' alt='' class='img-responsive' width='60' height='60'/></button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='row'>");
        out.println("<div class='btn-group container-fluid'>");
        out.println("<button id='button6' class='btn btn-info'>SVG</button>");
        out.println("<button id='button7' class='btn btn-info'>SVG</button>");
        out.println("<button id='button8' class='btn btn-info'>SVG</button>");
        out.println("<button id='button9' class='btn btn-info'>SVG</button>");
        out.println("<button id='button10' class='btn btn-info'>SVG</button>");
        out.println("<button id='button11' class='btn btn-info'>SVG</button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<button id='save' class ='btn btn-success'>Save</button>");
        out.println("</body>");
        out.println("</html>");
    }
}
