// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import java.io.File;
import java.io.IOException;

interface FileIdStrategy
{

	public abstract String getId(File file)
		throws IOException;
}
