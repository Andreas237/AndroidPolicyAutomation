// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.File;
import java.util.Map;

interface Report
{

	public abstract Map getCustomHeaders();

	public abstract File getFile();

	public abstract String getFileName();

	public abstract File[] getFiles();

	public abstract String getIdentifier();

	public abstract void remove();
}
