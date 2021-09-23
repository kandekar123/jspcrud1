
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org" >
<head>
<meta charset="ISO-8859-1">
<title>Consumer Management System</title>
<link rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" 
      crossorigin="anonymous">
      
</head>
<body>
     <div class="container">
         <h1>Consumer Management System</h1>
         <hr>
         <h2>Save Consumer</h2>
         
         <form action="#" th:action="@{/saveConsumer}" th:object ="${consumer}"
          method="POST">
           
             
             <input type="text" th:field = "*{consumer_name}" 
             placeholder="Enter consumer name" class="form.control mb-4 col-4"><br>
             
             <input type="text" th:field = "*{consumer_code}" 
             placeholder="Enter consumer code" class="form.control mb-4 col-4"><br>
             
             <input type="text" th:field = "*{Description}" 
             placeholder="Enter consumer description" class="form.control mb-4 col-4"><br>
             
             <button type="submit" class="btn btn-info col-2"> save Consumer</button>
         
         
         
         </form>
     
     <hr>
     
     <a th:href = "@{/}">Back to Consumer List</a>
     </div>

</body>
</html>