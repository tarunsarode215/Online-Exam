<?php        
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$sql="select * from question";
$result = $con->query($sql);
$s1=$_POST['s1'];
$b=false;
$s3;
$s4;
$s5;
$s6;
$s7;
while($row = $result->fetch_assoc()) {
    $s2=$row['ques'];
if($b==true)
{                  echo $s3;
                   echo "#";
				   echo $s4;
                   echo "#";
				   echo $s5;
                   echo "#";
				   echo $s6;
                   echo "#";
				   echo $s7;
                   echo "#";
                   break;
}
if($s1==$s2)
{
    $b=true;
}  
if($b==false)
{
    $s3=$row['ques'];
    $s4=$row['ans1'];
    $s5=$row['ans2'];
    $s6=$row['ans3'];
    $s7=$row['ans4'];
}
}
mysqli_close($con);
?>