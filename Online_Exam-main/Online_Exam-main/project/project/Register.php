<?php
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$s1=$_POST['un'];
$s2=$_POST['fn'];
$s3=$_POST['cn'];
$s4=$_POST['an'];
$s5=$_POST['em'];
$s6=$_POST['dob'];
$s7=$_POST['x'];
$s8=$_POST['nal'];
$s9=$_POST['st'];
$s10=$_POST['pin'];
$s11="0";
$s12="0";
$s13="0";
$sql="insert into regis values('$s1','$s2','$s3','$s4','$s5','$s6','$s7','$s8','$s9','$s10','$s11','$s12','$s13')";
if($con->query($sql))
{
    header('Location: https://mehtaji.000webhostapp.com/project/login.html');
}
mysqli_close($con);
?>