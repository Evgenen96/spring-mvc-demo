<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName} ${customer.age} years old
<br>
Postal code is ${customer.postalCode}
<br>
Course code is ${customer.courseCode}

</body>
</html>