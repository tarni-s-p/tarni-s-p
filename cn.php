<?php
$conn=mysqli_connect("localhost","root","");
?>
<html>
<body>
<?php
if($conn)
{
	echo "connected <br>";
}
else
{
	echo "not connected <br> ";
}


$cn=mysqli_select_db($conn,"student1"); 
$q1="create table student1(id int(10),name varchar(20))";
if(mysqli_query($conn,$q1))
{	echo "table is created";	}
else
{	echo "table is not created";	}
?>
</body>
</html>
