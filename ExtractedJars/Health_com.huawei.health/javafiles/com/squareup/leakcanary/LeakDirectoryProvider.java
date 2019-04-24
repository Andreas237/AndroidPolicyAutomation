// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public interface LeakDirectoryProvider
{

	public abstract void clearLeakDirectory();

	public abstract List listFiles(FilenameFilter filenamefilter);

	public abstract File newHeapDumpFile();
}
