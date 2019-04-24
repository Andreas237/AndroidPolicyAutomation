// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.joda.time;


// Referenced classes of package org.joda.time:
//			Duration, Period

public interface ReadableDuration
	extends Comparable
{

	public abstract boolean equals(Object obj);

	public abstract long getMillis();

	public abstract int hashCode();

	public abstract boolean isEqual(ReadableDuration readableduration);

	public abstract boolean isLongerThan(ReadableDuration readableduration);

	public abstract boolean isShorterThan(ReadableDuration readableduration);

	public abstract Duration toDuration();

	public abstract Period toPeriod();

	public abstract String toString();
}
