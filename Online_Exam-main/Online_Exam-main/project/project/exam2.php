<?php        
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$s1=$_POST['s1'];
$s2=$_POST['s2'];
$sql="select * from question WHERE ques='$s1' and correct='$s2'";
$result = $con->query($sql);
if($row = $result->fetch_assoc()) {
    echo "true";
}
mysqli_close($con);
?>