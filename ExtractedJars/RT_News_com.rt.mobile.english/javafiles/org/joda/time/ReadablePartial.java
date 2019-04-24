// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;


// Referenced classes of package org.joda.time:
//			DateTimeFieldType, Chronology, DateTimeField, ReadableInstant, 
//			DateTime

public interface ReadablePartial
	extends Comparable
{

	public abstract boolean equals(Object obj);

	public abstract int get(DateTimeFieldType datetimefieldtype);

	public abstract Chronology getChronology();

	public abstract DateTimeField getField(int i);

	public abstract DateTimeFieldType getFieldType(int i);

	public abstract int getValue(int i);

	public abstract int hashCode();

	public abstract boolean isSupported(DateTimeFieldType datetimefieldtype);

	public abstract int size();

	public abstract DateTime toDateTime(ReadableInstant readableinstant);

	public abstract String toString();
}
