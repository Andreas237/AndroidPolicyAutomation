// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.log;


public interface Counter
{

	public abstract Counter getCounter(Class class1);

	public abstract void read(long l);

	public abstract void written(long l);
}
