# All json format for post and get
Content-Type : application/json


## Post : Signup

{
    "username": "USER",
    "email": "USER@test.com",
    "password": "PASSWORD",
    "role": ["admin"]
} 

## Post : Signin

{
    "username": "USER",
    "password": "PASSWORD"
}

## Post : Form 
Insure you give the token for this post
#### /api/form
{
    "nomFormulaire": "nomFormulaire",
    "descFormulaire": "descFormulaire",
    "dates": [
        "1940-12-10T15:11:18.882+0000",
        "1940-12-10T15:11:18.882+0000"
    ]
}

## Get : Form 
Insure you give the token for this get
#### /api/getallform
Retrive all forms.

Insure you give the token for this get
#### /api/getthisform?
You can ask for a specific form with a query 
KEY = {id}
VALUE = {int}

Example : /api/getthisform?id=3

## Post : Response
Insure you give the token for this post

#### /api/response
You can post a response with this format :

 {
     "f" :{
         "nomFormulaire": "nomFormulaire",
         "descFormulaire": "descFormulaire",
         "dates": [
             "1940-12-10T15:11:18.882+0000",
             "1940-12-10T15:11:18.882+0000"
         ]
     },
         "user": "USER",
         "responseDates": [
             "1940-12-10T15:11:18.882+0000",
             "1940-12-10T15:11:18.882+0000"
         ]
 }
 ## Get : Response
 Insure you give the token for this post

#### /api/getallresp
This method will get all responses in memory 

#### /api/gethisresp
You can get all responses for a specific user

This GET require the user username in a String vaiable

Example : /api/gethisresp?user=jean
 