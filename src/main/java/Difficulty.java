public enum Difficulty {
    LOW(20),
    MEDIUM(50),
    HARD(100);
    private int payload;
    Difficulty(int payload){
        this.payload = payload;
    }

    @JsonValue
    public int getPayload(){
        return payload;
    }

public class LeaderBoardComparator implements Comparator<LeaderBoardEntity> {


    @Override
    public int compare(LeaderBoardEntity o1, LeaderBoardEntity o2) {
        if(o1.getScore() == o2.getScore()) return 0;
        else if(o1.getScore() > o2.getScore() )return  1;
        else
            return -1;

    }
}
}

