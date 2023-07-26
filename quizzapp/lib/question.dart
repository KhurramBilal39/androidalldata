class Question{
  String questionText;
  bool  questionAnswers;

   Question({required this.questionText,required this.questionAnswers });

   void talk(String whatisIt){
     print(whatisIt);
   }

}