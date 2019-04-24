// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;


// Referenced classes of package com.facebook.stetho.common:
//			LogRedirector

public static interface LogRedirector$Logger
{

	public abstract boolean isLoggable(String s, int i);

	public abstract void log(int i, String s, String s1);
}
