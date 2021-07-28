<?php
session_start();
?>
<html>
<head>
<html>
<head>
         <title>Result</title>

         <style>
             
   	table
   	{
		background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));
	  	
   		padding: 100px;
   		margin-top: 5%;
                color:black; 
   	}

   	table tr td
   	{
   		font-size: 20px;
   		padding: 20px;
   	}
   	table tr td input
   	{
   		background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));
   		padding: 10px;
   		width: 50%;
   	}
        .m
        {
            padding: 30px; 
        }
        
                
        div ul li
        {
            float: right;
            display: inline-block;
            background-color: black;
            padding: 10px;
            margin: 8px;
         

        }
         div ul li:hover
        {
            float: right;
            display: inline-block;
            background-color:red;
			border-radius:8px;
            padding: 15px;
            margin: 3px;    
        }

body
	  {
	background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);
	background-size: 100%;
	  }



         </style>
</head>
<body>
 
<div class="m">
<form action="login.html" method="post">

<center>	
  <table>
		   <center>
  		   	   <input type="submit" name="" value="Back">
  		   

<?php
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');

$s1 = $_SESSION['s1'];
$s2 = $_SESSION['s2'];
$s3 = $_SESSION['s3'];
$sql="select * from regis where un='$s1' and em='$s2' and dob='$s3'";
$result = $con->query($sql);
    if($row = $result->fetch_assoc()) {
    echo "<tr><td><th>Name:</th><th>" . $row['un'] ."</th></td>";
    echo "<tr><td><th>Father Name:</th><th>" . $row['fn'] . "</th></td></tr>";
    echo "<tr><td><th>Contact no:</th><th>" . $row['cn'] . "</th></td></tr>";
    echo "<tr><td><th>Adhar no:</th><th>" . $row['an'] . "</th></td></tr>";
    echo "<tr><td><th>Email:</th><th>" . $row['em'] . "</th></td></tr>";
    echo "<tr><td><th>Date of Birth:</th><th>" . $row['dob'] . "</th></td></tr>";
    echo "<tr><td><th>Gender:</th><th>" . $row['x'] . "</th></td></tr>";
    echo "<tr><td><th>Nationality:</th><th>" . $row['nal'] . "</th></td></tr>";
    echo "<tr><td><th>State:</th><th>" . $row['st'] . "</th></td></tr>";
    echo "<tr><td><th>Pin:</th><th>" . $row['pin'] . "</th></td></tr>";
    echo "<tr><td><th>Total question:</th><th>" . $row['tq'] . "</th></td></tr>";
    echo "<tr><td><th>correct answer:</th><th>" . $row['cq'] . "</th></td></tr>";
    }
mysqli_close($con);
?>

</table>
</center>
</form>
</div>
        
</body>
</html>