package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cabecalho.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("      <head>\n");
      out.write("              \n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pagina JSP 1</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/corIndex.css\">\n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
 //Gera data e hora
        Date date = new Date();
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");    
     
        String dataFormat = fmt.format(date);    
    
   
      out.write("\n");
      out.write("   <div id=\"dataHora\">\n");
      out.write("       <h1>Cálculo de IMC </h1> \n");
      out.write("          <h2>(índice de massa corpórea)</h2>\n");
      out.write("            <p>");
      out.print(dataFormat);
      out.write("</p>\n");
      out.write("   </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("     <br>\n");
      out.write("             <div class=\"quad\">\n");
      out.write("                 <br>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <form name=\"forms1\" action=\"receber.jsp\" method=\"post\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Dados</legend>\n");
      out.write("                <label for=peso\">Peso em Kg</label>\n");
      out.write("                <input class=\"form-control form-control-lg\" id=\"peso\" name=\"RePeso\" type=\"number\" min=\"0.1\" max=\"1000\" step=\"0.01\" value=\"\" placeholder=\"Peso\" required>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <label for=altura\">Altura em metros</label>\n");
      out.write("                <input class=\"form-control form-control-lg\" id=\"altura\" name=\"ReAltura\" type=\"number\" min=\"0.1\" max=\"5\" step=\"0.01\" value=\"\" placeholder=\"Altura\" required>\n");
      out.write("                <br>\n");
      out.write("                              \n");
      out.write("                <center><input type=\"submit\" class=\"btn btn-primary\" name=\"enviar\" value=\"Enviar\"></center>\n");
      out.write("              \n");
      out.write("                </fieldset>\n");
      out.write("             </form>           \n");
      out.write("            <br>        \n");
      out.write("          </div>\n");
      out.write("     \n");
      out.write("      <br> \n");
      out.write("       \n");
      out.write("     <script src=\"JS/jsIndex.js\"></script>      \n");
      out.write("            \n");
      out.write("     <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
