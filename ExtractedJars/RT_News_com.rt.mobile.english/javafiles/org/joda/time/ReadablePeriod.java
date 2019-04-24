// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;


// Referenced classes of package org.joda.time:
//			DurationFieldType, PeriodType, MutablePeriod, Period

public interface ReadablePeriod
{

	public abstract boolean equals(Object obj);

	public abstract int get(DurationFieldType durationfieldtype);

	public abstract DurationFieldType getFieldType(int i);

	public abstract PeriodType getPeriodType();

	public abstract int getValue(int i);

	public abstract int hashCode();

	public abstract boolean isSupported(DurationFieldType durationfieldtype);

	public abstract int size();

	public abstract MutablePeriod toMutablePeriod();

	public abstract Period toPeriod();

	public abstract String toString();
}
