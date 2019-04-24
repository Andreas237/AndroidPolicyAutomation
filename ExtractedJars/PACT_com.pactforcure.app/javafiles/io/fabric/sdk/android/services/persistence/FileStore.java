// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.persistence;

import java.io.File;

public interface FileStore
{

	public abstract File getCacheDir();

	public abstract File getExternalCacheDir();

	public abstract File getExternalFilesDir();

	public abstract File getFilesDir();
}
