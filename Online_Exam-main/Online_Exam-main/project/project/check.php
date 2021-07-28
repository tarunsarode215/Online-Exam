<html>
    <head>
        <style>body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}</style>
    </head>
    <body>
    <form action='exam.php' method="post" id='form_id' ><?php
$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$i=0;$c=0;
$ans="";
$s1=$_POST['s1'];
$s2=$_POST['s2'];
$s3=$_POST['s3'];
$s4=$_POST['s4'];
$s5=$_POST['s5'];
$s6=$_POST['s6'];
$sql="select * from regis where un='$s1' and em='$s2' and dob='$s3'";
$result = $con->query($sql);
if($row = $result->fetch_assoc()) 
    {
    $i=$row['i'];
    $c=$row['cq'];
    $c++;
    }
    if($s5==$s6) 
    {
    $sql = "update regis set cq='$c' where un='$s1' and em='$s2' and dob='$s3'";
    $con->query($sql);
    }
mysqli_close($con);
 
echo "<input type='hidden' name='s1' value='$s1'>
<input type='hidden' name='s2' value='$s2'>
<input type='hidden' name='s3' value='$s3'>
<input type='hidden' name='s4' id='s4' value='$s4'>
<script type='text/javascript'>document.getElementById('form_id').submit();</script>";

?>        </table>
        </center></form></div>
        </body>
        </html>