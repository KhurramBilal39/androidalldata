import 'question.dart';

class QuizBrain {
  int _questionsNumber = 0;
  List<Question> _questionBank = [
    Question(
        questionText: 'Some cats are actually allergic to humans',
        questionAnswers: true),
    Question(
        questionText: 'You can lead a cow down stairs but not up stairs.',
        questionAnswers: false),
    Question(
        questionText:
            'Approximately one quarter of human bones are in the feet.',
        questionAnswers: true),
    Question(questionText: 'A slug\'s blood is green.', questionAnswers: true),
    Question(
        questionText: 'Buzz Aldrin\'s mother\'s maiden name was \"Moon\".',
        questionAnswers: true),
    Question(
        questionText: 'It is illegal to pee in the Ocean in Portugal.',
        questionAnswers: true),
    Question(
        questionText:
            'No piece of square dry paper can be folded in half more than 7 times.',
        questionAnswers: false),
    Question(
        questionText:
            'In London, UK, if you happen to die in the House of Parliament, you are technically entitled to a state funeral, because the building is considered too sacred a place.',
        questionAnswers: true),
    Question(
        questionText:
            'The loudest sound produced by any animal is 188 decibels. That animal is the African Elephant.',
        questionAnswers: false),
    Question(
        questionText:
            'The total surface area of two human lungs is approximately 70 square metres.',
        questionAnswers: true),
    Question(
        questionText: 'Google was originally called \"Backrub\".',
        questionAnswers: true),
    Question(
        questionText:
            'Chocolate affects a dog\'s heart and nervous system; a few ounces are enough to kill a small dog.',
        questionAnswers: true),
    Question(
        questionText:
            'In West Virginia, USA, if you accidentally hit an animal with your car, you are free to take it home to eat.',
        questionAnswers: true),
  ];

  void nextQuestion() {
    if (_questionsNumber < _questionBank.length - 1) {
      _questionsNumber++;
    }
    print(_questionsNumber);
    print(_questionBank);
  }

  String getQuestionText() {
    return _questionBank[_questionsNumber].questionText;
  }

  bool getQuestionAnswer() {
    return _questionBank[_questionsNumber].questionAnswers;
  }

  bool isFinished() {
    if (_questionsNumber >= _questionBank.length - 1) {
      //TODO: Step 3 Part B - Use a print statement to check that isFinished is returning true when you are indeed at the end of the quiz and when a restart should happen.

      print('Now returning true');
      return true;
    } else {
      return false;
    }
  }

  //TODO: Step 4 part B - Create a reset() method here that sets the questionNumber back to 0.
  void reset() {
    _questionsNumber = 0;
  }
}
