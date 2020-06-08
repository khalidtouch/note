package com.touch.notes;



public class Note {
    private String mID = "00";
    private String mText;
    private Category mCategory;
    private TimeStamp mTimeStamp;

    public Note(String id, String text, Category category, TimeStamp timeStamp){
        this.mID = id;
        this.mText = text;
        this.mCategory = category;
        this.mTimeStamp = timeStamp;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }

    public String getText() {
        return mText;
    }

    public Category getCategory() {
        return mCategory;
    }

    public TimeStamp getTimeStamp() {
        return mTimeStamp;
    }

    public void setText(String text) {
        mText = text;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public void setTimeStamp(TimeStamp timeStamp) {
        mTimeStamp = timeStamp;
    }


    public enum Category {
        UNCATEGORIZED ("Uncategorized"),
        WORK ("Work"),
        PERSONAL ("Personal"),
        FAMILY_AFFAIR ("Family Affair"),
        STUDY ("Study");

        private String mValue;

        Category(String value){
            this.mValue = value;
        }

        public String getValue() {
            return mValue;
        }
    }

}
