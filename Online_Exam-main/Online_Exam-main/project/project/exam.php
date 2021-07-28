<?php
ob_start();
?>
<html>
    <head><title>Question Paper</title><style>table{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 30px;margin-top: 5%;color:black;}button{font-size: 15px;}input{font-size: 30px;}.m{padding: 120px;}div ul li {float: right;display: inline-block;background-color: black;padding: 15px;margin: 5px;}div ul li:hover{float: right;display: inline-block;background-color: gray;padding: 15px;margin: 5px;}body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}</style>
    <style>#div1{height: 60px;width: 60px;background-color: #bbb;border-radius:50%;font-size:50px;}#font{padding:7px;}</style>
    </head>
    <body onLoad='clock12();'><center><div class='m'><div id='div1'><font id='font1'></font></div>
    <form action='check.php' method="post" id='form_id' >
        
        
<?php        

$con=mysqli_connect('localhost','id11773179_root','root123','id11773179_chetan');
$s1=$_POST['s1'];
$s2=$_POST['s2'];
$s3=$_POST['s3'];
$i=0;$k=0;$j=0;$t=0;$b=true;
$choice=$_POST['s4'];
echo "     <input type='hidden' name='s1' value='$s1'>
           <input type='hidden' name='s2' value='$s2'>
           <input type='hidden' name='s3' value='$s3'>
           <input type='hidden' name='s4' value='$choice'>
           <input type='hidden' name='s5' id='s5' value=''>
           <input type='hidden' name='s6' id='s6' value='0'>";
$s['100']=0;
$sql="select * from question where choice='$choice'";
$result = $con->query($sql);
while($row = $result->fetch_assoc()) {
				    $s[$k++]=$row['ques'];
				    $s[$k++]=$row['ans1'];
				    $s[$k++]=$row['ans2'];
				    $s[$k++]=$row['ans3'];
				    $s[$k++]=$row['ans4'];
				    $s[$k++]=$row['correct'];
}
$sql="select * from regis where un='$s1' and em='$s2' and dob='$s3'";
$result = $con->query($sql);
if($row = $result->fetch_assoc()) {
    $i=$row['i'];
    $j=$row['tq'];
}
if($i>=$k)
{
    $sql = "update regis set i='0' where un='$s1' and em='$s2' and dob='$s3'";
    $con->query($sql);
    session_start();
    $_SESSION['s1'] = $s1;
    $_SESSION['s2'] = $s2;
    $_SESSION['s3'] = $s3;
    header('Location: https://mehtaji.000webhostapp.com/project/result.php');
    ob_enf_fluch();
}
else
{
    $j++;
    $sql = "update regis set tq='$j' where un='$s1' and em='$s2' and dob='$s3'";
    $con->query($sql);
}
for(;$i<$k && $b;)
				   {
					   $ques=$s[$i++];
					   $op1=$s[$i++];
					   $op2=$s[$i++];
					   $op3=$s[$i++];
					   $op4=$s[$i++];
					   $ans=$s[$i++];
    $sql = "update regis set i='$i' where un='$s1' and em='$s2' and dob='$s3'";
    $con->query($sql);
     echo "<center><TABLE BORDER=2 cellpadding=50 ><tr><th colspan='4'>$ques?</th></tr><div class='a1'><tr><th><button type='button' id='op1' onclick='an1()'>$op1</button> </th><th><button type='button' onclick='an2()' id='op2'>$op2</button> </th><th><button type='button' onclick='an3()' id='op3'>$op3</button> </th><th><button type='button' onclick='an4()' id='op4'>$op4</button> </th></tr></div><tr id='che'><th colspan='4'><div id='con'><div></th></tr><tr><th colspan='4'><input type='submit' value='next'></th></tr>
     <script type='text/javascript'>function an1(){if('$op1'=='$ans'){document.getElementById('s6').value=document.getElementById('op1').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>
        <script type='text/javascript'>function an2(){if('$op2'=='$ans'){document.getElementById('s6').value=document.getElementById('op2').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>
        <script type='text/javascript'>function an3(){if('$op3'=='$ans'){document.getElementById('s6').value=document.getElementById('op3').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>
        <script type='text/javascript'>function an4(){if('$op4'=='$ans'){document.getElementById('s6').value=document.getElementById('op4').innerHTML;fun1();fun3();}else{fun();fun3();}}</script>
        <script type='text/javascript'>function fun3(){document.getElementById('s5').value='$ans';document.getElementById('op1').disabled = true;document.getElementById('op2').disabled = true;document.getElementById('op3').disabled = true;document.getElementById('op4').disabled = true;}</script>
        
        <script type='text/javascript'>function fun(){document.getElementById('che').style.background='red';document.getElementById('con').innerHTML ='Incorrect ans..';next();}function fun1(){document.getElementById('che').style.background='green';document.getElementById('con').innerHTML ='correct ans';next();}</script>
        <script type='text/javascript'>var counter=30;var t;function clock12(){document.getElementById('font1').innerHTML=counter;counter--;if(counter>0){t=setTimeout('clock12();',1000);}else{document.getElementById('form_id').submit();}}</script>
        <script type='text/javascript'>var counter1=3;var t1;function next(){counter1--;if(counter1>0){t1=setTimeout('next();',1000);}else{ document.getElementById('form_id').submit();}}</script>
        </table>
        </center>";
			$b=false;	   }

mysqli_close($con);
?>
</form>
</div>
</body>
</html>