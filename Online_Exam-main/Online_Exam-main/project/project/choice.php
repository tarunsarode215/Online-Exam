<html>
    <head>
        <title>Choice</title>
        <style>
            table{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));
            padding: 100px;margin-top: 5%;color:black;}
            table tr td{font-size: 20px;padding: 20px;}
            table tr td input{background: linear-gradient( rgba(255,255,255,0.6),rgba(255,255,255,0.6));padding: 10px;width: 50%;}
            .m{padding: 100px;}
            body{background: linear-gradient(rgba(255,0,200,0.3),rgba(255,0,0,0.6)),url(admin.jpg);background-size: 100%;}
            </style>
            </head>
            <body>
                
            </br>
            <div class='m'>
                <form action='exam.php' method="post">
                    <input type='hidden' name='s1' value="+s1+">
                    <input type='hidden' name='s2' value="+s2+">
                    <input type='hidden' name='s3' value="+s3+">
                    <center><table><tr><td><center>-----------------------------------------------------------search-------------------------------------------------------------</br><label> Please Select Your Language</label><br><br><select style='width: 50%; height:40px;' name='s4'><option>C-pro</option><option>C++</option><option>PHP</option><option>Java</option><option>Python</option></select></td></tr><tr><td><center><input type='submit' name='' value='submit'></td></tr></table></center></form></div></body></html>