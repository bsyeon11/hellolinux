/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.45
 * Generated at: 2019-11-05 06:46:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lecture_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"/temp.css\">\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/chat.png\"/>\r\n");
      out.write("    <title>HELLO UNIX</title>\r\n");
      out.write("<script>\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("    * {padding:0; margin:0;}\r\n");
      out.write("    header{\r\n");
      out.write("        height:180px;\r\n");
      out.write("        background-color: #244e80;\r\n");
      out.write("        background-image: url(img/water.jpg);\r\n");
      out.write("        margin:auto;\r\n");
      out.write("    }\r\n");
      out.write("    body{\r\n");
      out.write("        background-color: white;\r\n");
      out.write("        align-content: center;\r\n");
      out.write("    }\r\n");
      out.write("    li{\r\n");
      out.write("        list-style:none;\r\n");
      out.write("    }\r\n");
      out.write("    nav li{\r\n");
      out.write("    \tpadding: 2px;\r\n");
      out.write("    }\r\n");
      out.write("    .web-title{\r\n");
      out.write("    \theight:130px;\r\n");
      out.write("    \tpadding-top:20px;\r\n");
      out.write("    \tbackground-image: url(img/water.jpg);\r\n");
      out.write("    \tfont-family:impact;\r\n");
      out.write("    \tfont-size:45px;\r\n");
      out.write("    \tcolor: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .course-list::before{\r\n");
      out.write("        content:\"\";\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        width: 0;\r\n");
      out.write("        height: 0;\r\n");
      out.write("        border-top: 10px solid pink;\r\n");
      out.write("        border-right: 10px solid transparent;\r\n");
      out.write("    }\r\n");
      out.write("    a{\r\n");
      out.write("    \tcolor:black;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("    }\r\n");
      out.write("    .menu{\r\n");
      out.write("        display: block;\r\n");
      out.write("        color: #000;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("        line-height: 30px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        width:100px;\r\n");
      out.write("    }\r\n");
      out.write("    .menu:hover{\r\n");
      out.write("        color: #c0c0c0;\r\n");
      out.write("    }\r\n");
      out.write("    .web-menu{\r\n");
      out.write("        background-color: white\r\n");
      out.write("    }\r\n");
      out.write("    a:hover{\r\n");
      out.write("    \tcolor: #c0c0c0;\r\n");
      out.write("    }\r\n");
      out.write("    .course{\r\n");
      out.write("        float:right;\r\n");
      out.write("    }\r\n");
      out.write("    .course-btn{\r\n");
      out.write("        float:left;\r\n");
      out.write("        padding:20px;\r\n");
      out.write("        margin: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    .console{\r\n");
      out.write("        float:left;\r\n");
      out.write("        width: 200px;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("    }\r\n");
      out.write("    .console-btn{\r\n");
      out.write("        float:right;\r\n");
      out.write("        padding:20px;\r\n");
      out.write("        margin: 5px;\r\n");
      out.write("    }\r\n");
      out.write("    .btn{\r\n");
      out.write("        background-color:white;\r\n");
      out.write("        border:white;\r\n");
      out.write("        outline: none;\r\n");
      out.write("        line-height: 500px;\r\n");
      out.write("    }\r\n");
      out.write("    nav{\r\n");
      out.write("        float: left;\r\n");
      out.write("        margin:10px;\r\n");
      out.write("    }\r\n");
      out.write("    content{\r\n");
      out.write("        float: left;\r\n");
      out.write("        margin: 10px;\r\n");
      out.write("        width: 700px;\r\n");
      out.write("        background-color: pink;\r\n");
      out.write("    }\r\n");
      out.write("    aside{\r\n");
      out.write("    \tmargin: 10px;\r\n");
      out.write("        float: left;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("    }\r\n");
      out.write("    footer{\r\n");
      out.write("    \tclear: both;\r\n");
      out.write("    \ttext-align: center;\r\n");
      out.write("    \tpadding-bottom: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    footer p{\r\n");
      out.write("    \tfont-family: courier;\r\n");
      out.write("    \tfont-size: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .course-table{\r\n");
      out.write("    \tborder-collapse: collapse;\r\n");
      out.write("    }\r\n");
      out.write("    .course-tr{\r\n");
      out.write("    \tborder: 1px solid black;\r\n");
      out.write("    \tpadding: 10px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("    <header>\r\n");
      out.write("        <div align=\"right\" class=\"web-menu\">\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <td><a href=\"#\" class=\"menu\">HOME</a>\r\n");
      out.write("            <td><a href=\"#\" class=\"menu\">ABOUT</a>\r\n");
      out.write("            <td><a href=\"#\" class=\"menu\">LOGIN</a>\r\n");
      out.write("            <td><a href=\"#\" class=\"menu\">CONTACT</a>\r\n");
      out.write("        </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    \t<div class=\"web-title\" align=\"center\">\r\n");
      out.write("    \t\t<table>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("    \t\t\t<td><img src=\"img/linux2.png\" width=\"110px\" height=\"110px\"></td>\r\n");
      out.write("    \t\t\t<td>HELLO </br>LINUX</td>\r\n");
      out.write("    \t\t</tr></table>\r\n");
      out.write("    </header>\r\n");
      out.write("<nav>\r\n");
      out.write("    <div class=\"course\">\r\n");
      out.write("    \t<table id=\"course-table\" class=\"course-table\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("    \t<tr><td class=\"course-tr\">목록</td></tr>\r\n");
      out.write("    \t<tr><td class=\"course-tr\">\r\n");
      out.write("        <ul id=\"course-list\">\r\n");
      out.write("        <li class=\"course-list\"> Ch1. 리눅스란?\r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 1.1 리눅스 운영체제 </a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"course-list\"> Ch2. 리눅스 기본 명령어\r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.1 ls 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.2 cd 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.3 pwd 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.4 touch 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.5 rm 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.6 mkdir 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.7 rmdir 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.8 cp 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.9 mv 명령어 </a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"> Test : 리눅스 기본 명령어 </a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        <li class=\"course-list\"> Ch3. vi 사용하기</li>\r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t<li><a href=\"#\"> 3.1 vi로 파일 작성하기 : 명령모드,</br> \r\n");
      out.write("        \t입력모드, 마지막줄 모드 1 </a></li>\r\n");
      out.write("        \t<li><a href=\"#\"> 3.2 vi로 파일 작성하기 : 명령모드,</br>\r\n");
      out.write("        \t입력모드, 마지막줄 모드 2 </a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"course-btn\" >\r\n");
      out.write("        <input type=\"button\" value=\"▶ 목록\" class=\"btn\" onclick=\"\r\n");
      out.write("    var target=document.querySelector('#course-table');\r\n");
      out.write("    if(this.value==='▶ 목록'){\r\n");
      out.write("        target.style.display='none';\r\n");
      out.write("        this.value='◀ 접기';\r\n");
      out.write("    }\r\n");
      out.write("    else{\r\n");
      out.write("        target.style.display='block';\r\n");
      out.write("        this.value='▶ 목록';\r\n");
      out.write("    }\r\n");
      out.write("    \">\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<content>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t::before [ 참고 http://www.w3schools.com/cssref/sel_before.asp ]\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("선택된 요소 앞에 내용을 삽입할 때 사용합니다.\r\n");
      out.write("\r\n");
      out.write(".phone::before의 의미는 'phone클래스 앞에 무엇인가 넣는다'는 의미입니다. \r\n");
      out.write("\r\n");
      out.write("20 라인을 볼까요.\r\n");
      out.write("\r\n");
      out.write("20라인은 무엇을 넣을 것인지 말해 주고 있습니다.\r\n");
      out.write("\r\n");
      out.write("::before와 ::after는 위처럼 content property와 쓰이며\r\n");
      out.write("\r\n");
      out.write("content property의 구조는 content: \"value\"(\" \" 는 value에 따라 생략된다)입니다.\r\n");
      out.write("\r\n");
      out.write(" value인 는unicode icon으로써 오른쪽처럼 전화기 아이콘이 삽입 되었습니다.\r\n");
      out.write("\r\n");
      out.write("즉, value가 삽입이 되고 그것을 우리가 화면상으로 볼 수 있습니다.\r\n");
      out.write("\r\n");
      out.write("value값으로 올 수 있는 것은 문자, Unicode icon,이미지 또는 쉐입이 있습니다.\r\n");
      out.write("\r\n");
      out.write("[content property 참고 http://www.w3schools.com/cssref/pr_gen_content.asp ]\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("<ul>\r\n");
      out.write("<li>&nbsp;&nbsp;문학</li>\r\n");
      out.write("<li>사회</li>\r\n");
      out.write("<li>만화</li>\r\n");
      out.write("</ul>\r\n");
      out.write("</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</content>\r\n");
      out.write("<aside>\r\n");
      out.write("    <div class=\"console\">\r\n");
      out.write("    \t<ul id=\"console-list\">\r\n");
      out.write("        <li class=\"course-list\"> Ch1 : 리눅스란?\r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 1.1 리눅스 운영체제 </a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        <li class=\"course-list\"> Ch2 : 리눅스 기본 명령어\r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.1 ls 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.2 cd 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.3 pwd 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.4 touch 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.5 rm 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.6 mkdir 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.7 rmdir 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.8 cp 명령어 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 2.9 mv 명령어 </a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"> Test : 리눅스 기본 명령어 </a></li></ul>\r\n");
      out.write("\t\t\t\t<li class=\"course-list\"> Ch3 : vi 사용하기</li>\r\n");
      out.write(" \t\t       \t<li><a href=\"#\"> 3.1 vi로 파일 작성하기 : 명령모드,</br> \r\n");
      out.write("        \t\t\t입력모드, 마지막줄 모드 1 </a></li>\r\n");
      out.write("        \t\t<li><a href=\"#\"> 3.2 vi로 파일 작성하기 : 명령모드,</br>\r\n");
      out.write("        \t\t입력모드, 마지막줄 모드 2 </a></li>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        \r\n");
      out.write("        \t<ul>\r\n");
      out.write("        \t</ul>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"console-btn\">\r\n");
      out.write("        <input type=\"button\" value=\"목록\" class=\"btn\" onclick=\"\r\n");
      out.write("    var target=document.querySelector('#console-list');\r\n");
      out.write("    if(this.value==='목록'){\r\n");
      out.write("        target.style.display='none';\r\n");
      out.write("        this.value='접기';\r\n");
      out.write("    }\r\n");
      out.write("    else{\r\n");
      out.write("        target.style.display='block';\r\n");
      out.write("        this.value='목록';\r\n");
      out.write("    }\r\n");
      out.write("    \">\r\n");
      out.write("    </div>\r\n");
      out.write("</aside>\r\n");
      out.write("<footer>\r\n");
      out.write("\t<hr size=\"3px\" noshade color=\"#034A65\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t<table width=\"700px\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><p>INFO</p>서비스 약관</br>개인정보취급방침</td>\r\n");
      out.write("\t\t\t<td><p>CONTACT US</p>서울시 노원구 공릉동<br>서울과학기술대학교 320호</td>\r\n");
      out.write("\t\t\t<td><p>GET SOCIAL</p><img src=\"img/chat.png\" width=\"50px\" height=\"50px\"\r\n");
      out.write("\t\t\t\tmargin=\"20px\" align=\"center\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr><td colspan=\"3\">\r\n");
      out.write("\t\t<br><br><br><br>\r\n");
      out.write("\t\t<hr></td></tr>\r\n");
      out.write("\t</table></div>\r\n");
      out.write("\t<div>Copyright ⓒ 2016-2019 Hello Linux</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
