// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.logger;


public interface OLogImpl
{

	public abstract void d(String s, String s1);

	public abstract void d(String s, String s1, Throwable throwable);

	public abstract void e(String s, String s1);

	public abstract void e(String s, String s1, Throwable throwable);

	public abstract void i(String s, String s1);

	public abstract void i(String s, String s1, Throwable throwable);

	public abstract void w(String s, String s1);

	public abstract void w(String s, String s1, Throwable throwable);
}
