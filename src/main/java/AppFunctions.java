// App runner
public interface AppFunctions {
    public  User createUser(String username,String email , String password);
    public List<Question> createQuestions(Difficulty difficulty , int qty);
    public void showQuestionsByDifficulty(Difficulty difficulty);
    public Contest createContest(String contestName, Difficulty difficulty, User user , int q_qty);
    public Contest showContestDetails(String contestId);

    public void register(String contestId, User user);

    public void withdraw(String contestId, User user);

    public void startContest(String contestId);

}
