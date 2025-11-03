<html>
<head><title>Users</title></head>
<body>
<h2>User List</h2>
<script>
fetch('http://localhost:8080/users')
.then(res => res.json())
.then(data => {
    document.write("<ul>");
    data.forEach(u => document.write("<li>" + u.name + " - " + u.email + "</li>"));
    document.write("</ul>");
});
</script>
</body>
</html>
