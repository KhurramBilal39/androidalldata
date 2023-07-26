import 'package:bmi_calculator/result_page.dart';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'icon_content.dart';
import 'result_page.dart';
import 'calculator_brain.dart';
import 'reusable_card.dart';
import 'constants.dart';

const heightofcontainer = 80.0;
const activecolor = Color(0xFF1D1E33);
const inactivecolor = Color(0xFF111328);
const bottomwidgetcolor = Color(0xFFEB1555);

enum Gender {
  female,
  male,
}

class InputPage extends StatefulWidget {
  const InputPage({Key? key}) : super(key: key);

  @override
  State<InputPage> createState() => _InputPageState();
}

class _InputPageState extends State<InputPage> {
  Gender selectedGender = Gender.male;
  int Height = 180;
  int Weight = 60;
  int age = 19;

  void increment() {
    setState(() {
      Weight++;
    });
  }

  void decrement() {
    setState(() {
      Weight--;
    });
  }

  void ageincrement() {
    setState(() {
      age++;
    });
  }

  void agedecrement() {
    setState(() {
      age--;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: Color(0xFF0A0E21),
          title: Center(child: Text('BMI Calculator')),
        ),
        body: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: <Widget>[
            Expanded(
                child: Row(
              children: <Widget>[
                Expanded(
                  child: GestureDetector(
                    onTap: () {
                      setState(() {
                        selectedGender = Gender.male;
                      });
                    },
                    child: ReusableCard(
                      colour: selectedGender == Gender.male
                          ? activecolor
                          : inactivecolor,
                      cardChild: IconContent(
                        icon: FontAwesomeIcons.mars,
                        label: 'MALE',
                      ),
                    ),
                  ),
                ),
                Expanded(
                  child: GestureDetector(
                    onTap: () {
                      setState(() {
                        selectedGender = Gender.female;
                      });
                    },
                    child: ReusableCard(
                      colour: selectedGender == Gender.female
                          ? activecolor
                          : inactivecolor,
                      cardChild: IconContent(
                        icon: FontAwesomeIcons.venus,
                        label: 'FEMALE',
                      ),
                    ),
                  ),
                ),
              ],
            )),
            Expanded(
              child: ReusableCard(
                colour: activecolor,
                cardChild: Column(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: <Widget>[
                    Text('HEIGHT', style: labelTextStyle),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.center,
                      crossAxisAlignment: CrossAxisAlignment.baseline,
                      textBaseline: TextBaseline.alphabetic,
                      children: <Widget>[
                        Text(
                          Height.toString(),
                          style: kTextstyleNumber,
                        ),
                        Text(
                          'cm',
                          style: labelTextStyle,
                        )
                      ],
                    ),
                    SliderTheme(
                      data: SliderTheme.of(context).copyWith(
                        thumbColor: Color(0xFFEB1555),
                        inactiveTrackColor: Color(0xFF8D8E98),
                        activeTrackColor: Colors.white,
                        overlayColor: Color(0x29EB1555),
                        thumbShape:
                            RoundSliderThumbShape(enabledThumbRadius: 15.0),
                        overlayShape:
                            RoundSliderOverlayShape(overlayRadius: 30.0),
                      ),
                      child: Slider(
                        value: Height.toDouble(),
                        min: 120.0,
                        max: 220.0,
                        // divisions: 4,
                        label: Height.toString(),

                        onChanged: (double newValue) {
                          setState(() {
                            Height = newValue.round();
                          });
                        },
                      ),
                    ),
                  ],
                ),
              ),
            ),
            Expanded(
              child: Row(
                children: <Widget>[
                  Expanded(
                    child: ReusableCard(
                        colour: activecolor,
                        cardChild: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          crossAxisAlignment: CrossAxisAlignment.center,
                          children: <Widget>[
                            Text(
                              'WEIGHT',
                              style: labelTextStyle,
                            ),
                            Text(
                              Weight.toString(),
                              style: kTextstyleNumber,
                            ),
                            Expanded(
                              child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: [
                                  FloatingActionButton(
                                      heroTag: 'next2',
                                      backgroundColor: Color(0xFF4C4F5E),
                                      child: Icon(
                                        Icons.remove,
                                        color: Colors.white,
                                      ),
                                      onPressed: () {
                                        decrement();
                                      }),
                                  SizedBox(
                                    width: 10.0,
                                  ),
                                  FloatingActionButton(
                                    heroTag: 'next3',
                                    backgroundColor: Color(0xFF4C4F5E),
                                    onPressed: () {
                                      increment();
                                    },
                                    child: Icon(
                                      Icons.add,
                                      color: Colors.white,
                                    ),
                                  )
                                ],
                              ),
                            ),
                          ],
                        )),
                  ),
                  Expanded(
                    child: ReusableCard(
                        colour: activecolor,
                        cardChild: Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          crossAxisAlignment: CrossAxisAlignment.center,
                          children: <Widget>[
                            Text(
                              'AGE',
                              style: labelTextStyle,
                            ),
                            Text(
                              age.toString(),
                              style: kTextstyleNumber,
                            ),
                            Expanded(
                              child: Row(
                                mainAxisAlignment: MainAxisAlignment.center,
                                children: [
                                  FloatingActionButton(
                                      heroTag: 'next4',
                                      backgroundColor: Color(0xFF4C4F5E),
                                      child: Icon(
                                        (Icons.remove),
                                        color: Colors.white,
                                      ),
                                      onPressed: () {
                                        agedecrement();
                                      }),
                                  SizedBox(
                                    width: 10.0,
                                  ),
                                  FloatingActionButton(
                                    heroTag: 'next1',
                                    backgroundColor: Color(0xFF4C4F5E),
                                    onPressed: () {
                                      ageincrement();
                                    },
                                    child: Icon(
                                      Icons.add,
                                      color: Colors.white,
                                    ),
                                  )
                                ],
                              ),
                            ),
                          ],
                        )),
                  ),
                ],
              ),
            ),
            GestureDetector(
              onTap: () {
                CalculatorBrain calc =
                    CalculatorBrain(height: Height, weight: Weight);

                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => ResultPage(
                      bmiResult: calc.calculateBMI(),
                      resultText: calc.getResult(),
                      interpretation: calc.getInterpetion(),
                    ),
                  ),
                );
              },
              child: Container(
                child: Center(
                  child: Text(
                    'CALCULATE',
                    style: kLargeNumberText,
                  ),
                ),
                color: kbottomwidgetcolor,
                margin: EdgeInsets.only(top: 10.0),
                padding: EdgeInsets.only(bottom: 20.0),
                width: double.infinity,
                height: kheightofcontainer,
              ),
            ),
          ],
        ));
  }
}

// class RoundButton extends StatelessWidget {
//
//   RoundButton({ required this.icon,required this.onPressed});
//   final IconData icon;
//   final Function onPressed;
//
//   @override
//   Widget build(BuildContext context) {
//     return RawMaterialButton(
//       child: Icon(icon),
//         onPressed: onPressed(),
//       elevation:30.0,
//       constraints: BoxConstraints.tightFor(
//         width: 56.0,
//         height: 56.0,
//       ),
//       shape: CircleBorder(),
//       fillColor: Color(0xFF4C4F5E),
//     );
//   }
// }

// Color maleColor = inactivecolor;
// Color femaleColor = inactivecolor;

// void updateColor(Gender Selectedgender) {
//   if (Selectedgender == Gender.male) {
//     if (maleColor == inactivecolor) {
//       maleColor = activecolor;
//       femaleColor = inactivecolor;
//     } else {
//       maleColor = inactivecolor;
//     }
//   }
//   if (Selectedgender == Gender.female) {
//     if (femaleColor == inactivecolor) {
//       femaleColor = activecolor;
//       maleColor = inactivecolor;
//     } else {
//       femaleColor = inactivecolor;
//     }
//   }
// }
