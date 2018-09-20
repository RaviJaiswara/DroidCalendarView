package com.vikramezhil.droidcalendarview;

import android.graphics.Color;
import android.graphics.Typeface;

import java.util.ArrayList;
import java.util.List;

/**
 * Droid Calendar Properties
 *
 * @author Vikram Ezhil
 */

class DCProperties
{
    List<String> clickableDates = new ArrayList<>();

    String clickedDate;

    float maxHeaderTextSize = 22f;

    float maxDaysTextSize = 22f;

    float maxDaysSubTextSize = 14f;

    float maxPrevNextButtonSize = 30f;

    float daysHeaderTextSize = 18f;

    float daysTextSize = 18f;

    float daysSubTextSize = 15f;

    int dcPosition = 0;

    int daysHeaderTextStyle = Typeface.NORMAL;

    int daysTextStyle = Typeface.NORMAL;

    int daysSubTextStyle = Typeface.NORMAL;

    int daysHeadersLayoutBGColor = Color.parseColor("#F5F5F5");

    int daysHeadersTextColor = Color.parseColor("#494949");

    /*int daysLayoutBGColor = Color.WHITE;*/
    int daysLayoutBGColor = Color.parseColor("#f4f4f4");
    //int daysTextColor = Color.parseColor("#999898");

    int daysTextColor = Color.parseColor("#494949");

    int daysSubTextColor = Color.parseColor("#999898");

    /*int clickableDaysBGColor = Color.WHITE;*/
    int clickableDaysBGColor = Color.parseColor("#f4f4f4");

    int clickableDaysTextColor = Color.parseColor("#494949");

    int clickedDayBGColor = Color.parseColor("#00ADEF");

    int clickedDayTextColor = Color.WHITE;

    int clickedDaySubTextColor = Color.WHITE;

    //    int colSeparatorColor = Color.parseColor("#F5F5F5");
    int colSeparatorColor = Color.parseColor("#494949");


    //    int rowSeparatorColor = Color.parseColor("#F5F5F5");
    int rowSeparatorColor = Color.parseColor("#494949");

    int horizontalSwipeAnimation = R.anim.anim_fadein;

    int verticalSwipeAnimation = R.anim.anim_fadein;

    boolean showPrevAndNextButtons = true;

    boolean enableHorizontalSwipe = false;

    boolean enableVerticalSwipe = false;

    boolean showSwipeAnimation = false;

    boolean showDaysHeaderColSeparator = false;

    boolean showDaysHeaderRowSeparator = true;

    boolean showColSeparator = true;

    boolean showRowSeparator = true;

    boolean showPastAndFutureMonthDates = false;

    boolean showDaySubValue = false;

    boolean allDatesClickable = true;

    boolean enableOnlyFutureDates = false;
}
