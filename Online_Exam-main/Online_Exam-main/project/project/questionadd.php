<?php
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$s1=$_POST['choice'];
$s2=$_POST['ques'];
$s3=$_POST['answer1'];
$s4=$_POST['answer2'];
$s5=$_POST['answer3'];
$s6=$_POST['answer4'];
$s7=$_POST['correct'];
$sql="insert into question values('$s1','$s2','$s3','$s4','$s5','$s6','$s7')";
if($con->query($sql))
{
    header('Location: https://mehtaji.000webhostapp.com/project/questionaddd.html');
}
mysqli_close($con);
?>