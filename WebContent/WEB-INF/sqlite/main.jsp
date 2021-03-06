﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Home</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="${ pageContext.request.contextPath }/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="${ pageContext.request.contextPath }/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="${ pageContext.request.contextPath }/data/styles.css" type="text/css" rel="stylesheet"/>
    <link href="${ pageContext.request.contextPath }/files/home/styles.css" type="text/css" rel="stylesheet"/>
    <script src="${ pageContext.request.contextPath }/resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/axQuery.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/globals.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axutils.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/annotation.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/axQuery.std.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/doc.js"></script>
    <script src="${ pageContext.request.contextPath }/data/document.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/messagecenter.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/events.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/action.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/expr.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/geometry.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/flyout.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/ie.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/model.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/repeater.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/sto.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/utils.temp.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/variables.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/drag.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/move.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/visibility.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/style.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/adaptive.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/tree.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/init.temp.js"></script>
    <script src="${ pageContext.request.contextPath }/files/home/data.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/legacy.js"></script>
    <script src="${ pageContext.request.contextPath }/resources/scripts/axure/viewer.js"></script>
    <script type="text/javascript">
      $axure.utils.getTransparentGifPath = function() { return 'resources/images/transparent.gif'; };
      $axure.utils.getOtherPath = function() { return 'resources/Other.html'; };
      $axure.utils.getReloadPath = function() { return 'resources/reload.html'; };
    </script>
  </head>
  <body>
    <div id="base" class="">

      <!-- Unnamed (Shape) -->
      <div id="u0" class="ax_paragraph">
        <img id="u0_img" class="img " src="${ pageContext.request.contextPath }/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u1" class="text">
          <p><span>
             <%
			String key=request.getParameter("keywords");
          	if(key ==null)
        	  key ="";
          	String url =  "sqlmain.jsp?keywords=" + key;
          %>
          
          <jsp:include page= "<%=url%>" />

          </span></p>
        </div>
      </div>

      <!-- Unnamed (Text Field) -->
    <form id="search" method="post" action="${ pageContext.request.contextPath }/servlet/SqliteUIServlet">
      <div id="u2" class="ax_text_field" title="仅输入前几位可以批量监控">
        <input id="u2_input" type="search" value="" name="keywords"/>
      </div>
      <!-- Unnamed (HTML Button) -->
      <div id="u5" class="ax_html_button">
        <input id="u5_input" type="submit" value="开始监控器"/>
      </div>
	</form>


      <!-- Unnamed (Shape) -->
      <div id="u3" class="ax_h1">
        <img id="u3_img" class="img " src="${ pageContext.request.contextPath }/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u4" class="text">
          <p><span>监视平台</span></p>
        </div>
      </div>



      <!-- Unnamed (Shape) -->
      <div id="u6" class="ax_paragraph">
        <img id="u6_img" class="img " src="${ pageContext.request.contextPath }/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u7" class="text">
          <p><span>请</span><span>输入设备号</span><span>：</span></p>
        </div>
      </div>
    </div>
  </body>
</html>
