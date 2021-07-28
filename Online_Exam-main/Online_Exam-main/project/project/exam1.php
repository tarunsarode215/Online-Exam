<?php        
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$sql="select * from question";
$result = $con->query($sql);
while($row = $result->fetch_assoc()) {
                   echo $row['ques'];
                   echo "#";
				   echo $row['ans1'];
                   echo "#";
				   echo $row['ans2'];
                   echo "#";
				   echo $row['ans3'];
                   echo "#";
				   echo $row['ans4'];
                   echo "#";
                   echo $row['correct'];
                   echo "#";
}
mysqli_close($con);
?>