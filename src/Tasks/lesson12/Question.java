package Tasks.lesson12;



import java.util.Arrays;

public class Question {
    @Override
    public String toString() {
        return "Question: "+ question +  Arrays.toString(answers) + ", difficulty=" + difficulty
                + "]";
    }
    private String question;
    private String[] answers;
    private String difficulty;
    private String correctAnswer;
    public static int score;


    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(String question, String[] answers, String difficulty, String correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.difficulty = difficulty;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String[] getAnswers() {
        return answers;
    }
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    public int questionPoint() {

        if(difficulty.equals("easy"))
            return 1;
        else if(difficulty.equals("medium"))
            return 2;
        else
            return 3;
    }
}

