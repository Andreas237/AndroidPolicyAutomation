// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;


// Referenced classes of package com.getkeepsafe.relinker:
//			ReLinker

public static interface ReLinker$LibraryLoader
{

	public abstract void loadLibrary(String s);

	public abstract void loadPath(String s);

	public abstract String mapLibraryName(String s);

	public abstract String[] supportedAbis();

	public abstract String unmapLibraryName(String s);
}
