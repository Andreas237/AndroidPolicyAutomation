// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;


public interface ConfigFeature
{

	public abstract boolean enabledByDefault();

	public abstract boolean enabledIn(int i);

	public abstract int getMask();
}
