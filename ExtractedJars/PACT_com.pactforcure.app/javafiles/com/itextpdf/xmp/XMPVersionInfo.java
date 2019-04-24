// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;


public interface XMPVersionInfo
{

	public abstract int getBuild();

	public abstract int getMajor();

	public abstract String getMessage();

	public abstract int getMicro();

	public abstract int getMinor();

	public abstract boolean isDebug();
}
