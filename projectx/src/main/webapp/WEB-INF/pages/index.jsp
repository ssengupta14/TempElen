<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
</head>
<body>
 <div> <span>ip address : </span><span>${ipAddress}</span></div>
 <div> <span>user agent :</span><span>${userAgent}</span></div>

 <div> <span>Host :</span><span>${Host}</span></div>
 <div> <span>Accept-Encoding :</span><span>${Accept-Encoding}</span></div>
  <div> <span>X-Forwarded-For :</span><span>${X-Forwarded-For}</span></div>
  <div> <span>Connection :</span><span>${Connection}</span></div>
  <div> <span>From :</span><span>${From}</span></div>
  <div> <span>X-Request-Start :</span><span>${X-Request-Start}</span></div>
  <hr/>Full response: <pre id="details"></pre>
  
  
</body>
</html>