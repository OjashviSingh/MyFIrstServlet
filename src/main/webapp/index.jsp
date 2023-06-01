<html>
<body>
<h2>Hello World!</h2>
<form action="/action_page.php">
  <label >email id:</label><br>
  <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"  name="useremail"><br>
  <label >Password</label><br>
  <input type="password" name="userpassword"><br><br>
  <input type="submit" value="Submit">
</form> 

<p>If you click the "Submit" button, the form-data will be sent to a page called "/action_page.php".</p>
</body>
</html>
