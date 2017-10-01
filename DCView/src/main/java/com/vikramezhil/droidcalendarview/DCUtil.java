package com.vikramezhil.droidcalendarview;

import android.content.Context;
import android.graphics.Typeface;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Locale;

/**
 * Droid Calendar Utility
 *
 * Created by Vikram Ezhil on 01/10/17.
 *
 * email: vikram.ezhil.1988@gmail.com
 */

class DCUtil
{
    /**
     * Gets the font awesome typeface
     *
     * @param context The application context
     *
     * @return The font awesome typeface
     */
    static Typeface getFATypeface(Context context)
    {
        return Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
    }

    /**
     * Gets the current date
     *
     * @param format The desired format
     *
     * @param locale The date locale
     *
     * @return The current date
     */
    static String getCurrentDate(String format, Locale locale)
    {
        DateTime date = DateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormat.forPattern(format).withLocale(locale);

        return date.toString(dateFormatter);
    }

    /**
     * Gets the date in desired format
     *
     * @param date The date to be formatted
     *
     * @param passedDateFormat The passed date format
     *
     * @param requiredDateFormat The required date format
     *
     * @param passedLocale The passed date locale
     *
     * @param requiredLocale The required date locale
     *
     * @return The formatted date
     */
    static String getDateInFormat(String date, String passedDateFormat, String requiredDateFormat, Locale passedLocale, Locale requiredLocale)
    {
        DateTimeFormatter dateFormatter = DateTimeFormat.forPattern(passedDateFormat).withLocale(passedLocale);
        DateTime passedDate = dateFormatter.parseDateTime(date);
        dateFormatter = DateTimeFormat.forPattern(requiredDateFormat).withLocale(requiredLocale);

        return dateFormatter.print(passedDate);
    }

    /**
     * Checks if the date is future/current date or passed date
     *
     * @param date The date to be checked
     *
     * @param passedDateFormat The passed date format
     *
     * @param locale The date locale
     *
     * @return True - date is future or current, False - if otherwise
     */
    static boolean checkIfDateIsCurrentOrFuture(String date, String passedDateFormat, Locale locale)
    {
        DateTimeFormatter dateFormatter = DateTimeFormat.forPattern(passedDateFormat).withLocale(locale);
        DateTime currentDate = dateFormatter.parseDateTime(getCurrentDate(passedDateFormat, locale));
        DateTime dateToCheck = dateFormatter.parseDateTime(date);

        return dateToCheck.isAfter(currentDate) || dateToCheck.equals(currentDate);
    }
}
