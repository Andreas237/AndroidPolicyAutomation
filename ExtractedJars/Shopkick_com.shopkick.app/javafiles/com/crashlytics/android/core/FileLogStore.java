// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			ByteString

interface FileLogStore
{

	public abstract void closeLogFile();

	public abstract void deleteLogFile();

	public abstract ByteString getLogAsByteString();

	public abstract byte[] getLogAsBytes();

	public abstract void writeToLog(long l, String s);
}
