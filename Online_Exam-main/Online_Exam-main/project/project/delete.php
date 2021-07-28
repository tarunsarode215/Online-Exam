<?php
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$s1=$_POST['choice'];
$s2=$_POST['ques'];
$sql="delete from question where choice='$s1' and ques='$s2'";
$sql1="select * from question where choice='$s1' and ques='$s2'";
$result = $con->query($sql1);
$con->query($sql);
if ($result->num_rows > 0) {
    header('Location: https://mehtaji.000webhostapp.com/project/questionadd.html');
}
else
{
    header('Location: https://mehtaji.000webhostapp.com/project/delete.html');
}

mysqli_close($con);
?>