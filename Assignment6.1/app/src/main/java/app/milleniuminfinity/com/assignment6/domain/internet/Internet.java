package app.milleniuminfinity.com.assignment6.domain.internet;
/**
 * Write a description of class Internet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.Serializable;

public class Internet implements Serializable
{
    private String ISP, planName;
    int price, dataAllowance;
    private Internet nextInternetType;
    
    private Internet(){}
    
    private Internet(Builder builder)
    {
        this.ISP = builder.ISP;
        this.planName = builder.planName;
        this.price = builder.price;
        this.dataAllowance = builder.dataAllowance;
    }
    
    public String getISP()
    {
        return ISP;
    }
    
    public String getPlanName()
    {
        return planName;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getDataAllowance()
    {
        return dataAllowance;
    }
    
    public void setNextInternetType(Internet nextInternetType)
    {
        this.nextInternetType = nextInternetType;
    }
    
    public static class Builder
    {
        private String ISP, planName;
        int price, dataAllowance;
        
        public Builder ISP(String value)
        {
            this.ISP = value;
            return this;
        }
        
        public Builder planName(String value)
        {
            this.planName = value;
            return this;
        }
        
        public Builder price(int value)
        {
            this.price = value;
            return this;
        }
        
        public Builder dataAllowance(int value)
        {
            this.dataAllowance = value;
            return this;
        }
        
        public Builder copy(Internet value)
        {
            this.ISP = value.ISP;
            this.planName = value.planName;
            this.price = value.price;
            this.dataAllowance = value.dataAllowance;
            
            return this;
        }
        
        public Internet build()
        {
            return new Internet(this);
        }
    }
}
