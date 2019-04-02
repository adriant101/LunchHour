package com.hfad.lunchhour;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Truck extends Activity {
    private ImageView imageView;
    private EditText TruckName;
    private EditText OwnerName;
    private EditText TruckPhone;
    private EditText TruckAddress;
    private Button Favorite;
    private EditText MenuList;

    public Truck(ImageView imageView, EditText truckName, EditText ownerName, EditText truckPhone, EditText truckAddress, Button favorite, EditText menuList) {
        this.imageView = imageView;
        TruckName = truckName;
        OwnerName = ownerName;
        TruckPhone = truckPhone;
        TruckAddress = truckAddress;
        Favorite = favorite;
        MenuList = menuList;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck);
    }


    // region getters and setters

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public EditText getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(EditText ownerName) {
        OwnerName = ownerName;
    }

    public EditText getTruckName() {
        return TruckName;
    }

    public void setTruckName(EditText truckName) {
        TruckName = truckName;
    }

    public EditText getTruckPhone() {
        return TruckPhone;
    }

    public void setTruckPhone(EditText truckPhone) {
        TruckPhone = truckPhone;
    }

    public EditText getTruckAddress() {
        return TruckAddress;
    }

    public void setTruckAddress(EditText truckAddress) {
        TruckAddress = truckAddress;
    }

    public Button getFavorite() {
        return Favorite;
    }

    public void setFavorite(Button favorite) {
        Favorite = favorite;
    }

    public EditText getMenuList() {
        return MenuList;
    }

    public void setMenuList(EditText menuList) {
        MenuList = menuList;
    }

    //endregion
}
