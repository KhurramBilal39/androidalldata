import 'package:flutter/material.dart';
import 'package:velocity_x/velocity_x.dart';

import '../utililes/ai_util.dart';

class HomePage extends StatefulWidget {
  const HomePage({Key? key}) : super(key: key);

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      color: Colors.orange,
    );
  }
}
