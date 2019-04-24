// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import java.util.Calendar;
import java.util.TimeZone;

public interface XMPDateTime
	extends Comparable
{

	public abstract Calendar getCalendar();

	public abstract int getDay();

	public abstract int getHour();

	public abstract String getISO8601String();

	public abstract int getMinute();

	public abstract int getMonth();

	public abstract int getNanoSecond();

	public abstract int getSecond();

	public abstract TimeZone getTimeZone();

	public abstract int getYear();

	public abstract boolean hasDate();

	public abstract boolean hasTime();

	public abstract boolean hasTimeZone();

	public abstract void setDay(int i);

	public abstract void setHour(int i);

	public abstract void setMinute(int i);

	public abstract void setMonth(int i);

	public abstract void setNanoSecond(int i);

	public abstract void setSecond(int i);

	public abstract void setTimeZone(TimeZone timezone);

	public abstract void setYear(int i);
}
