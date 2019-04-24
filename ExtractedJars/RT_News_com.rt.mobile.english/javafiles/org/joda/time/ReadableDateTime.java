// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;

import java.util.Locale;

// Referenced classes of package org.joda.time:
//			ReadableInstant, DateTime, MutableDateTime

public interface ReadableDateTime
	extends ReadableInstant
{

	public abstract int getCenturyOfEra();

	public abstract int getDayOfMonth();

	public abstract int getDayOfWeek();

	public abstract int getDayOfYear();

	public abstract int getEra();

	public abstract int getHourOfDay();

	public abstract int getMillisOfDay();

	public abstract int getMillisOfSecond();

	public abstract int getMinuteOfDay();

	public abstract int getMinuteOfHour();

	public abstract int getMonthOfYear();

	public abstract int getSecondOfDay();

	public abstract int getSecondOfMinute();

	public abstract int getWeekOfWeekyear();

	public abstract int getWeekyear();

	public abstract int getYear();

	public abstract int getYearOfCentury();

	public abstract int getYearOfEra();

	public abstract DateTime toDateTime();

	public abstract MutableDateTime toMutableDateTime();

	public abstract String toString(String s)
		throws IllegalArgumentException;

	public abstract String toString(String s, Locale locale)
		throws IllegalArgumentException;
}
