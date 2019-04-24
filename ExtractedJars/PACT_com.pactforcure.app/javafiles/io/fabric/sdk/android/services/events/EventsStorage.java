// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.events;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface EventsStorage
{

	public abstract void add(byte abyte0[])
		throws IOException;

	public abstract boolean canWorkingFileStore(int i, int j);

	public abstract void deleteFilesInRollOverDirectory(List list);

	public abstract void deleteWorkingFile();

	public abstract List getAllFilesInRollOverDirectory();

	public abstract List getBatchOfFilesToSend(int i);

	public abstract File getRollOverDirectory();

	public abstract File getWorkingDirectory();

	public abstract int getWorkingFileUsedSizeInBytes();

	public abstract boolean isWorkingFileEmpty();

	public abstract void rollOver(String s)
		throws IOException;
}
