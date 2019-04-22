// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import java.io.File;

interface CrashFileManager
{

	public abstract void clearCrashFiles();

	public abstract File getLastWrittenCrashFile();

	public abstract File getNewCrashFile();
}
