// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.dumpapp;


// Referenced classes of package com.facebook.stetho.dumpapp:
//			DumpException, DumperContext

public interface DumperPlugin
{

	public abstract void dump(DumperContext dumpercontext)
		throws DumpException;

	public abstract String getName();
}
