WebServices

Gettoken: Creates a valid token

1. Enter valid email address and validate if the token is received in the email or not

Verifytoken: 
1. Enter valid token, verify if the return code is valid or not
2. Enter invalid token and verify if the return code is invalid or not
3. Generate a token, After 4 days, use the same token. Valid if the return code is valid or not — The return code is expected to be invalid.

Register: 

Enter user name =abcd3456 and password = “abcd234”
Verify if the return json returns “ The user is created successfully”

Enter user name =abcd3456 and password = “abcd234”
Verify if the return json returns “ User already exists”

Enter user name =asdf23422 and password=“Password1*” Pass the wrong authorisation code. Validate the response json = “Incorrect user name and password”

UserLogin: 

Enter user name =abcd3456 and password = “abcd234” Validate the response json “Login successfully”

Enter user name =abcd3456 and password=“invalid password” validate the response json “Unable to login”


Get user

Pass valid authorisation in body and see if all users are retrieved from the database in the response json

Post user

Pass valid authorisation in body , add new user then call get user to see if the added user is shown in the return json


Update user

Pass valid authorisation code in the body, call update user with “user name =abcd3456
Validate the response json updated

Delete user

Pass valid authorisation code in the body, call delete user with user name =abck3456
Validate the response json.
Next call the Get user method to verify if the user doesn’t exist.
