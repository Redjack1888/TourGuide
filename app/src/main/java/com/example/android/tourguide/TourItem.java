package com.example.android.tourguide;

/**
 * {@link TourItem} represents an item which will be shown in the tour_list layout.
 * It contains an image, a title, a phone number, an address, a duration, a description and a price.
 * This Class will be used to create 2 different Objects according to the paramaters in use.
 */

public class TourItem {

    /** Image resource ID for the item (all categories) */
    private int mImageResourceID;

    /** Title of the item (all categories) */
    private String mTitle;

    /** Phone number for the item (restaurants, guided tours) */
    private String mPhoneNumber = NO_PHONE_NUMBER_PROVIDED;

    /** Address for the item (all categories) */
    private String mAddress;

    /** Duration for the item (guided tours) */
    private int mDuration = NO_DURATION_PROVIDED;

    /** description with a few words about each item (all categories) */
    private String mDescription;

    /** Price for the item */
    private String mPrice;

    /** Duration Unit type for the item (guided tours) */
    private String mIsHours;

    //** Constant value that represents no duration was provided for this item */
    private static final int NO_DURATION_PROVIDED = -1;

    //** Constant value that represents no phone number was provided for this item */
    private static final String NO_PHONE_NUMBER_PROVIDED = "None";

    /**
     * Create a new TourItem object for LOCATIONS, FOOD&DRINKS, NOTORIOUS PEOPLE
     *
     * @param imageResourceID is the resource ID for the image to be used
     * @param title is the item name
     * @param address is the address of the place
     * @param description is the text accompanying the item
     * @param price is the price in £ - ££££ range
     */

    public TourItem(int imageResourceID, String title,
                    String address, String description, String price){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mPrice = price;
    }

    /**
     * Create a new TourItem object for GUIDED TOURS
     *
     * @param imageResourceID is the resource ID for the image to be used
     * @param title is the item name
     * @param phoneNumber is the phone number of the place
     * @param duration is the length of the tour in hours or minutes
     * @param address is the address of the place
     * @param description is the text accompanying the item
     * @param priceRange is the price in £ - ££££ range
     * @param isHours is the type of duration time unit (hrs or min)
     */

    public TourItem(int imageResourceID, String title, String phoneNumber, int duration,
                    String address, String description, String priceRange, String isHours){
        mImageResourceID = imageResourceID;
        mTitle = title;
        mPhoneNumber = phoneNumber;
        mDuration = duration;
        mAddress = address;
        mDescription = description;
        mPrice = priceRange;
        mIsHours = isHours;
    }

    /** Methods for getting all the variables */
    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmDuration() {
        String duration = String.valueOf(mDuration);
        return duration;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmPrice() {
        return mPrice;
    }

    public String isHours() {
        return mIsHours;
    }

    public boolean hasPhoneNumber() {
        return mPhoneNumber != NO_PHONE_NUMBER_PROVIDED;
    }

    public boolean hasDuration() {
        return mDuration != NO_DURATION_PROVIDED;
    }

}
