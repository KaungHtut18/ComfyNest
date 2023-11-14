package th.mfu.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rating 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int OneCount=0;
    private int twoCount=0;
    private int threeCount=0;
    private int fourCount=0;
    private int fiveCount=0;
    private int zeroCount=0;

    public Rating(int id, int oneCount, int twoCount, int threeCount, int fourCount, int fiveCount, int zeroCount) {
        this.id = id;
        OneCount = oneCount;
        this.twoCount = twoCount;
        this.threeCount = threeCount;
        this.fourCount = fourCount;
        this.fiveCount = fiveCount;
        this.zeroCount = zeroCount;
    }

    public Rating()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOneCount() {
        return OneCount;
    }

    public void setOneCount(int oneCount) {
        OneCount = oneCount;
    }

    public int getTwoCount() {
        return twoCount;
    }

    public void setTwoCount(int twoCount) {
        this.twoCount = twoCount;
    }

    public int getThreeCount() {
        return threeCount;
    }

    public void setThreeCount(int threeCount) {
        this.threeCount = threeCount;
    }

    public int getFourCount() {
        return fourCount;
    }

    public void setFourCount(int fourCount) {
        this.fourCount = fourCount;
    }

    public int getFiveCount() {
        return fiveCount;
    }

    public void setFiveCount(int fiveCount) {
        this.fiveCount = fiveCount;
    }

    public int getZeroCount() {
        return zeroCount;
    }

    public void setZeroCount(int zeroCount) {
        this.zeroCount = zeroCount;
    }
    public int calcRating()
    {
        int totalCount=OneCount+twoCount+threeCount+fourCount+fiveCount+zeroCount;
        if(totalCount==0)
            return 0;
        
        return (1*OneCount+2*twoCount+3*threeCount+4*fourCount+5*fiveCount)/totalCount;
    }
}
