// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;


public interface ExclusionFilterable
{

	public abstract void clearFilters();

	public abstract void filterOut(String s);

	public abstract void unfilter(String s);
}
