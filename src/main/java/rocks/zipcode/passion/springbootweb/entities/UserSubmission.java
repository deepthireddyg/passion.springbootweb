package rocks.zipcode.passion.springbootweb.entities;

import jakarta.persistence.*;

@Entity(name="usersubmission")
@Table(name="usersubmission")
public class UserSubmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer submissionid;
    private String personname;
    private String emailid;
    private String serviceName;
    private double price;
    private  String providername;
    private String providerstreet;
    private String providercity;
    private  String providerstate;
    private String providerzipcode;
    private  Integer providerrating;

    public Integer getSubmissionid() {
        return submissionid;
    }

    public void setSubmissionid(Integer submissionid) {
        this.submissionid = submissionid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getServicename() {
        return serviceName;
    }

    public void setServicename(String servicename) {
        this.serviceName = servicename;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }

    public String getProviderstreet() {
        return providerstreet;
    }

    public void setProviderstreet(String providerstreet) {
        this.providerstreet = providerstreet;
    }

    public String getProvidercity() {
        return providercity;
    }

    public void setProvidercity(String providercity) {
        this.providercity = providercity;
    }

    public String getProviderstate() {
        return providerstate;
    }

    public void setProviderstate(String providerstate) {
        this.providerstate = providerstate;
    }

    public String getProviderzipcode() {
        return providerzipcode;
    }

    public void setProviderzipcode(String providerzipcode) {
        this.providerzipcode = providerzipcode;
    }

    public Integer getProviderrating() {
        return providerrating;
    }

    public void setProviderrating(Integer providerrating) {
        this.providerrating = providerrating;
    }

    @Override
    public String toString() {
        return "UserSubmission{" +
                "submissionid=" + submissionid +
                ", personname='" + personname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", servicename='" + serviceName + '\'' +
                ", price=" + price +
                ", providername='" + providername + '\'' +
                ", providerstreet='" + providerstreet + '\'' +
                ", providercity='" + providercity + '\'' +
                ", providerstate='" + providerstate + '\'' +
                ", providerzipcode='" + providerzipcode + '\'' +
                ", providerrating=" + providerrating +
                '}';
    }
}
