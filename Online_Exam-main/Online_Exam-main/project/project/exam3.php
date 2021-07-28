<?php        
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$sql="select * from question";
$result = $con->query($sql);
$s1=$_POST['s1'];
$b=false;
while($row = $result->fetch_assoc()) {
    $s2=$row['ques'];
if($b==true)
{                  echo $row['ques'];
                   echo "#";
				   echo $row['ans1'];
                   echo "#";
				   echo $row['ans2'];
                   echo "#";
				   echo $row['ans3'];
                   echo "#";
				   echo $row['ans4'];
                   echo "#";
                   break;
}
if($s1==$s2)
{
    $b=true;
}           
}
mysqli_close($con);
?>