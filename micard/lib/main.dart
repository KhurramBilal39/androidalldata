import 'package:flutter/material.dart';

void main() {
  runApp( MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
      backgroundColor: Colors.teal,
      body: SafeArea(

          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              CircleAvatar(
                radius: 50.0,
                backgroundImage: AssetImage('images/naruto.jpg'),
              ),
               Text(
                   'Khurram Bilal',
               style: TextStyle(
                 fontSize: 20.0,
                 fontWeight: FontWeight.bold,
                 color: Colors.white,
                 fontFamily: 'Pacifico'
               ),
               ),
              Text(
                'Flutter Developer',
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                  fontSize: 15.0,
                  color: Colors.teal.shade100,
                  letterSpacing: 2.5
                ),
              ),
              SizedBox(
                width: 150.0,
                height: 20.0,
                child: Divider(
                  color: Colors.teal.shade100,
                ),
              ),
              Card(
                color: Colors.white,
                margin: EdgeInsets.symmetric(vertical: 10.0,horizontal:
                25.0),
                child: ListTile(
                  leading: Icon(
                    Icons.phone,
                    size: 30.0,
                    color: Colors.teal,
                  ),
                  title: Text('+ 03042-323223',
                    style:TextStyle(
                        fontSize: 20.0,
                        color: Colors.teal.shade900,
                        fontFamily: 'Poppins'
                    ),
                  ),


                ),
              ),
              Card(
              color: Colors.white,
                margin: EdgeInsets.symmetric(vertical: 10.0,horizontal:
                25.0),
                child: ListTile(
                  leading: Icon(
                    Icons.email,
                    size: 30.0,
                    color: Colors.teal,
                  ),
                  title: Text('Khurrambilal@gmail.com',
                    style:TextStyle(
                        fontSize: 20.0,
                        color: Colors.teal.shade900,
                        fontFamily: 'Poppins'
                    ),
                  ),
                ),
              ),
            ],
          ),
      ),
      ),
    );
  }
}

