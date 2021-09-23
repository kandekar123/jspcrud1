

<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
<meta charset="ISO-8859-1">
<title>Consumer Management System</title>


<link rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
      integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" 
      crossorigin="anonymous">
</head>
<body>

 
<div class="container my-2">

   
      <h1>Consumer List</h1>
      
         <a th:href = "@{/showNewConsumerForm}" class="btn btn-primary btn-sm mb-3"> Add Consumer</a>
         <table border="1" class = "table table-striped table-responsive-md">
              <thead>
                  <tr>
                     <th>Consumer id</th>
                     <th>Consumer name</th>
                     <th>Consumer code</th>
                     <th>consumer description</th>
                     <th>Actions</th>
                  </tr>
             </thead>
              <tbody>
                    <tr th:each="consumers : ${listConsumers}">
                       <td th:text="${consumers.consumer_id}"></td>
                       <td th:text="${consumers.consumer_name}"></td>
                       <td th:text="${consumers.consumer_code}"></td>
                       <td th:text="${consumers.Description}"></td>
                      <td>  <a th:href = "@{/showFormForUpdate/{id}(id=${consumers.consumer_id})}" class="btn btn-primary btn-sm mb-3">Update</a>
                            <a th:href = "@{/deleteConsumer/{id}(id=${consumers.consumer_id})}"  class="btn btn-primary btn-sm mb-3">Delete</a>
                      </td> 
              
              
                   </tr>
              </tbody>
          </table>
      </div>
</body>
</html>