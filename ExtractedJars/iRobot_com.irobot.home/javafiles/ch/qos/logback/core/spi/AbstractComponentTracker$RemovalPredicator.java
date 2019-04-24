// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.spi;


// Referenced classes of package ch.qos.logback.core.spi:
//			AbstractComponentTracker

private static interface AbstractComponentTracker$RemovalPredicator
{

	public abstract boolean isSlatedForRemoval(AbstractComponentTracker.Entry entry, long l);
}
