<html>
<head>
<html>
<head>
         <title>Question Paper</title>

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
<form action="questionadd.html">

<center>	
  <table>
		   <center>
  		   	   <input type="submit" name="" value="Back">
  		   

<?php
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$sql="select * from regis";
$result = $con->query($sql);
if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {
    echo "<tr>";
    echo "<td>" . $row['un'] ."</td>";
    echo "<td>" . $row['fn'] . "</td>";
    echo "<td>" . $row['cn'] . "</td>";
    echo "<td>" . $row['an'] . "</td>";
    echo "<td>" . $row['em'] . "</td>";
    echo "<td>" . $row['dob'] . "</td>";
    echo "<td>" . $row['x'] . "</td>";
    echo "<td>" . $row['nal'] . "</td>";
    echo "<td>" . $row['st'] . "</td>";
    echo "<td>" . $row['pin'] . "</td>";
    echo "<td>" . $row['tq'] . "</td>";
    echo "<td>" . $row['cq'] . "</td>";
    echo "<td>" . $row['i'] . "</td>";
    echo "</tr>";
    }
}
mysqli_close($con);
?>

</table>
</center>
</form>
</div>
        
</body>
</html>