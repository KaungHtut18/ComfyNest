package th.mfu.domain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Dormitory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.MERGE)
    private Rating rating;

    private String name;
    private String city;
    private String province;
    private int price;
    private String gender;
    private boolean fullyBooked=false;
    private String description;
    private String rules;
    private String Amenties;
    private String img1,img2,img3,img4;
    private String email;
    @ManyToOne
    private Landlord landlord;
    private double lat;
    private double lng;

    
    public Dormitory(int id, Rating rating, String name, String location, String province, int price, String gender,
            boolean fullyBooked, String description, String rules, String amenties, String img1, String img2,
            String img3, String img4, String email, Landlord landlord,double lat,double lng) {
        this.id = id;
        this.rating = rating;
        this.name = name;
        this.city = location;
        this.province = province;
        this.price = price;
        this.gender = gender;
        this.fullyBooked = fullyBooked;
        this.description = description;
        this.rules = rules;
        Amenties = amenties;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.email = email;
        this.landlord = landlord;
        this.lat=lat;
        this.lng=lng;
    }
    public Dormitory()
    {
        
    }
    public Landlord getLandlord() {
        return landlord;
    }
    
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLng() {
        return lng;
    }
    public void setLng(double lng) {
        this.lng = lng;
    }
    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String location) {
        this.city = location;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isFullyBooked() {
        return fullyBooked;
    }

    public void setFullyBooked(boolean fullyBooked) {
        this.fullyBooked = fullyBooked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getAmenties() {
        return Amenties;
    }

    public void setAmenties(String amenties) {
        Amenties = amenties;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
