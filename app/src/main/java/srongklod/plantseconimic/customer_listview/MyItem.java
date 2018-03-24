package srongklod.plantseconimic.customer_listview;

/**
 * Created by srongklod on 24/3/2018 AD.
 */

public class MyItem {

    private int mImgResource;
    private String mTextLine1;
    private String getmTextLine2;
    private boolean mIsChecked;

    public MyItem(int mImgResource, String mTextLine1, String getmTextLine2, boolean mIsChecked) {
        this.mImgResource = mImgResource;
        this.mTextLine1 = mTextLine1;
        this.getmTextLine2 = getmTextLine2;
        this.mIsChecked = mIsChecked;
    }//in search Constructor

    public int getmImgResource() {
        return mImgResource;
    }

    public void setmImgResource(int mImgResource) {
        this.mImgResource = mImgResource;
    }

    public String getmTextLine1() {
        return mTextLine1;
    }

    public void setmTextLine1(String mTextLine1) {
        this.mTextLine1 = mTextLine1;
    }

    public String getGetmTextLine2() {
        return getmTextLine2;
    }

    public void setGetmTextLine2(String getmTextLine2) {
        this.getmTextLine2 = getmTextLine2;
    }

    public boolean ismIsChecked() {
        return mIsChecked;
    }

    public void setmIsChecked(boolean mIsChecked) {
        this.mIsChecked = mIsChecked;
    }
}//Main Class
