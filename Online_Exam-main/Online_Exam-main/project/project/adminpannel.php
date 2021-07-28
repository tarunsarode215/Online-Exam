<?php
$s1=$_POST['cn'];
$s2=$_POST['em'];
$s3=$_POST['an'];
if($s1=="abc" and $s2=="abc" and $s3=="123")
{
    header('Location: https://mehtaji.000webhostapp.com/project/questionadd.html');
}
else
{
    header('Location: https://mehtaji.000webhostapp.com/project/adminpannel.html');
}
mysqli_close($con);
?>